package com.tutorial;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TGIFUtil {
    public static String isItFriday(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek == DayOfWeek.FRIDAY ? "TGIF" : "Nope";
    }
}
