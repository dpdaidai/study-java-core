package com.core.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudyJavaCoreApplicationTests {

    @Test
    public void contextLoads() {

        Calendar instance = Calendar.getInstance();
        int weekYear = instance.getWeekYear();
        System.out.println(weekYear);
        int weeksInWeekYear = instance.getWeeksInWeekYear();
        System.out.println(weeksInWeekYear);
        int firstDayOfWeek = instance.getFirstDayOfWeek();
        System.out.println(firstDayOfWeek);
        int minimalDaysInFirstWeek = instance.getMinimalDaysInFirstWeek();
        System.out.println(minimalDaysInFirstWeek);
        int i = instance.get(Calendar.WEEK_OF_MONTH);
        System.out.println(i);
        int i1 = instance.get(Calendar.WEEK_OF_YEAR);
        System.out.println(i1);
        instance.setFirstDayOfWeek(Calendar.MONDAY);
        int i3 = instance.get(Calendar.DAY_OF_WEEK);
        System.out.println(i3);
        int i2 = instance.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println(i2);

        int i4 = instance.get(Calendar.DAY_OF_WEEK);
        System.out.println(i4);

    }

}

