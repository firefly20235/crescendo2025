package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;

public class FlyWheel {
    private final PWMTalonSRX flywheelMotor = new PWMTalonSRX(3); // PWM port 3

    public void spinFlywheel(double speed) {
        flywheelMotor.set(speed);
    }

    public void stopFlywheel() {
        flywheelMotor.stopMotor();
    }
}
