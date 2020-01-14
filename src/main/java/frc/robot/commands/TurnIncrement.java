package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.FunctionalCommand;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.Robot;
import frc.robot.RobotMap;

/**
 * An example command.  You can replace me with your own command.
 */
public class TurnIncrement extends FunctionalCommand {
  public static boolean scaleTurning = false;
  public TurnIncrement() {
      super();
      // Use requires() here to declare subsystem dependencies
  }

  // Called just before this Command runs the first time
  @Override
  public void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  public void execute() {
        scaleTurning = true;
  }
  @Override
  public void end(boolean interrupted) {
       super.end(interrupted);
       scaleTurning = false;
  }

  @Override
  public boolean isFinished() {
     return false;
  }

  // Make this return true when this Command no longer needs to run execute()

  // Called once after isFinished returns true
}
