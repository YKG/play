package org.kaige;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.alibaba.fastjson.JSON;

public class Fastjson {
    public static void main(String[] args) {
        String s = "{ `IssueDate`: `2018-07-04` }".replace('`', '"');
        DatePOJO date = JSON.parseObject(s, DatePOJO.class);
        System.out.println(date);
    }

    public static class DatePOJO {
        public Date IssueDate;

        @Override
        public String toString() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return simpleDateFormat.format(IssueDate);
        }
    }
}
