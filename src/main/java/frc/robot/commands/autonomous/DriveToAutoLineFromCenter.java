/*----------------------------------------------------------------------------*/
/* Copyright (c) 2020 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.autonomous;

import frc.robot.commands.DriveDistance;
import frc.robot.commands.RotateToAngle;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandGroupBase;

public class DriveToAutoLineFromCenter extends CommandGroupBase {

    public DriveToAutoLineFromCenter() {
        sequence(new AutonomousStart(),new DriveDistance(AutonomousConstants.FOOT),
                new RotateToAngle(18.4), new DriveDistance(84));
    }

    @Override
    public void addCommands(Command... commands) {

    }
}