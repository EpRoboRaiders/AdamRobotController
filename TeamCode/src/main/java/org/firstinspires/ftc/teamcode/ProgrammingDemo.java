package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

import static org.firstinspires.ftc.teamcode.SoundPlayer.Sounds;

@Autonomous(name="Programming Demo", group="Linear Opmode")
// @Disabled
public class ProgrammingDemo extends LinearOpMode {

    DemoMethods dm = new DemoMethods();

    public void runOpMode() {
        dm.init(hardwareMap);

        telemetry.addData("Status", "Ready to Go!");
        telemetry.update();
        waitForStart();

        dm.forward(1);
        dm.backward(1);
        dm.pause(1);
        dm.playSound(Sounds.APPLE_CRUNCH);


    }


}
