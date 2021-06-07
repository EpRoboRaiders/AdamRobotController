package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

public class DemoMethods {







    hardware robotChassis = new hardware();
    SoundPlayer soundPlayer = new SoundPlayer();
    ElapsedTime methodTime = new ElapsedTime();

    HardwareMap hwMap           =  null;

    public DemoMethods() {

    }

    public void init(HardwareMap ahwMap) {
        hwMap = ahwMap;
        soundPlayer.init(hwMap);
        robotChassis.init(hwMap);
    }

    public void forward(double seconds) {
        methodTime.reset();
        robotChassis.leftDrive.setPower(0.25);
        robotChassis.rightDrive.setPower(0.25);
        while (methodTime.seconds() < seconds) {}
        robotChassis.leftDrive.setPower(0);
        robotChassis.rightDrive.setPower(0);
    }

    public void backward(double seconds) {
        methodTime.reset();
        robotChassis.leftDrive.setPower(-0.25);
        robotChassis.rightDrive.setPower(-0.25);
        while (methodTime.seconds() < seconds) {}
        robotChassis.leftDrive.setPower(0);
        robotChassis.rightDrive.setPower(0);
    }

    public void turnLeft (double seconds) {
        methodTime.reset();
        robotChassis.leftDrive.setPower(-0.25);
        robotChassis.rightDrive.setPower(0.25);
        while (methodTime.seconds() < seconds) {}
        robotChassis.leftDrive.setPower(0);
        robotChassis.rightDrive.setPower(0);
    }

    public void turnRight (double seconds) {
        methodTime.reset();
        robotChassis.leftDrive.setPower(0.25);
        robotChassis.rightDrive.setPower(-0.25);
        while (methodTime.seconds() < seconds) {}
        robotChassis.leftDrive.setPower(0);
        robotChassis.rightDrive.setPower(0);
    }

    public void pause(double seconds) {
        methodTime.reset();
        while (methodTime.seconds() < seconds) {}
    }

    public void playSound(String soundName) {
        switch(soundName) {
            case "r2d2":
                soundPlayer.playSoundByID(soundPlayer.r2d2SoundID);
                break;
            case "appleCrunch":
                soundPlayer.playSoundByID(soundPlayer.appleCrunchSoundID);
                break;
            case "tireSqueal":
                soundPlayer.playSoundByID(soundPlayer.tireSquealSoundID);
                break;
            case "wilhelmScream":
                soundPlayer.playSoundByID(soundPlayer.wilhelmScreamSoundID);
                break;
            case "goatScream":
                soundPlayer.playSoundByID(soundPlayer.goatScreamSoundID);
                break;
            case "burp":
                soundPlayer.playSoundByID(soundPlayer.burpSoundID);
                break;
            case "pop":
                soundPlayer.playSoundByID(soundPlayer.popSoundID);
                break;
            case "carRev":
                soundPlayer.playSoundByID(soundPlayer.carRevSoundID);
                break;
            default: //case "robotVoice":
                soundPlayer.playSoundByID(soundPlayer.robotVoiceSoundID);
                break;

        }
    }



}
