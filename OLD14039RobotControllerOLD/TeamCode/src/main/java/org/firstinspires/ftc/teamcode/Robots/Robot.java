package org.firstinspires.ftc.teamcode.Robots;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Hardware.RobotHardware;

public abstract class Robot {
    protected RobotHardware hardware;
    public Robot(LinearOpMode opMode) {}
    public void initialize() {}
}