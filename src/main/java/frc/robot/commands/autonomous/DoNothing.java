package frc.robot.commands.autonomous;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandGroupBase;

public class DoNothing extends CommandGroupBase {

    public DoNothing() {
        sequence(new AutonomousStart());
    }

    @Override
    public void addCommands(Command... commands) {

    }
}