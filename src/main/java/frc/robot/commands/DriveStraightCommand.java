// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.DataLogging;
import frc.robot.RobotContainer;
import frc.robot.subsystems.ChassisSubsystem;

public class DriveStraightCommand extends CommandBase {
  private ChassisSubsystem chassisSubsystem_ = null;
  private RobotContainer robotContainer_ = null;
  /** Creates a new DriveStraightCommand. */
  public DriveStraightCommand(RobotContainer robotContainer) {
    robotContainer_ = robotContainer;
    chassisSubsystem_ = robotContainer.getChassisSubsystem();
    // Use addRequirements() here to declare subsystem dependencies.
    // TODO Why no requirement?
    DataLogging.getInstance().logCommand(this.chassisSubsystem_.getName(), this.getName(), this);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    chassisSubsystem_.driveStraight(robotContainer_.getDriverOi(), Constants.SCALED_DRIVE);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
