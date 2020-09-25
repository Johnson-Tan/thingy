package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by FTC on 10/24/2018.
 */
@TeleOp (name = "CosmoLancers")
public class CrimsonTele extends OpMode {

    Robot robot = new Robot();

    @Override
    public void init() {
        gamepad1.setJoystickDeadzone(0.1f);
        gamepad2.setJoystickDeadzone(0.1f);

        robot.hardware(hardwareMap);

    }
    @Override
    public void loop() {
        double LeftStickY = -(gamepad1.left_stick_y);
        double RightStickY = -(gamepad1.right_stick_y);
        boolean ButtonA = gamepad2.a;
        boolean ButtonB = gamepad2.b;

        robot.topLeft.setPower(LeftStickY);
        robot.bottomLeft.setPower(LeftStickY);
        robot.topRight.setPower(RightStickY);
        robot.bottomRight.setPower(RightStickY);

        if (ButtonA == true) {
            robot.aSupport.setPower(0.75);
            robot.bSupport.setPower(0.75);

        } else {
            robot.aSupport.setPower(0);
            robot.bSupport.setPower(0);

        }

        if (ButtonB == true) {
            robot.aSupport.setPower(-1);
            robot.bSupport.setPower(-1);

        } else {
            robot.aSupport.setPower(0);
            robot.bSupport.setPower(0);

        }

    }
}



