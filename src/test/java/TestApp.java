import org.junit.Test;

import java.math.BigDecimal;

public class TestApp {
    @Test
    public void test(){
        BigDecimal decimal = new BigDecimal("10");
        BigDecimal numExed = decimal.setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println(numExed);
    }
}