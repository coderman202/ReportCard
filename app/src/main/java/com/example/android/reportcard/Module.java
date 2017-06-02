package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * A custom class for modules taken by Students and taught my Teachers
 */
public class Module {

    private int mModuleID;
    private String mModuleName;

    //The Teacher who is the course leader
    private Teacher mModuleLeader;

    //An array of Teachers who teach the Module
    private ArrayList<Teacher> mModuleTeachers;

    /**
     * Instantiates a new Module.
     *
     * @param mModuleID       the Module ID
     * @param mModuleName     the Module Name
     * @param mModuleLeader   the Module Leader
     * @param mModuleTeachers the Module Teachers
     */
    public Module(int mModuleID, String mModuleName, Teacher mModuleLeader, ArrayList<Teacher> mModuleTeachers) {
        this.mModuleID = mModuleID;
        this.mModuleName = mModuleName;
        this.mModuleLeader = mModuleLeader;
        this.mModuleTeachers = mModuleTeachers;
    }

    public Module(int mModuleID, String mModuleName){
        this.mModuleID = mModuleID;
        this.mModuleName = mModuleName;
    }

    /**
     * Gets module id.
     *
     * @return the module id
     */
    public int getmModuleID() {
        return mModuleID;
    }

    /**
     * Sets module id.
     *
     * @param mModuleID the Module ID
     */
    public void setmModuleID(int mModuleID) {
        this.mModuleID = mModuleID;
    }

    /**
     * Gets module name.
     *
     * @return the Module Name
     */
    public String getmModuleName() {
        return mModuleName;
    }

    /**
     * Sets module name.
     *
     * @param mModuleName the Module name
     */
    public void setmModuleName(String mModuleName) {
        this.mModuleName = mModuleName;
    }

    /**
     * Gets module leader.
     *
     * @return the module leader
     */
    public Teacher getmModuleLeader() {
        return mModuleLeader;
    }

    /**
     * Sets module leader.
     *
     * @param mModuleLeader the Module leader
     */
    public void setmModuleLeader(Teacher mModuleLeader) {
        this.mModuleLeader = mModuleLeader;
    }

    /**
     * Gets module teachers.
     *
     * @return the module teachers
     */
    public ArrayList<Teacher> getmModuleTeachers() {
        return mModuleTeachers;
    }

    /**
     * Sets module teachers.
     *
     * @param mModuleTeachers the Module teachers
     */
    public void setmModuleTeachers(ArrayList<Teacher> mModuleTeachers) {
        this.mModuleTeachers = mModuleTeachers;
    }

    /**
     * A quick method to add a new teacher to the module
     * @param newTeacher Takes in a parameter of type Teacher
     */
    public void addTeacher(Teacher newTeacher){
        this.mModuleTeachers.add(newTeacher);
    }

    /**
     * A quick method to remove a teacher from the module
     * @param removedTeacher takes in a param of type teacher
     */
    public void removeTeacher(Teacher removedTeacher){
        this.mModuleTeachers.remove(removedTeacher);
    }

}
