
package org.usfirst.frc.team2059.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {
	
	Joystick bigStick;
	Talon talon;
	Encoder encoder;
	
    public void robotInit() {
    	bigStick = new Joystick(0);
    	talon = new Talon(0);
    	encoder = new Encoder(0,1);
    	
    	SmartDashboard.putNumber("rotations", -1);
    }
    public void autonomousInit() {
  
    }
    public void autonomousPeriodic() { 
    }
    
    public void teleopInit(){
    	
    }

    public void teleopPeriodic() {
        talon.set(bigStick.getY());
        
        SmartDashboard.putNumber("rotations", encoder.get());
    }
    
    public void testPeriodic() {
    
    }
    
}
