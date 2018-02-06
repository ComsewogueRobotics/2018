package org.usfirst.frc.team1751.robot.commands;

import org.usfirst.frc.team1751.robot.subsystems.Arm;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ArmDown extends Command {
	
	private int joint;

    public ArmDown(int j) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    		joint = j;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		if (joint == 1) {
    			Arm.set_j1(-0.5);
    		}
    		if (joint == 2) {
    			Arm.set_j2(-0.5);
    		}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	if (joint == 1) {
			Arm.set_j1(0);
		}
		if (joint == 2) {
			Arm.set_j2(0);
		}
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    		end();
    }
}
