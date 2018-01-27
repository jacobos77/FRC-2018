package frc.team4159.robot.commands.drive;

import frc.team4159.robot.Robot;
import frc.team4159.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command {

    public TankDrive() {
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

        //Robot.drivetrain.setPercentOutput(OI.getLeftY(), OI.getRightY());
        if(OI.testPIDButton()) {
            Robot.drivetrain.setVelocity(0.25, 0);
        } else {
            Robot.drivetrain.setRawOutput(0,0);
        }
        Robot.drivetrain.logSmartDashboard();

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
