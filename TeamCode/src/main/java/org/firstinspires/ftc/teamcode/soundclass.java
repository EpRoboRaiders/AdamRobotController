package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp(name="Sound Test", group="Iterative Opmode")
//@Disabled
public class soundclass extends OpMode {

    public SoundPlayer soundPlayer = new SoundPlayer();

    @Override
    public void init() {
        soundPlayer.init(hardwareMap);
    }
    public void loop() {
        if (gamepad1.x) {
            soundPlayer.playSoundByID(soundPlayer.wilhelmScreamSoundID);
        }
        else if (gamepad1.y) {
            soundPlayer.playSoundByID(soundPlayer.goatScreamSoundID);
        }
    }
}