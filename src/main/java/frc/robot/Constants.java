package frc.robot;

import static edu.wpi.first.units.Units.*;

import edu.wpi.first.units.measure.AngularVelocity;
import edu.wpi.first.units.measure.Distance;
import edu.wpi.first.units.measure.LinearVelocity;
import edu.wpi.first.units.measure.Mass;
import edu.wpi.first.units.measure.MomentOfInertia;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final boolean isReplay = false;

    public static class ControllerConstants {
        // Controller IDs
        public static final int driverId = 0;
        public static final int operatorId = 1;

        // Controller deadband
        public static final double deadband = 0.1; // Percent
    }

    public static class DriveConstants {
        // Moment of Inertia
        public static final MomentOfInertia momentOfInertia = KilogramSquareMeters.of(0.862168364);

        // Motor IDs
        public static final int frontLeftID = 1;
        public static final int backLeftID = 2;
        public static final int frontRightID = 3;
        public static final int backRightID = 4;

        // Robot specs
        public static final Distance robotWidth = Inches.of(13);
        public static final Distance wheelRadius = Inches.of(4);
        public static final Distance wheelCircumference = wheelRadius.times(2 * Math.PI);
        public static final double gearRatio = 8.46;
        public static final Mass mass = Pounds.of(60);

        // Max speeds
        public static final LinearVelocity maxClosedDriveSpeed = MetersPerSecond.of(3.5);
        public static final LinearVelocity maxClosedTurnSpeed = maxClosedDriveSpeed.div(robotWidth.div(2).in(Meters));
        public static final double maxOpenDriveSpeed = 1; // Percent
        public static final double maxOpenTurnSpeed = 0.7; // Percent

        // Conversion factors
        public static final double rotToMeters = wheelCircumference.in(Meters) / gearRatio;

        // PIDFF values
        public static final double kP   = 0.0;
        public static final double kI   = 0.0;
        public static final double kD   = 0.0;
        public static final double kFF  = 0.0;
    }

    public static class ShooterConstants {
        // Motor IDs
        public static final int feedID = 11;
        public static final int launchID = 12;

        // Max speeds
        public static final AngularVelocity maxFeedSpeed = Rotations.per(Minute).of(5676); // Rotations / Minute
        public static final AngularVelocity maxLaunchSpeed = Rotations.per(Minute).of(5676); // Rotations / Minute

        // PIDFF values
        public static final double launchP  = 0.0;
        public static final double launchI  = 0.0;
        public static final double launchD  = 0.0;
        public static final double launchFF = 0.0;

        public static final double feedP    = 0.0;
        public static final double feedI    = 0.0;
        public static final double feedD    = 0.0;
        public static final double feedFF   = 0.0;
    }
}