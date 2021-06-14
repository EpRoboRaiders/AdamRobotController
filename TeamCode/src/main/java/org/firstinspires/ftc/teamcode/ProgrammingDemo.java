package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import static org.firstinspires.ftc.teamcode.SoundPlayer.Sounds;
import static org.firstinspires.ftc.teamcode.hardware.COUNTS_PER_INCH;

@Autonomous(name="Programming Demo", group="Linear Opmode")
// @Disabled
public class ProgrammingDemo extends LinearOpMode {

    DemoMethods dm = new DemoMethods();

    public void runOpMode() {
        dm.init(hardwareMap);

        telemetry.addData("Status", "Ready to Go!");
        telemetry.update();
        waitForStart();

        encoderDrive(0.25, -10, -10, 5);
        //dm.backward(10);
        //dm.pause(1);
        //dm.playSound(Sounds.APPLE_CRUNCH);




    }
    public void encoderDrive(double speed,
                             double leftInches, double rightInches,
                             double timeoutS) {
        int newLeftTarget;
        int newRightTarget;

        // Determine new target position, and pass to motor controller
        newLeftTarget = dm.robotChassis.leftDrive.getCurrentPosition() - (int)(leftInches * COUNTS_PER_INCH);
        newRightTarget = dm.robotChassis.rightDrive.getCurrentPosition() - (int)(rightInches * COUNTS_PER_INCH);
        dm.robotChassis.leftDrive.setTargetPosition(newLeftTarget);
        dm.robotChassis.rightDrive.setTargetPosition(newRightTarget);

        // Turn On RUN_TO_POSITION
        dm.robotChassis.leftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        dm.robotChassis.rightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        // reset the timeout time and start motion.
        dm.robotChassis.timeout.reset();
        dm.robotChassis.leftDrive.setPower(Math.abs(speed));
        dm.robotChassis.rightDrive.setPower(Math.abs(speed));

        // keep looping while we are still active, and there is time left, and both motors are running.
        // Note: We use (isBusy() && isBusy()) in the loop test, which means that when EITHER motor hits
        // its target position, the motion will stop.  This is "safer" in the event that the robot will
        // always end the motion as soon as possible.
        // However, if you require that BOTH motors have finished their moves before the robot continues
        // onto the next step, use (isBusy() || isBusy()) in the loop test.
        while ((dm.robotChassis.timeout.seconds() < timeoutS) &&
                (dm.robotChassis.leftDrive.isBusy() && dm.robotChassis.rightDrive.isBusy())) {

            telemetry.addData("Left Motor", dm.robotChassis.leftDrive.getCurrentPosition());
            telemetry.addData("Right Motor", dm.robotChassis.rightDrive.getCurrentPosition());
            telemetry.update();
        }

        // Stop all motion;
        dm.robotChassis.leftDrive.setPower(0);
        dm.robotChassis.rightDrive.setPower(0);

        // Turn off RUN_TO_POSITION
        dm.robotChassis.leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        dm.robotChassis.rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        //  sleep(250);   // optional pause after each move


    }

}
