package org.usfirst.frc.team1751.robot.subsystems;

import org.usfirst.frc.team1751.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Arm extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private static SpeedController arm_m1;
	private static SpeedController arm_m2;
	private static SpeedControllerGroup arm;
	private static SpeedController grabber_m1;
	private static SpeedController grabber_m2;
	private static SpeedControllerGroup grabber;
	
	public Arm() {
		arm_m1 = new WPI_TalonSRX(RobotMap.ARM_M1);
		arm_m2 = new WPI_TalonSRX(RobotMap.ARM_M2);
		arm = new SpeedControllerGroup(arm_m1, arm_m2);
		grabber_m1 = new Spark(RobotMap.GRABBER_M1); //check whether it is spark or talon
		grabber_m2 = new Spark(RobotMap.GRABBER_M2); //check whether it is spark or talon
		grabber = new SpeedControllerGroup(grabber_m1, grabber_m2);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setArm(double speed) {
    		arm.set(speed);
    }
    
    public static void setGrabber(double speed) {
    		grabber.set(speed);
    }
    
}

