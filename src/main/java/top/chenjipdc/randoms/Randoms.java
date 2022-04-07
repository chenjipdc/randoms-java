package top.chenjipdc.randoms;

import org.apache.commons.lang3.RandomUtils;


/**
 * @author chenjipdc@gmail.com
 * @date 2022/3/31 4:21 下午
 */
public class Randoms {

    // -------------------  bool   -------------------

    public static boolean nextBool() {
        return RandomUtils.nextBoolean();
    }

    // -------------------  byte   -------------------

    public static byte[] nextBytes(int count) {
        return RandomUtils.nextBytes(count);
    }

    // -------------------  short   -------------------

    public static short nexShort() {
        return nextShort(Short.MAX_VALUE);
    }

    public static short nextShort(short bound) {
        return nextShort((short) 0,
                bound);
    }

    public static short nextShort(short start, short end) {
        return (short) nextInt(start, end);
    }

    // -------------------  int   -------------------

    public static int nextInt() {
        return nextInt(Integer.MAX_VALUE);
    }

    public static int nextInt(int bound) {
        return nextInt(0,
                bound);
    }

    public static int nextInt(int start, int end) {
        return RandomUtils.nextInt(start,
                end);
    }

    // -------------------  long   -------------------

    public static long nextLong() {
        return nextLong(Long.MAX_VALUE);
    }

    public static long nextLong(long bound) {
        return nextLong(0L,
                bound);
    }

    public static long nextLong(long start, long end) {
        return RandomUtils.nextLong(start,
                end);
    }

    // -------------------  float   -------------------

    public static float nextFloat() {
        return nextFloat(Float.MAX_VALUE);
    }

    public static float nextFloat(float bound) {
        return nextFloat(0,
                bound);
    }

    public static float nextFloat(float start, float end) {
        return RandomUtils.nextFloat(start,
                end);
    }

    // -------------------  double   -------------------

    public static double nextDouble() {
        return nextDouble(Double.MAX_VALUE);
    }

    public static double nextDouble(double bound) {
        return nextDouble(0,
                bound);
    }

    public static double nextDouble(double start, double end) {
        return RandomUtils.nextDouble(start,
                end);
    }

    // -------------------  port   -------------------

    public static final int PORT = 65535;

    public static int nextPort() {
        return nextPort(PORT);
    }

    public static int nextPort(int bound) {
        return nextPort(0,
                bound);
    }

    public static int nextPort(int start, int end) {
        return RandomUtils.nextInt(start,
                end) + 1;
    }
}
