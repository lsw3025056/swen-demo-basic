import java.math.BigDecimal;

/**
 * @author liusw
 * @date 2018-11-08 16:18
 */
public class DoubleTest {
    public static void main(String[] args) {
        Double d1 = 3.0 - 2.6;
        System.out.println(d1);
        System.out.println(new BigDecimal(d1.toString()));
    }
}
