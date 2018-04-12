package org.usfirst.frc.team1751.robot.subsystems;

import org.usfirst.frc.team1751.robot.RobotMap;
import org.usfirst.frc.team1751.robot.commands.Drive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *		
 */
public class DriveTrain extends Subsystem {
	private SpeedController left_M1, left_M2, right_M1, right_M2;
	private DifferentialDrive DiffDrive;
	//private DifferentialDrive DiffDrive2;
	private SpeedControllerGroup m_left;
	private SpeedControllerGroup m_right;
	public DriveTrain(){
		left_M1 = new WPI_TalonSRX(RobotMap.D_LEFT_1);
		left_M2 = new WPI_TalonSRX(RobotMap.D_LEFT_2);
		right_M1 = new WPI_TalonSRX(RobotMap.D_RIGHT_1);
		right_M2 = new WPI_TalonSRX(RobotMap.D_RIGHT_2);
		m_left = new SpeedControllerGroup(left_M1, left_M2);
		m_right = new SpeedControllerGroup(right_M1, right_M2);
		DiffDrive = new DifferentialDrive(m_left, m_right);
		//DiffDrive2 = new DifferentialDrive(left_M1,left_M2);
		DiffDrive.setSafetyEnabled(false);
	}
	
	public void arcadeDrive (double move, double turn, boolean squaredInputs){
		DiffDrive.arcadeDrive(move,turn,squaredInputs);
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	setDefaultCommand(new Drive());
    	
    }
}

