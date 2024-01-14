// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.DataLogging;
import frc.robot.RobotContainer;
import frc.robot.subsystems.HopperSubsystem;

public class IncrementHopperCommand extends CommandBase {
  // private Timer timer_;
  private double speed_;
  private HopperSubsystem hopperSubsystem_ = null;
  private boolean initialState_;
  private int increment_;
  private boolean lastState_;
  private boolean thisState_;

  /** Creates a new IncrementHopperCommand. */
  public IncrementHopperCommand(double speed, RobotContainer robotContainer) {
    hopperSubsystem_ = robotContainer.getHopperSubsystem();
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(hopperSubsystem_);
    this.speed_ = speed;
    DataLogging.getInstance().logCommand(this.hopperSubsystem_.getName(), this.getName(), this);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    SmartDashboard.getBoolean("Initial Hopper Code", true);

    /*
        timer_ = new Timer();
        timer_.schedule(new TimerTask() {
          @Override
          public void run() {
            SmartDashboard.putString("Hopper status", " Test ***Hopper Jammed***");
            end(false);
          }
        }, 750L);
    */

    initialState_ = hopperSubsystem_.getHopperSwitchState();
    lastState_ = hopperSubsystem_.getHopperSwitchState();
    increment_ = 0;
    SmartDashboard.getBoolean("Initial Hopper Switch", initialState_);
    hopperSubsystem_.driveHopper(speed_);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    thisState_ = hopperSubsystem_.getHopperSwitchState();
    // SmartDashboard.putNumber("Hopper Switch", thisState_);
    //    SmartDashboard.putNumber(key "HopperSwitch",thisState_);
    if (thisState_ != lastState_) {
      increment_++;
      lastState_ = thisState_;
    }
    // hopperSubsystem_.driveHopper(speed_);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    hopperSubsystem_.driveHopper(0);
    // timer_.cancel();
    if (initialState_) increment_ = 1;
    else increment_ = 2;
  }

  // Returns true when the command should end.
  // Should stop rotation after we have moved past on switch (open-close) cycle
  @Override
  public boolean isFinished() {
    boolean passed1;
    boolean passed2;
    passed1 = increment_ >= 1;
    passed2 = thisState_ != lastState_;
    return (passed1);
  }
}
