/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import java.util.Set;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Robot;
import frc.robot.OI;

/**
 * Gets the values of the joysticks on the first driver's controller.
 * The left joystick controls our forward/backward movement, and the right joystick controls turning. 
 */
public class Drive implements Command {

  public Drive() {
    // Use requires() here to declare subsystem dependencies
//    requires(Robot.motorSubsystem);
  }

  // Called just before this Command runs the first time
  
  public void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  
  public void execute() {

    double yVal = OI.getLeftJoystick();
    double xVal = OI.getRightJoystick();

    Robot.motorSubsystem.drive(yVal, xVal);
     
  }
  
  public void end() {
 }
  
 
  
  public boolean isFinished() {
    return false;
  }
  
  public Set<Subsystem> getRequirements() {
		// TODO Auto-generated method stub
		return null;
	}
}
