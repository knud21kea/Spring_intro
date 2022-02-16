package com.example.first_java_spring.sevices;

import java.time.LocalDate;

public class DayCalculator
{
    public DayCalculator()
    {
    }

    public String isItFriday()
    {
        String[] days = {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        LocalDate localDate = LocalDate.now();
        int k = localDate.getYear();
        int m = localDate.getMonthValue();
        int q = localDate.getDayOfMonth();
        int j = k / 100;
        k = k % 100;
        int h;
        int dow; //ISO

        if (m < 3) // Algorithm needs January/February as month 13/14 of previous year
        {
            m += 12;
            k--;
        }

        h = (q + ((13 * (m + 1)) / 5) + k + (k / 4) + (j / 4) - 2 * j) % 7; // Zeller's Congruence
        dow = (h + 5) % 7 + 1; // Converts to ISO (monday = 1)

        if (dow != 5)
        {
            return "No, it is actually " + days[dow];
        } else
        {
            return "Yes, it is " + days[5];
        }
    }
}
