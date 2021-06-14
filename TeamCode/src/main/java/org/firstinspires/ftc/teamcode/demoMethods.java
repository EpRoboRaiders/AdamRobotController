package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

public class DemoMethods {


    public hardware robotChassis = new hardware();
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

    public void forward(double inches) {
       robotChassis.encoderDrive(0.25,inches,inches,5);

    }

    public void backward(double inches) {
        robotChassis.encoderDrive(0.25,-inches,-inches,5);

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

    public void playSound(SoundPlayer.Sounds soundName) {


        switch(soundName) {

            case APPLE_CRUNCH:
                soundPlayer.playSoundByID(soundPlayer.appleCrunchSoundID);
                break;
            case BURP:
                soundPlayer.playSoundByID(soundPlayer.burpSoundID);
                break;
            case CAR_REV:
                soundPlayer.playSoundByID(soundPlayer.carRevSoundID);
                break;
            case DUCK_TAPE:
                soundPlayer.playSoundByID(soundPlayer.ducktapeSoundID);
                break;
            case GOAT_SCREAM:
                soundPlayer.playSoundByID(soundPlayer.goatScreamSoundID);
                break;
            case POP:
                soundPlayer.playSoundByID(soundPlayer.popSoundID);
                break;
            case ROBOT_VOICE:
                soundPlayer.playSoundByID(soundPlayer.robotVoiceSoundID);
                break;
            case R2D2:
                soundPlayer.playSoundByID(soundPlayer.r2d2SoundID);
                break;
            case TIRE_SQUEAL:
                soundPlayer.playSoundByID(soundPlayer.tireSquealSoundID);
                break;
            default: //case WILHELM_SCREAM:
                soundPlayer.playSoundByID(soundPlayer.wilhelmScreamSoundID);
                break;

        }
    }



}
