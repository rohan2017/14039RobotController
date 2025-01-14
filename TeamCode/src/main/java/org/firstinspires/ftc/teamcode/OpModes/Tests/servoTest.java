package org.firstinspires.ftc.teamcode.OpModes.Tests;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp(name="Servo Tester", group="Testing")
public class servoTest extends LinearOpMode {

    private Servo testServo;
    private Servo testServo2;

    @Override
    public void runOpMode() {

        initialize();
        waitForStart();
        telemetry.addData("Status", "Running");
        telemetry.update();

        double r = 0;
        double p = 0;

        while (opModeIsActive()) {

            if(gamepad1.a){
                r = 0.5;
            }
            if(gamepad1.dpad_up){
                r += 0.0005;
            }
            if (gamepad1.dpad_down){
                r -= 0.0005;
            }
            if(gamepad2.a){
                p = 0.5;
            }
            if(gamepad2.dpad_up){
                p += 0.0005;
            }
            if (gamepad2.dpad_down){
                p -= 0.0005;
            }

            testServo.setPosition(r);
            testServo2.setPosition(p);

            telemetry.addData("Servo 1 Position", testServo.getPosition());
            telemetry.addData("Servo 2 Position", testServo2.getPosition());

            telemetry.update();

        }

    }

    private void initialize(){

        testServo = hardwareMap.servo.get("basketFlipper");
        testServo2 = hardwareMap.servo.get("rightFlipper");

        telemetry.addData("Status", "Initialized");
        telemetry.update();

    }

}