// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.DataLogging;
import frc.robot.RobotContainer;
import frc.robot.subsystems.LauncherPIDSubsystem;

public class DisableLauncherCommand extends CommandBase {
  private boolean isFinished_ = false;
  private LauncherPIDSubsystem launcherPIDSubsystem_ = null;

  /** Creates a new DisableElevatorCommand. */
  public DisableLauncherCommand(RobotContainer robotConmtContainer) {
    launcherPIDSubsystem_ = robotConmtContainer.getLauncherPIDSubsystem();
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(launcherPIDSubsystem_);
    DataLogging.getInstance().logCommand(this.launcherPIDSubsystem_.getName(), this.getName(), this);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    launcherPIDSubsystem_.disable();
    launcherPIDSubsystem_.stop();
    isFinished_ = true;
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return isFinished_;
  }
}
