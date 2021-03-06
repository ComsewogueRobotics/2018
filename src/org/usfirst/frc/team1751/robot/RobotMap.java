/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1751.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static final int D_LEFT_1 = 1;
	public static final int D_LEFT_2 = 2;
	public static final int D_RIGHT_1 = 4;
	public static final int D_RIGHT_2 = 5;
	
	public static final int ARM_M1 = 5;
	public static final int ARM_M2 = 6;
	public static final int GRABBER_M1 = 1;
	public static final int GRABBER_M2 = 2;
	
	public static final int DRIVE_STICK = 0;
	public static final int ARM_STICK = 1;
	
	public static final int B_ARMUP = 3;
	public static final int B_ARMDOWN = 2;
	public static final int B_GRABBERIN = 1;
	public static final int B_GRABBEROUT = 4;
	public static final int B_CUBEDELIVEREY = 5;
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
