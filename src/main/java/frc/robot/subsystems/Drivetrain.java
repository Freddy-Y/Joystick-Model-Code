// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */
  public static WPI_TalonSRX motor;

  public Drivetrain() {
    motor = new WPI_TalonSRX(0); // Change this to the motorID of the motor(s) that you're running. Find the motorID using Phoenix Tuner
  }

  public void drive() {
    motor.set(RobotContainer.joystick.getY() * 0.35); // 0.35 is the motor's power level
  }

  public void stop() {
    motor.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
