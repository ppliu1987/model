package com.menis.util;

import java.math.BigDecimal;

public class StringUtil {
    public static String dealWithNum(String num,int length){//num是一个字符型的数字,保留length长的小数位
        BigDecimal decimal = new BigDecimal(num);
        BigDecimal numExed = decimal.setScale(length,BigDecimal.ROUND_HALF_UP);
        return numExed.toString();
    }
}