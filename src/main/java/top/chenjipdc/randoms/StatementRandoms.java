package top.chenjipdc.randoms;

/**
 * @author chenjipdc@gmail.com
 * @date 2022/3/31 5:51 下午
 */
public class StatementRandoms {

    public static String statement() {
        return statement(" ");
    }

    public static String statement(String separator) {
        return StringRandoms.randomHold(100, StringRandoms.randomAlphabetic(6) + separator);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(statement(","));
        }
    }
}
