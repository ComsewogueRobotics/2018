package org.usfirst.frc.team1751.robot.subsystems;

import org.usfirst.frc.team1751.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Arm extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private static SpeedController j1;
	private static SpeedController j2;
	
	public Arm() {
		j1 = new WPI_TalonSRX(RobotMap.ARM_J1);
		j2 = new WPI_TalonSRX(RobotMap.ARM_J2);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public static void set_j1(double speed) {
    		j1.set(speed);
    }
    
    public static void set_j2(double speed) {
    		j2.set(speed);
    }
}

