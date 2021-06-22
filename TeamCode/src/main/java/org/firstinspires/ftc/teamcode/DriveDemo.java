package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;
@TeleOp(name="Drive Demo", group="Linear Opmode")
// @Disabled
public class DriveDemo extends OpMode {

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

    private final int TIMER_LENGTH = 90;

    public void init() {
        demoMethods.init(hardwareMap);
    }

    public void start() {
        driveTimer.reset();
    }

    public void loop() {
        if (driveTimer.seconds() < TIMER_LENGTH) {

            demoMethods.robotChassis.leftDrive.setPower(-gamepad1.left_stick_y * 0.25);
            demoMethods.robotChassis.rightDrive.setPower(-gamepad1.right_stick_y * 0.25);

            telemetry.addData("Time Left", Math.round(TIMER_LENGTH-driveTimer.seconds()));
            telemetry.update();

            if (aPressed.checkState(gamepad1.a)) {
                demoMethods.playSound(SoundPlayer.Sounds.R2D2);
            }
            if (bPressed.checkState(gamepad1.b)) {
                demoMethods.playSound(SoundPlayer.Sounds.APPLE_CRUNCH);
            }
            if (xPressed.checkState(gamepad1.x)) {
                demoMethods.playSound(SoundPlayer.Sounds.TIRE_SQUEAL);
            }
            if (yPressed.checkState(gamepad1.y)) {
                demoMethods.playSound(SoundPlayer.Sounds.WILHELM_SCREAM);
            }
            if (leftBumperPressed.checkState(gamepad1.left_bumper)) {
                demoMethods.playSound(SoundPlayer.Sounds.GOAT_SCREAM);
            }
            if (leftTriggerPressed.checkState(gamepad1.left_trigger > 0.5)) {
                demoMethods.playSound(SoundPlayer.Sounds.BURP);
            }
            if (rightBumperPressed.checkState(gamepad1.right_bumper)) {
                demoMethods.playSound(SoundPlayer.Sounds.POP);
            }
            if (rightTriggerPressed.checkState(gamepad1.right_trigger > 0.5)) {
                demoMethods.playSound(SoundPlayer.Sounds.CAR_REV);
            }
            if (leftStickButtonPressed.checkState(gamepad1.left_stick_button)) {
                demoMethods.playSound(SoundPlayer.Sounds.ROBOT_VOICE);
            }
            if (rightStickButtonPressed.checkState(gamepad1.right_stick_button)) {
                demoMethods.playSound(SoundPlayer.Sounds.DUCK_TAPE);
            }

        }
        else {
            demoMethods.robotChassis.leftDrive.setPower(0);
            demoMethods.robotChassis.rightDrive.setPower(0);
            telemetry.addData("Time Up", "Have a nice day!");
            telemetry.update();
        }
    }
}
