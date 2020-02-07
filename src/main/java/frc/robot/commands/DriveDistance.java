/*----------------------------------------------------------------------------*/
/* Copyright (c) 2020 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import java.util.Set;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Robot;
import frc.robot.subsystems.MotorSubsystem;

public class DriveDistance implements Command {
	private double distance = 0;
	// private long startTime = 0;

	public DriveDistance(double distance) {
		requires(Robot.motorSubsystem);

		this.distance = distance;
	}

	private void requires(MotorSubsystem motorSubsystem) {
	}

	@Override
	public void initialize() {
		Robot.motorSubsystem.setDriveDistance(distance);
		// startTime = System.currentTimeMillis();
	}

	@Override
	public void execute() {
		Robot.motorSubsystem.driveDistance();
	}

	@Override
	public boolean isFinished() {
  		return true;
		// needs to be changed!!>:( )
	}

	public Set<Subsystem> getRequirements() {
		return null;
	}

}