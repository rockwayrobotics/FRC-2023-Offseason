// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static final class LED_CONSTANTS {
    public final static String PI_STRING = "3 1 4 1 5 9 2 6 5 3 5 8 9 7 9 3 2 3 8 4 6 2 6 4 3 3 8 3 2 7 9 5 0 2 8 8 4 1 9 7 1 6 9 3 9 9 3 7 5 1 0 5 8 2 0 9 7 4 9 4 4 5 9 2 3 0 7 8 1 6 4 0 6 2 8 6 2 0 8 9 9 8 6 2 8 0 3 4 8 2 5 3 4 2 1 1 7 0 6 7 9";
}


public static final class LED {
  public final static int LED_PWM = 0;
  public final static int LED_LENGTH = 60;
  public static enum modes {
      Green,
      Orange,
      Red,
      Blue,
      Yellow,
      Purple,
      Bi,
      Trans,
      Rainbow,
      RedGreenBreatheGradient,
      SingleRedDot,
      Enby,
      AroAce,
      BuildingRedDot,
      ChasingDots,
      PiSequence,
      ExcitingMonochromeAny,
      ExcitingMonochromeY,
      ExcitingMonochromeM,
      BreathingYellow,
      BreathingMagenta
    }
}
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  public static final class Gamepads {
    public static final int DRIVER = 0;
    public static final int OPERATOR = 1;
}

}
