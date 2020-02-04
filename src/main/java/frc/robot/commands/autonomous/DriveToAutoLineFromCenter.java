/*----------------------------------------------------------------------------*/
/* Copyright (c) 2020 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.autonomous;

import frc.robot.commands.DriveDistance;
import frc.robot.commands.RotateToAngle;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class DriveToAutoLineFromCenter extends CommandGroup {

    public DriveToAutoLineFromCenter() {
    	addSequential(new AutonomousStart());
    	//addSequential(new DriveDistance((AutonomousConstants.AUTO_LINE - AutonomousConstants.ROBOT_LENGTH) 
    			//+ AutonomousConstants.FOOT));
    	addSequential(new DriveDistance(AutonomousConstants.FOOT));
    	addSequential(new RotateToAngle(18.4));
    	addSequential(new DriveDistance(84));
    	
    }
}
