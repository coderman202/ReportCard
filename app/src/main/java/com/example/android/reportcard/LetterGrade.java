package com.example.android.reportcard;

/**
 * A quick little Enum to represent the LetterGrade. Each LetterGrade constant has a minimum mark
 * and a maximum mark so you can calculate which LetterGrade based on the final percentage mark.
 */

public enum LetterGrade{
    A1(90, 100), A2(85, 89), B1(80, 84), B2(75, 79), B3(70, 74), C1(65, 69), C2(60, 64), C3(55, 59),
    D1(50, 54), D2(45, 49), D3(40, 44), E(25, 39), F(10, 24), NG(0, 9);

    private final int minMark, maxMark;

    LetterGrade(int minMark, int maxMark){
        this.minMark = minMark;
        this.maxMark = maxMark;
    }

    public static LetterGrade getGrade(int finalMark){
        for (LetterGrade grade:values()) {
            if(grade.minMark <= finalMark && grade.maxMark >= finalMark){
                return grade;
            }
        }
        throw new IllegalArgumentException("Invalid mark");
    }


}