package com.menis.util;

import java.util.Date;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

public class StringUtil {
    public static String dealWithNum(String num,int length){//num是一个字符型的数字,保留length长的小数位
        BigDecimal decimal = new BigDecimal(num);
        BigDecimal numExed = decimal.setScale(length,BigDecimal.ROUND_HALF_UP);
        return numExed.toString();
    }

    public static String getRandom(int num){//产生num位随机数
        String code = "";
        for (int i=0;i<num;i++) {
            code += ((int)(Math.random()*9));
        }
        return code;
    }

    public static String getTmstmp(int length){//获取时间戳
        Date now = new Date();
        SimpleDateFormat format = null;
        if(length==17)
            format = new SimpleDateFormat("yyyyMMddHHmmssSSS");//获取17位的时间戳
        if(length==14)
            format = new SimpleDateFormat("yyyyMMddHHmmss");//获取14位的时间戳
        if(length==8)
            format = new SimpleDateFormat("yyyyMMdd");//获取8位的时间戳
        if(length==9)
            format = new SimpleDateFormat("HHmmssSSS");//获取6位的时间戳
        if(length==6)
            format = new SimpleDateFormat("HHmmss");//获取9位的时间戳
        String tmstmp = format.format(now);
        return tmstmp;
    }

    public static String getUnique(){//获取唯一ID
        String stmp = getTmstmp(17);
        String random = getRandom(8);
        String uID = stmp+random;
        return uID;
    }

    /**
     * author ppliu
     * @param resource
     * @return
     * 算法规则
     * 1.字符反转
     * 2.字符串折叠--字符串对折并追加盐
     */
    public static String getInvertCode(String resource){//字符反转
        String invert = "";
        for (int i = 0; i < resource.length(); i++) {
            invert += resource.charAt(resource.length()-i-1);
        }
        return invert;
    }

    public static String fold(String info,String sort){
        String newInfo = "";
        String before = "";
        String after = "";
        if(info.length()%2==0){
            before = info.substring(0,info.length()/2);
            after = info.substring(info.length()/2,info.length());
        }else{
            before = info.substring(0,info.length()/2);
            after = info.substring(info.length()/2+1,info.length());
        }
        for (int i = 0; i <info.length()/2 ; i++) {
            newInfo += before.charAt(i);
            newInfo += after.charAt(i);
        }
        return newInfo;
    }
}