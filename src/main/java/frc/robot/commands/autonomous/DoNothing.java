package frc.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class DoNothing extends CommandGroup {

	public DoNothing() {
		addSequential(new AutonomousStart());
	}
}