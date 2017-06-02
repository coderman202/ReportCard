package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * A custom class for Students
 */
public class Student {

    private int mStudentID;
    private String mStudentName;

    //An array of Modules that the student is taking.
    private ArrayList<Module> mModulesTaken;

    /**
     * Instantiates a new Student.
     *
     * @param mStudentID    the student id
     * @param mStudentName  the student name
     * @param mModulesTaken the modules taken
     */
    public Student(int mStudentID, String mStudentName, ArrayList<Module> mModulesTaken) {
        this.mStudentID = mStudentID;
        this.mStudentName = mStudentName;
        this.mModulesTaken = mModulesTaken;
    }

    /**
     * Gets student id.
     *
     * @return the student id
     */
    public int getmStudentID() {
        return mStudentID;
    }

    /**
     * Sets student id.
     *
     * @param mStudentID the student id
     */
    public void setmStudentID(int mStudentID) {
        this.mStudentID = mStudentID;
    }

    /**
     * Gets student name.
     *
     * @return the student name
     */
    public String getmStudentName() {
        return mStudentName;
    }

    /**
     * Sets student name.
     *
     * @param mStudentName the student name
     */
    public void setmStudentName(String mStudentName) {
        this.mStudentName = mStudentName;
    }

    /**
     * Gets modules taken.
     *
     * @return the modules taken
     */
    public ArrayList<Module> getmModulesTaken() {
        return mModulesTaken;
    }

    /**
     * Sets modules taken.
     *
     * @param mModulesTaken the modules taken
     */
    public void setmModulesTaken(ArrayList<Module> mModulesTaken) {
        this.mModulesTaken = mModulesTaken;
    }

    /**
     * A quick method to add a new module to a Student's Module list
     *
     * @param newModule takes in a parameter of type Module
     */
    public void addNewModule(Module newModule){
        this.mModulesTaken.add(newModule);
    }

    /**
     * A quick method to remove a module from a Student's Module list, should they wish to drop one
     *
     * @param droppedModule takes in a parameter of type Module
     */
    public void dropModule(Module droppedModule){
        this.mModulesTaken.remove(droppedModule);
    }
}
