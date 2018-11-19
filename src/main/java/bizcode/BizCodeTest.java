package bizcode;

/**
 * @author liusw
 * @date 2018-11-15 14:54
 */
public class BizCodeTest {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(BizCodeUtil.getBizCode("11"));
        }
    }
}
