package frc.robot.commands;

import java.util.Set;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;

/**
 * An example command.  You can replace me with your own command.
 */
public class TurnIncrement implements Command {
  public static boolean scaleTurning = false;

  // Called just before this Command runs the first time
  
  public void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  
  public void execute() {
        scaleTurning = true;
  }
  
  public void end() {
       scaleTurning = false;
  }
  
  public void interrupted() {
        scaleTurning = false;
  }

     public boolean isFinished() {
     return false;
  }


public Set<Subsystem> getRequirements() {
	// TODO Auto-generated method stub
	return null;
}

  // Make this return true when this Command no longer needs to run execute()

  // Called once after isFinished returns true
}
