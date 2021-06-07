package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;


@Autonomous(name="Programming Demo", group="Linear Opmode")
// @Disabled
public class ProgrammingDemo extends LinearOpMode {

    DemoMethods dm = new DemoMethods();


    public final String R2D2 = "r2d2";
    public final String APPLE_CRUNCH = "appleCrunch";
    public final String TIRE_SQUEAL = "tireSqueal";
    public final String WILHELM_SCREAM = "wilhelmScream";
    public final String GOAT_SCREAM = "goatScream";
    public final String BURP = "burp";
    public final String POP = "pop";
    public final String CAR_REV = "carRev";
    public final String ROBOT_VOICE = "robotVoice";

    public void runOpMode() {
        dm.init(hardwareMap);

        telemetry.addData("Status", "Ready to Go!");
        telemetry.update();
        waitForStart();

        dm.forward(1);
        dm.backward(1);
        dm.pause(1);
        dm.playSound(WILHELM_SCREAM);

    }


}
