package top.chenjipdc.randoms;

/**
 * @author chenjipdc@gmail.com
 * @date 2022/4/1 2:42 下午
 */
public class IpRandoms {

    private static final long MIN_IPV4 = 0x01000000L;
    private static final long MAX_IPV4 = 0xffffffffL;
    private static final long MIN_IPV4_A = MIN_IPV4;
    private static final long MAX_IPV4_A = 0x7fffffffL;
    private static final long MIN_IPV4_B = 0x80000000L;
    private static final long MAX_IPV4_B = 0xbfffffffL;
    private static final long MIN_IPV4_C = 0xc0000000L;
    private static final long MAX_IPV4_C = 0xdfffffffL;
    private static final long MIN_IPV4_D = 0xe0000000L;
    private static final long MAX_IPV4_D = 0xefffffffL;
    private static final long MIN_IPV4_E = 0xf0000000L;
    private static final long MAX_IPV4_E = MAX_IPV4;

    private static final long MIN_A_LAN = 0x0a000000L;
    private static final long MAX_A_LAN = 0x0affffffL;

    private static final long MIN_B_LAN = 0xac100000L;
    private static final long MAX_B_LAN = 0xac1fffffL;

    private static final long MIN_C_LAN = 0xc0a80000L;
    private static final long MAX_C_LAN = 0xc0a8ffffL;

    public static String ipv4() {
        return ipv4(MIN_IPV4,
                MAX_IPV4);
    }

    /**
     * 10.0.0.0     - 10.255.255.255
     * 172.16.0.0   - 172.31.255.255
     * 192.168.0.0  - 192.168.255.255
     *
     * @return lan ip
     */
    public static String ipv4Lan() {
        switch (Randoms.nextInt(3)) {
            case 0:
                return ipv4LanA();
            case 1:
                return ipv4LanB();
            default:
                return ipv4LanC();
        }
    }

    public static String ipv4LanA() {
        return ipv4(MIN_A_LAN,
                MAX_A_LAN);
    }

    public static String ipv4LanB() {
        return ipv4(MIN_B_LAN,
                MAX_B_LAN);
    }

    public static String ipv4LanC() {
        return ipv4(MIN_C_LAN,
                MAX_C_LAN);
    }

    /**
     * 1.0.0.0 - 127.255.255.255
     *
     * @return A class
     */
    public static String ipv4A() {
        return ipv4(MIN_IPV4_A,
                MAX_IPV4_A);
    }

    /**
     * 128.0.0.0 - 191.255.255.255
     *
     * @return B class
     */
    public static String ipv4B() {
        return ipv4(MIN_IPV4_B,
                MAX_IPV4_B);
    }

    /**
     * 192.0.0.0 - 223.255.255.255
     *
     * @return C class
     */
    public static String ipv4C() {
        return ipv4(MIN_IPV4_C,
                MAX_IPV4_C);
    }

    /**
     * 224.0.0.0 - 239.255.255.255
     *
     * @return D class
     */
    public static String ipv4D() {
        return ipv4(MIN_IPV4_D,
                MAX_IPV4_D);
    }

    /**
     * 240.0.0.0 - 255.255.255.255
     *
     * @return E class
     */
    public static String ipv4E() {
        return ipv4(MIN_IPV4_E,
                MAX_IPV4_E);
    }

    /**
     * 随机获取范围内ip
     *
     * @param startIp 起始ip
     * @param endIp   结束ip
     * @return 随机ip
     */
    public static String ipv4(long startIp, long endIp) {
        if (startIp > endIp) {
            throw new IllegalArgumentException("起始ip不能大于结束ip");
        }
        return ipv4(startIp + Randoms.nextLong(endIp - startIp + 1));
    }


    public static String ipv4(long ip) {
        String ip1 = ((ip >> 24) & 0xff) + ".";
        String ip2 = ((ip >> 16) & 0xff) + ".";
        String ip3 = ((ip >> 8) & 0xff) + ".";
        String ip4 = Long.toString(ip & 0xff);
        return ip1 + ip2 + ip3 + ip4;
    }

    public static String ipv6() {
        return "";
    }


    public static void main(String[] args) {
        System.out.println("---- A class ----");
        System.out.println(ipv4(MIN_IPV4_A));
        System.out.println(ipv4(MAX_IPV4_A));
        System.out.println("---- B class ----");
        System.out.println(ipv4(MIN_IPV4_B));
        System.out.println(ipv4(MAX_IPV4_B));
        System.out.println("---- C class ----");
        System.out.println(ipv4(MIN_IPV4_C));
        System.out.println(ipv4(MAX_IPV4_C));
        System.out.println("---- D class ----");
        System.out.println(ipv4(MIN_IPV4_D));
        System.out.println(ipv4(MAX_IPV4_D));
        System.out.println("---- E class ----");
        System.out.println(ipv4(MIN_IPV4_E));
        System.out.println(ipv4(MAX_IPV4_E));

        System.out.println("---- A lan ----");
        System.out.println(ipv4(MIN_A_LAN));
        System.out.println(ipv4(MAX_A_LAN));
        System.out.println("---- B lan ----");
        System.out.println(ipv4(MIN_B_LAN));
        System.out.println(ipv4(MAX_B_LAN));
        System.out.println("---- C lan ----");
        System.out.println(ipv4(MIN_C_LAN));
        System.out.println(ipv4(MAX_C_LAN));

        System.out.println("--------");
        for (int i = 0; i < 100; i++) {
            System.out.println(ipv4Lan());
        }
    }

}
