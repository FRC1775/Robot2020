package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.MotorSubsystem;

import java.util.Set;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;

public class RotateToAngle implements Command{
    private double angle = 0;
    private long startTime = 0;

    public RotateToAngle(double angle) {
        requires(Robot.motorSubsystem);

        this.angle = angle;
    }

    private void requires(MotorSubsystem motorSubsystem) {
    }

    @Override
    public void initialize() {
        startTime = System.currentTimeMillis();
        Robot.motorSubsystem.setRotateAngle(this.angle);
    }

    @Override
    public void execute() {
        Robot.motorSubsystem.rotateAngle();
    }

    @Override
    public boolean isFinished() {
        return System.currentTimeMillis() - startTime > 500 && !RobotMap.gyro.isMoving();
    }

    @Override
    public Set<Subsystem> getRequirements() {
        return null;
    }
}