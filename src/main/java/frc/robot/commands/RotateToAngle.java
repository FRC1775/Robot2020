package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class RotateToAngle extends Command{
	private double angle = 0;
	private long startTime = 0;
	
	public RotateToAngle(double angle) {
		requires(Robot.motorSubsystem);
		
		this.angle = angle;
	}
	
	@Override
	protected void initialize() {
		startTime = System.currentTimeMillis();
		Robot.motorSubsystem.setRotateAngle(this.angle);
	}
	
	@Override
	protected void execute() {
		Robot.motorSubsystem.rotateAngle();
	}

	@Override
	protected boolean isFinished() {
		return System.currentTimeMillis() - startTime > 500 && !RobotMap.gyro.isMoving();
	}
}