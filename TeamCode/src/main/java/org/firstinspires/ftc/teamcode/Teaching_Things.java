package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp (name = "Practice")
public class Teaching_Things extends OpMode{

    DcMotor  frontRight;
    DcMotor  backRight;
    DcMotor  frontLeft;
    DcMotor  backLeft;

    @Override
    public void init(){

        gamepad1.setJoystickDeadzone(0.1f);
        gamepad2.setJoystickDeadzone(0.1f);

        frontRight = (hardwareMap.get(DcMotor.class, "FrontRight"));
        backRight = (hardwareMap.get(DcMotor.class, "BackRight"));
        frontLeft = (hardwareMap.get(DcMotor.class, "FrontLeft"));
        backLeft = (hardwareMap.get(DcMotor.class, "BackLeft"));

        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        backLeft.setDirection(DcMotor.Direction.REVERSE);

    }

    @Override
    public void loop() {
        double LeftStickY = gamepad1.left_stick_y;
        double RightStickY = gamepad1.right_stick_y;

        frontRight.setPower(LeftStickY);
        backRight.setPower(LeftStickY);
        frontLeft.setPower(RightStickY);
        frontRight.setPower(RightStickY);
    }
}
