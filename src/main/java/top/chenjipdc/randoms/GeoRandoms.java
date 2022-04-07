package top.chenjipdc.randoms;

import org.apache.commons.lang3.Validate;

/**
 * @author chenjipdc@gmail.com
 * @date 2022/4/1 2:42 下午
 */
public class GeoRandoms {

    private static final double MIN_LON = -180.0;
    private static final double MAX_LON = 180.0;

    private static final double MIN_LAT = -90.0;
    private static final double MAX_LAT = 90.0;

    public static GeoPoint point() {
        return point(MIN_LON,
                MAX_LON,
                MIN_LAT,
                MAX_LAT);
    }

    public static GeoPoint pointLon(double minLon, double maxLon) {
        return point(minLon,
                maxLon,
                MIN_LAT,
                MAX_LAT);
    }

    public static GeoPoint pointLat(double minLat, double maxLat) {
        return point(MIN_LON,
                MAX_LON,
                minLat,
                maxLat);
    }

    public static GeoPoint point(double minLon, double maxLon, double minLat, double maxLat) {
        Validate.isTrue(minLon <= maxLon, "longitude range error：" + minLon + "," + maxLon);
        Validate.isTrue(minLat <= maxLat, "latitude range error：" + minLat + "," + maxLat);

        Validate.isTrue(minLon >= MIN_LON, "longitude minimum must getter than" + MIN_LON);
        Validate.isTrue(maxLon <= MAX_LON, "longitude maximum must letter than" + MAX_LON);
        Validate.isTrue(minLat >= MIN_LAT, "latitude minimum must getter than" + MIN_LAT);
        Validate.isTrue(maxLat <= MAX_LAT, "latitude maximum must letter than" + MAX_LAT);

        return new GeoPoint(Math.random() * (maxLon - minLon) + minLon,
                Math.random() * (maxLat - minLat) + minLat);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(pointLat(-90,
                    -89));
        }
    }
}
