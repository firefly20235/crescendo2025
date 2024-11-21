//package frc.robot.commands;
//import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
//
//
//public class ClimbCommand {
//    private final double speed;
//    public ClimbCommand(double speed, PWMTalonSRX leftClimb, PWMTalonSRX rightClimb) {
//        this.speed = speed;
//        this.leftClimb = leftClimb;
//        this.rightClimb = rightClimb;
//    }
//
//
//
//    public void initialize() {
//
//    }
//
//    public void execute() {
//        leftClimb.set(speed);
//        rightClimb.set(speed);
//    }
//    }
//
//    public void end() {
//        leftClimb.stopMotor();
//        rightClimb.stopMotor();
//
//        if (interrupted) {
//            System.out.println("ClimbCommand was interrupted!");
//        } else {
//            System.out.println("ClimbCommand finished successfully.");
//        }
//    }
//
//    public boolean isFinished() {
//        return false;
//    }
//}
