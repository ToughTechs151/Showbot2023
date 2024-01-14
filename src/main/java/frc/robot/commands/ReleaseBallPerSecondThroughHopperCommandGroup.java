// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.DataLogging;
import frc.robot.RobotContainer;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ReleaseBallPerSecondThroughHopperCommandGroup extends ParallelCommandGroup {
  /** Creates a new ReleaseBallPerSecondThroughHopperCommandGroup. */
  public ReleaseBallPerSecondThroughHopperCommandGroup(RobotContainer robotContainer) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(new IncrementHopperCommand(0.35, robotContainer), new WaitCommand(0.15));
    DataLogging.getInstance().logCommand(this.getName(), this);
  }
}
