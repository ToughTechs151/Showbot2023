// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.DataLogging;
import frc.robot.oi.DriverOI;
import frc.robot.subsystems.ChassisSubsystem;

public class DriveWithJoystickCommand extends CommandBase {

  private ChassisSubsystem chassisSubsystem_ = null;
  private DriverOI driverOI_ = null;

  /** Creates a new DriveWithJoystickCommand. */
  public DriveWithJoystickCommand(ChassisSubsystem chassisSubsystem, DriverOI driverOI) {
    // Use addRequirements() here to declare subsystem dependencies.
    chassisSubsystem_ = chassisSubsystem;
    driverOI_ = driverOI;
    addRequirements(chassisSubsystem_);
    DataLogging.getInstance().logCommand(this.chassisSubsystem_.getName(), this.getName(), this);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    chassisSubsystem_.drive(driverOI_, Constants.SCALED_DRIVE);
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
