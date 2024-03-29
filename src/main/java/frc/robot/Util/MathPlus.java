package frc.robot.Util;

public class MathPlus {
    public static double clampAbsVal(double val, double max) {
        max = Math.abs(max);
        if (val > max)
            return max;
        if (val < -max)
            return -max;
        return val;
    }
    
    public static int boolFac(boolean b) {
        return b ? 1 : -1;
    }
}
