// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  // Scale Factor
  public static final int SCALED_DRIVE = 2;

  // RELAY PORTS
  public static final int LED_RELAY = 0;

  // PWM Ports
  public static int FRONT_LEFT_MOTOR = 3;
  public static int FRONT_RIGHT_MOTOR = 6;
  public static int REAR_LEFT_MOTOR = 2;
  public static int REAR_RIGHT_MOTOR = 4;

  // OI ports
  public static int DRIVER_OI = 0;
  public static int CODRIVE_OI = 1;

  // OI AXES
  public static final int LEFT_JOYSTICK_X = 0;
  public static final int LEFT_JOYSTICK_Y = 1;
  public static final int RIGHT_JOYSTICK_X = 4;
  public static final int RIGHT_JOYSTICK_Y = 5;
  public static final int LEFT_TRIGGER = 2;
  public static final int RIGHT_TRIGGER = 3;
  public static final int RIGHT_JOYSTICK_VERTICAL_AXIS = 5;

  // OI BUTTON PORTS
  public static final int A = 1;
  public static final int B = 2;
  public static final int X = 3;
  public static final int Y = 4;
  public static final int LEFT_BUMPER = 5;
  public static final int RIGHT_BUMPER = 6;
  public static final int BACK = 7;
  public static final int START = 8;
  public static final int LEFT_JOYSTICK = 9;
  public static final int RIGHT_JOYSTICK = 10;

  // hopper
  public static final int HOPPER_SWITCH = 0;
  public static final int HOPPER_MOTOR = 0;

  // launcher
  public static final int LAUNCHER_MOTOR = 7;
  public static final int LAUNCHER_ENCODER_A = 1;
  public static final int LAUNCHER_ENCODER_B = 2;
  // set launcher speed at (unknown unit)
  public static final double LAUNCHER_SPEED = -2700;
  ;

  // PID CONSTANTS
  // public static final double kPl = 0.001;
  // public static final double kIl = 0.0001;
  // public static final double kDl = 0;
  // PID CONSTANTS
  public static final double kPl = 0.2;
  public static final double kIl = 0.001;

  public static final double kDl = 0;

  // Run time options

  // Set to true to log Joystick data. To false otherwise.
  public static final boolean LOG_JOYSTICK_DATA = true;

  // Set to true to send telemetry data to Live Window. To false
  // to disable it.
  public static final boolean LW_TELEMETRY_ENABLE = false;

  // Set to true to log loop timing data. To false to disable.
  public static final boolean LOOP_TIMING_LOG = true;
}
