/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1751.robot;

import org.usfirst.frc.team1751.robot.commands.ArmDown;
import org.usfirst.frc.team1751.robot.commands.ArmUp;
import org.usfirst.frc.team1751.robot.commands.CubeDelivery;
import org.usfirst.frc.team1751.robot.commands.GrabberIn;
import org.usfirst.frc.team1751.robot.commands.GrabberOut;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	private Joystick drivestick;
	private Joystick armstick;
	private Button armUp;
	private Button armDown;
	private Button grabberIn;
	private Button grabberOut;
	private Button deliverCube;
	
	public OI(){
		drivestick = new Joystick(RobotMap.DRIVE_STICK);
		armstick = new Joystick(RobotMap.ARM_STICK);
		armUp = new JoystickButton(armstick, RobotMap.B_ARMUP);
		armDown = new JoystickButton(armstick, RobotMap.B_ARMDOWN);
		grabberIn = new JoystickButton(armstick, RobotMap.B_GRABBERIN);
		grabberOut = new JoystickButton(armstick, RobotMap.B_GRABBEROUT);
		deliverCube = new JoystickButton(armstick, RobotMap.B_CUBEDELIVEREY);
		armUp.whileHeld(new ArmUp());
		armDown.whileHeld(new ArmDown());
		grabberIn.whileHeld(new GrabberIn());
		grabberOut.whileHeld(new GrabberOut());
		deliverCube.whenPressed(new CubeDelivery());
	}
	
	public Joystick getDriveStick(){
		return drivestick;
	}
	
	public Joystick getArmStick() {
		return armstick;
	}
}
