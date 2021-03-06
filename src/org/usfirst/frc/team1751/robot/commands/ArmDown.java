package org.usfirst.frc.team1751.robot.commands;

import org.usfirst.frc.team1751.robot.Robot;
import org.usfirst.frc.team1751.robot.subsystems.Arm;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ArmDown extends Command {
	

    public ArmDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.arm.setArm(.2);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    		Robot.arm.setArm(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    		end();
    }
}
