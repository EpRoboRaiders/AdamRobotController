package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.DemoMethods;
import org.firstinspires.ftc.teamcode.OneShot;

@TeleOp(name="Encoder Test", group="Linear Opmode")
// @Disabled
public class EncoderTest extends OpMode {

    DemoMethods demoMethods = new DemoMethods();

    ElapsedTime driveTimer = new ElapsedTime();

    OneShot aPressed = new OneShot();
    OneShot bPressed = new OneShot();
    OneShot xPressed = new OneShot();
    OneShot yPressed = new OneShot();
    OneShot leftBumperPressed = new OneShot();
    OneShot leftTriggerPressed = new OneShot();
    OneShot rightBumperPressed = new OneShot();
    OneShot rightTriggerPressed = new OneShot();
    OneShot leftStickButtonPressed = new OneShot();
    OneShot rightStickButtonPressed = new OneShot();

    private final int TIMER_LENGTH = 60;

    public void init() {
        demoMethods.init(hardwareMap);
    }

    public void start() {
        driveTimer.reset();
    }

    public void loop() {

        telemetry.addData("Left Motor", demoMethods.robotChassis.leftDrive.getCurrentPosition());
        telemetry.addData("Right Motor", demoMethods.robotChassis.rightDrive.getCurrentPosition());
        telemetry.update();


    }
}