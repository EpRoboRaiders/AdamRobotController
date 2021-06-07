package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

public class SoundPlayer {
    // Declare OpMode members.
    private boolean r2d2Found;      // Sound file present flags
    private boolean appleCrunchFound;
    private boolean tireSquealFound;
    private boolean wilhelmScreamFound;
    private boolean goatScreamFound;
    private boolean burpFound;
    private boolean popFound;
    private boolean carRevFound;
    private boolean robotVoiceFound;
    public int r2d2SoundID = 0;
    public int appleCrunchSoundID = 0;
    public int tireSquealSoundID = 0;
    public int wilhelmScreamSoundID = 0;
    public int goatScreamSoundID = 0;
    public int burpSoundID = 0;
    public int popSoundID = 0;
    public int carRevSoundID = 0;
    public int robotVoiceSoundID = 0;
    
    HardwareMap hwMap           =  null;
    
    public SoundPlayer() {
        
    }
    
    public void init(HardwareMap ahwMap) {
        hwMap = ahwMap;
        // Determine Resource IDs for sounds built into the RC application.
        r2d2SoundID = hwMap.appContext.getResources().getIdentifier("r2d2", "raw", hwMap.appContext.getPackageName());
        appleCrunchSoundID   = hwMap.appContext.getResources().getIdentifier("apple_crunch",   "raw", hwMap.appContext.getPackageName());
        tireSquealSoundID = hwMap.appContext.getResources().getIdentifier("tire_squeal", "raw", hwMap.appContext.getPackageName());
        wilhelmScreamSoundID   = hwMap.appContext.getResources().getIdentifier("wilhelm_scream",   "raw", hwMap.appContext.getPackageName());
        goatScreamSoundID = hwMap.appContext.getResources().getIdentifier("goat_scream", "raw", hwMap.appContext.getPackageName());
        burpSoundID   = hwMap.appContext.getResources().getIdentifier("burp",   "raw", hwMap.appContext.getPackageName());
        popSoundID = hwMap.appContext.getResources().getIdentifier("pop", "raw", hwMap.appContext.getPackageName());
        carRevSoundID   = hwMap.appContext.getResources().getIdentifier("car_rev",   "raw", hwMap.appContext.getPackageName());
        robotVoiceSoundID   = hwMap.appContext.getResources().getIdentifier(" robot_voice",   "raw", hwMap.appContext.getPackageName());
        
        // Determine if sound resources are found.
        // Note: Preloading is NOT required, but it's a good way to verify all your sounds are available before you run.
        if (r2d2SoundID != 0)
            r2d2Found   = com.qualcomm.ftccommon.SoundPlayer.getInstance().preload(hwMap.appContext, r2d2SoundID);
        
        if (appleCrunchSoundID != 0)
            appleCrunchFound   = com.qualcomm.ftccommon.SoundPlayer.getInstance().preload(hwMap.appContext, appleCrunchSoundID);
        
        if (tireSquealSoundID != 0)
            tireSquealFound   = com.qualcomm.ftccommon.SoundPlayer.getInstance().preload(hwMap.appContext, tireSquealSoundID);
        
        if (wilhelmScreamSoundID != 0)
            wilhelmScreamFound   = com.qualcomm.ftccommon.SoundPlayer.getInstance().preload(hwMap.appContext, wilhelmScreamSoundID);
        
        if (goatScreamSoundID != 0)
            goatScreamFound   = com.qualcomm.ftccommon.SoundPlayer.getInstance().preload(hwMap.appContext, goatScreamSoundID);
        
        if (burpSoundID != 0)
            burpFound   = com.qualcomm.ftccommon.SoundPlayer.getInstance().preload(hwMap.appContext, burpSoundID);
        
        if (popSoundID != 0)
            popFound   = com.qualcomm.ftccommon.SoundPlayer.getInstance().preload(hwMap.appContext, popSoundID);
        
        if (carRevSoundID != 0)
            carRevFound   = com.qualcomm.ftccommon.SoundPlayer.getInstance().preload(hwMap.appContext, carRevSoundID);
        
        if (robotVoiceSoundID != 0)
            robotVoiceFound = com.qualcomm.ftccommon.SoundPlayer.getInstance().preload(hwMap.appContext, robotVoiceSoundID);

       
        
    }
    public void playSoundByID(int soundID) {
        com.qualcomm.ftccommon.SoundPlayer.getInstance().startPlaying(hwMap.appContext, soundID);
    }
}
