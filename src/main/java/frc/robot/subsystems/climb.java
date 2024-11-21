package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;

public class climb {
    private final PWMTalonSRX leftClimb = new PWMTalonSRX(1);  // PWM port 1
    private final PWMTalonSRX rightClimb = new PWMTalonSRX(2); // PWM port 2

    public void pickUpRight(double speed) {
        rightClimb.set(speed);
    }

    public void pickUpLeft(double speed) {
        leftClimb.set(speed);
    }

    public void stopMotors() {
        leftClimb.stopMotor();
        rightClimb.stopMotor();



