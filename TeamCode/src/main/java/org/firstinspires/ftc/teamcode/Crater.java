package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
@Autonomous(name = "Crater")
public class Crater extends LinearOpMode   {
    Robot robot = new Robot();
    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();
        robot.hardware(hardwareMap);
        robot.encodersForward(30, 0.8);
    }


}
