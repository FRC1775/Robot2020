/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SendableBuilder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;
import frc.robot.commands.Drive;
import frc.robot.commands.TurnIncrement;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
  public class MotorSubsystem implements Subsystem {
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private final static double RAMP_TIME = 400;
  long startTime = 0;
<<<<<<< HEAD
  double rampFactor; 
  
  
	private enum DriveMode {
		Regular, RotateToAngle, DriveToDistance
  }

  private static DriveMode driveMode = DriveMode.Regular;

  private void setDriveMode(DriveMode mode) {
		if (driveMode == mode)
			return;

		driveMode = mode;
	}
	

  @Override
  public void initDefaultCommand() {
=======
  double rampFactor;  
 
   public void initDefaultCommand() {
>>>>>>> 4bcb334891350f3aab14b686fd883d5e83008211
    // Set the default command for a subsystem here.
    setDefaultCommand(new Drive());
  }
  
  public void drive(double yVal , double xVal){
    double moveValue = -yVal; 
    double turnValue = xVal;
    // long rampFactor; 


    // we're trying to move
    if(yVal < -0.1 || yVal > 0.1){
      turnValue = moveValue * xVal;
      // System.out.println("we're trying to move");
    }else{
    
      // we aren't trying to move or turn
      if(xVal < 0.1 && xVal > -0.1 ){
        startTime = System.currentTimeMillis();
        rampFactor = 0;
        // System.out.println("we aren't trying to move or turn");

      }

      // we're trying to turn but not move
      // System.out.println("we're trying to turn but not move");

      rampFactor = Math.min(1, (System.currentTimeMillis() - startTime) / RAMP_TIME);
      turnValue = rampFactor * xVal * 0.8;
      moveValue = 0;
      SmartDashboard.putNumber("Current Time", System.currentTimeMillis());
      SmartDashboard.putNumber("Start Time", startTime);
      SmartDashboard.putNumber("Ramp Factor", (double) rampFactor);
    }
    // runs regardless of whether we want to move or turn
    if(TurnIncrement.scaleTurning == true){
      RobotMap.drive.arcadeDrive(moveValue, turnValue * 0.6);
    } else {
    RobotMap.drive.arcadeDrive(moveValue, turnValue);
    }
  }

  public double getDistance() {
		SmartDashboard.putNumber("LeftEncoder", RobotMap.driveEncoderLeft.getDistance());
		SmartDashboard.putNumber("RightEncoder", -RobotMap.driveEncoderRight.getDistance());
		return ((RobotMap.driveEncoderLeft.getDistance() - RobotMap.driveEncoderRight.getDistance()) / 2.0);
  }

  public void setDriveDistance(double distance) {
    setDriveMode(DriveMode.DriveToDistance);
  }

  public void driveDistance() {
		SmartDashboard.putNumber("Distance", getDistance());
  }
  
  public void stop() {
		RobotMap.drive.stopMotor();
  }
  
  public void setRotateAngle(double angle) {
		setDriveMode(DriveMode.RotateToAngle);
  }

  public void rotateAngle() {
		//something should probably go in here :|
	}


 

}