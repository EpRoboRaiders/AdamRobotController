package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

import java.io.FileNotFoundException;

public class SoundPlayer {
    // Declare OpMode members.

    public int appleCrunchSoundID = 0;
    public int burpSoundID = 0;
    public int carRevSoundID = 0;
    public int goatScreamSoundID = 0;
    public int popSoundID = 0;
    public int robotVoiceSoundID = 0;
    public int r2d2SoundID = 0;
    public int tireSquealSoundID = 0;
    public int wilhelmScreamSoundID = 0;


    // Currently of no use.
    public String sounds[] = {"apple_crunch", "burp", "car_rev", "goat_scream", "pop", "tire_squeal", "robot_voice", "r2d2", "wilhelm_scream"};

    enum Sounds {
        APPLE_CRUNCH,
        BURP,
        CAR_REV,
        GOAT_SCREAM,
        POP,
        ROBOT_VOICE,
        R2D2,
        TIRE_SQUEAL,
        WILHELM_SCREAM;
    }
    
    HardwareMap hwMap = null;

    public SoundPlayer() {
        
    }
    
    public void init(HardwareMap ahwMap) {
        hwMap = ahwMap;
        // Determine Resource IDs for sounds built into the RC application.
        appleCrunchSoundID = hwMap.appContext.getResources().getIdentifier("apple_crunch", "raw", hwMap.appContext.getPackageName());
        burpSoundID = hwMap.appContext.getResources().getIdentifier("burp", "raw", hwMap.appContext.getPackageName());
        carRevSoundID = hwMap.appContext.getResources().getIdentifier("car_rev", "raw", hwMap.appContext.getPackageName());
        goatScreamSoundID = hwMap.appContext.getResources().getIdentifier("goat_scream", "raw", hwMap.appContext.getPackageName());
        popSoundID = hwMap.appContext.getResources().getIdentifier("pop", "raw", hwMap.appContext.getPackageName());
        tireSquealSoundID = hwMap.appContext.getResources().getIdentifier("tire_squeal", "raw", hwMap.appContext.getPackageName());
        robotVoiceSoundID = hwMap.appContext.getResources().getIdentifier("robot_voice", "raw", hwMap.appContext.getPackageName());
        r2d2SoundID = hwMap.appContext.getResources().getIdentifier("r2d2", "raw", hwMap.appContext.getPackageName());
        wilhelmScreamSoundID = hwMap.appContext.getResources().getIdentifier("wilhelm_scream", "raw", hwMap.appContext.getPackageName());

    }

    public void playSoundByID(int soundID) {
        com.qualcomm.ftccommon.SoundPlayer.getInstance().startPlaying(hwMap.appContext, soundID);
    }

    // Currently of no use.
    public void playSoundByFile(String fileName) {
        int soundID = hwMap.appContext.getResources().getIdentifier(fileName, "raw", hwMap.appContext.getPackageName());
        com.qualcomm.ftccommon.SoundPlayer.getInstance().startPlaying(hwMap.appContext, soundID);
    }
}
