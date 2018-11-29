import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 日期工具类
 *
 * @author liusw
 * @date 2018-11-29 11:32
 */
public class DateUtil {

    // Java8 实现计算两个日期之间的天数
    public Long utilDate(LocalDate endDate) {
        return LocalDate.now().until(endDate, ChronoUnit.DAYS);
    }

}