package top.chenjipdc.randoms;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.Validate;

/**
 * @author chenjipdc@gmail.com
 * @date 2022/3/31 4:33 下午
 */
public class StringRandoms {

    private static final int DEFAULT_MAX = 12;

    public static String random() {
        return randomAlphabetic();
    }

    // -------------------  number   -------------------

    public static String randomNumeric() {
        return randomNumericMaxCount(DEFAULT_MAX);
    }

    public static String randomNumericMaxCount(int maxCount) {
        return randomNumeric(Randoms.nextInt(maxCount) + 1);
    }

    public static String randomNumeric(int count) {
        return RandomStringUtils.randomNumeric(count);
    }

    public static String randomNumeric(int minCount, int maxCount) {
        return RandomStringUtils.randomNumeric(minCount, maxCount);
    }

    // -------------------  print   -------------------

    public static String randomPrint() {
        return randomPrintMaxCount(DEFAULT_MAX);
    }

    public static String randomPrintMaxCount(int maxCount) {
        return randomPrint(Randoms.nextInt(maxCount) + 1);
    }

    public static String randomPrint(int count) {
        return RandomStringUtils.randomPrint(count);
    }

    public static String randomPrint(int minCount, int maxCount) {
        return RandomStringUtils.randomPrint(minCount, maxCount);
    }

    // -------------------  alphanumeric   -------------------

    public static String randomAlphanumeric() {
        return randomAlphanumericMaxCount(DEFAULT_MAX);
    }

    public static String randomAlphanumericMaxCount(int maxCount) {
        return randomAlphanumeric(Randoms.nextInt(maxCount) + 1);
    }

    public static String randomAlphanumeric(int count) {
        return RandomStringUtils.randomAlphanumeric(count);
    }

    public static String randomAlphanumeric(int minCount, int maxCount) {
        return RandomStringUtils.randomAlphanumeric(minCount, maxCount);
    }


    // -------------------  alphabetic   -------------------

    public static String randomAlphabetic() {
        return randomAlphabeticMaxCount(DEFAULT_MAX);
    }

    public static String randomAlphabeticMaxCount(int maxCount) {
        return randomAlphabetic(Randoms.nextInt(maxCount) + 1);
    }

    public static String randomAlphabetic(int count) {
        return RandomStringUtils.randomAlphabetic(count);
    }

    public static String randomAlphabetic(int minCount, int maxCount) {
        return RandomStringUtils.randomAlphabetic(minCount, maxCount);
    }

    // -------------------  ascii   -------------------

    public static String randomAscii() {
        return randomAsciiMaxCount(DEFAULT_MAX);
    }

    public static String randomAsciiMaxCount(int maxCount) {
        return randomAscii(Randoms.nextInt(maxCount) + 1);
    }

    public static String randomAscii(int count) {
        return RandomStringUtils.randomAscii(count);
    }

    public static String randomAscii(int minCount, int maxCount) {
        return RandomStringUtils.randomAscii(minCount, maxCount);
    }

    // -------------------  graph   -------------------

    public static String randomGraph() {
        return randomGraphMaxCount(DEFAULT_MAX);
    }

    public static String randomGraphMaxCount(int maxCount) {
        return randomGraph(Randoms.nextInt(maxCount) + 1);
    }

    public static String randomGraph(int count) {
        return RandomStringUtils.randomGraph(count);
    }

    public static String randomGraph(int minCount, int maxCount) {
        return RandomStringUtils.randomGraph(minCount, maxCount);
    }

    // -------------------  hold   -------------------

    public static String randomHold(String hold) {
        return randomHold(Randoms.nextInt(DEFAULT_MAX) + 1, hold);
    }

    public static String randomHold(int count, String hold) {
        return RandomStringUtils.random(count, hold);
    }

    public static String randomHold(int minCount, int maxCount, String hold) {
        Validate.isTrue(maxCount >= minCount,
                "Start value must be smaller or equal to end value.");
        int count = minCount + Randoms.nextInt(maxCount - minCount + 1);
        return randomHold(count, hold);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
//            System.out.println(randomHold(10, 11, "我在这里呢，你在干什么"));
            System.out.println(random());
        }
    }
}
