/*----------------------------------------------------------------------------*/
/* Copyright (c) 2020 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import frc.robot.Robot;

public class DriveDistance extends Command {
	private double distance = 0;
	// private long startTime = 0;

	public DriveDistance(double distance) {
		requires(Robot.motorSubsystem);

		this.distance = distance;
	}

	@Override
	protected void initialize() {
		Robot.motorSubsystem.setDriveDistance(distance);
		// startTime = System.currentTimeMillis();
	}

	@Override
	protected void execute() {
		Robot.motorSubsystem.driveDistance();
	}

	@Override
	protected void interrupted() {
		Robot.motorSubsystem.stop();
	}

	@Override
	protected boolean isFinished() {
    return true;
		//needs to be changed!!>:(   )
	}

}