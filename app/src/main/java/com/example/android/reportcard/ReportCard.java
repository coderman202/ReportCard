package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * A custom class for report cards.
 */
public class ReportCard {

    private Student mStudent;
    private ArrayList<Grade> mGrades;

    /**
     * Instantiates a new Report card.
     *
     * @param mStudent the m student
     * @param mGrades  the m grades
     */
    public ReportCard(Student mStudent, ArrayList<Grade> mGrades) {
        this.mStudent = mStudent;
        this.mGrades = mGrades;
    }

    /**
     * Gets student.
     *
     * @return the student
     */
    public Student getmStudent() {
        return mStudent;
    }

    /**
     * Sets student.
     *
     * @param mStudent the student
     */
    public void setmStudent(Student mStudent) {
        this.mStudent = mStudent;
    }

    /**
     * Gets grades.
     *
     * @return the grades
     */
    public ArrayList<Grade> getmGrades() {
        return mGrades;
    }

    /**
     * Sets grades.
     *
     * @param mGrades the grades
     */
    public void setmGrades(ArrayList<Grade> mGrades) {
        this.mGrades = mGrades;
    }

    /**
     * A method to parse the report card into a multi-line String variable.
     *
     * @return a String variable containing Student name & ID, and all the grades for each module
     * they took.
     */
    public String toString(){
        String str =  "Student Name: \t\t" + this.mStudent.getmStudentName() +
                "\r\nStudent ID: \t\t\t\t" + this.mStudent.getmStudentID();

        for(Grade grade:mGrades){
            str+= "\r\nModule: " + grade.getmModule().getmModuleName() + ". \t\tMark: " + grade.getmFinalGrade() +
                    ". Grade: " + grade.getmLetterGrade().toString();
        }
        return str;
    }
}
