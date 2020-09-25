package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Robot {

    DcMotor topLeft;
    DcMotor bottomLeft;
    DcMotor topRight;
    DcMotor bottomRight;
    DcMotor aSupport;
    DcMotor bSupport;

    public void hardware(HardwareMap hardwareMap){
        topLeft = hardwareMap.get(DcMotor.class, "top_left");
        bottomLeft = hardwareMap.get(DcMotor.class, "bottom_left");
        topRight = hardwareMap.get(DcMotor.class, "top_right");
        bottomRight = hardwareMap.get(DcMotor.class, "bottom_right");

        topLeft.setDirection(DcMotor.Direction.REVERSE);
        bottomLeft.setDirection(DcMotor.Direction.REVERSE);

        aSupport = hardwareMap.get(DcMotor.class, "aSupport");
        bSupport = hardwareMap.get(DcMotor.class, "bSupport");

        aSupport.setDirection(DcMotor.Direction.REVERSE);
    }
    public void driveForward(double power){
        topLeft.setPower(power);
        bottomLeft.setPower(power);
        topRight.setPower(power);
        bottomRight.setPower(power);
    }
    public void driveBack(double power) {
        topLeft.setPower(-power);
        bottomLeft.setPower(-power);
        topRight.setPower(-power);
        bottomRight.setPower(-power);
    }
    public void turnLeft(double power){
        topLeft.setPower(power);
        bottomLeft.setPower(power);
        topRight.setPower(-power);
        bottomRight.setPower(-power);
    }
    public void turnRight(double power){
        topRight.setPower(power);
        bottomRight.setPower(power);
        topLeft.setPower(-power);
        bottomLeft.setPower(-power);

    }
    public void stopDriving(){
        topLeft.setPower(0);
        topRight.setPower(0);
        bottomRight.setPower(0);
        bottomLeft.setPower(0);
    }
    public void encodersForward(double inches, double power){
        topLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        bottomLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        topRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        bottomRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        topLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        bottomLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        topRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        bottomRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        topLeft.setTargetPosition((int)(114.591559*inches));
        bottomLeft.setTargetPosition((int)(114.591559*inches));
        topRight.setTargetPosition((int)(114.591559*inches));
        bottomRight.setTargetPosition((int)(114.591559*inches));

        topLeft.setPower(power);
        topRight.setPower(power);
        bottomRight.setPower(power);
        bottomLeft.setPower(power);

        while(topLeft.isBusy() && topRight.isBusy() && bottomLeft.isBusy() && bottomRight.isBusy()){
        }

        stopDriving();
    }
}
