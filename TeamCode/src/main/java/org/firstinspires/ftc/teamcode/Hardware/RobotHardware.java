package org.firstinspires.ftc.teamcode.Hardware;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public abstract class RobotHardware {

    public void hardwareMap(HardwareMap hardwareMap) {}
    public void initialize() {}

    // Hardware retriever methods
    public BNO055IMU getImu(String ID) {return null;}
    public double getImuHeading(String ID) {return 0.0;}
    public double getImuHeading() {return 0.0;}
    public double[] getImuAcc() {return new double[2];}

    public DcMotorEx getMotor(String ID) {return null;}
    public double getEncoderValue(String ID) {return 0.0;}
    public double getEncoderVelocity(String ID) {return 0.0;}

    public Servo getServo(String ID) {return null;}

    public void resetTimer() {}
    public double getTime() {return 0.0;}

}