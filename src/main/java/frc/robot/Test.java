package frc.robot;

import com.revrobotics.CANSparkMax;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Test {
    public static Test instance;
    private CANSparkMax test;
    private static final int testId = 6;

    private Test(){
        test = new CANSparkMax(testId, MotorType.kBrushed);
    }
    public static Test getInstance(){
        if(instance == null){
            instance = new Test();
        }
        return instance;
    }
    public void setSpeed(double speed){
        test.set(speed);
    }
    public void run(double speed){
        setSpeed(speed * 0.1);
    }
}
