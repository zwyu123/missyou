package com.lin.missyou.util;

import com.lin.missyou.bo.PageCounter;

import java.util.Date;

public class CommonUtil {

    public static Boolean isInTimeLine(Date date, Date start, Date end) {
        Long time = date.getTime();
        Long startTime = start.getTime();
        Long endTime = end.getTime();
        if (time > startTime && time < endTime) {
            return true;
        }
        return false;
    }
}
