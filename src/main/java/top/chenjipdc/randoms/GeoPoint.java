package top.chenjipdc.randoms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author chenjipdc@gmail.com
 * @date 2022/4/2 9:11 上午
 */
@Data
@Builder
@AllArgsConstructor
public class GeoPoint {

    private double lon;

    private double lat;

    @Override
    public String toString() {
        return lon + ", " + lat;
    }
}
