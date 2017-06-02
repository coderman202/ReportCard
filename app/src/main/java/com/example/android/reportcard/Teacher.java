package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * A custom class to represent Teachers
 */
public class Teacher {

    private int mTeacherID;
    private String mTeacherName;

    //An array of Modules that the teacher teaches.
    private ArrayList<Module> mModulesTaught;

    //An array of Modules that the teacher leads/coordinates.
    private ArrayList<Module> mModulesLead;

    /**
     * Instantiates a new Teacher.
     *
     * @param mTeacherID     the teacher id
     * @param mTeacherName   the teacher name
     * @param mModulesTaught the modules taught
     * @param mModulesLead   the modules lead
     */
    public Teacher(int mTeacherID, String mTeacherName, ArrayList<Module> mModulesTaught, ArrayList<Module> mModulesLead) {
        this.mTeacherID = mTeacherID;
        this.mTeacherName = mTeacherName;
        this.mModulesTaught = mModulesTaught;
        this.mModulesLead = mModulesLead;
    }

    /**
     * Gets teacher id.
     *
     * @return the teacher id
     */
    public int getmTeacherID() {
        return mTeacherID;
    }

    /**
     * Sets teacher id.
     *
     * @param mTeacherID the teacher id
     */
    public void setmTeacherID(int mTeacherID) {
        this.mTeacherID = mTeacherID;
    }

    /**
     * Gets teacher name.
     *
     * @return the teacher name
     */
    public String getmTeacherName() {
        return mTeacherName;
    }

    /**
     * Sets teacher name.
     *
     * @param mTeacherName the teacher name
     */
    public void setmTeacherName(String mTeacherName) {
        this.mTeacherName = mTeacherName;
    }

    /**
     * Gets modules taught.
     *
     * @return the modules taught
     */
    public ArrayList<Module> getmModulesTaught() {
        return mModulesTaught;
    }

    /**
     * Sets modules taught.
     *
     * @param mModulesTaught the modules taught
     */
    public void setmModulesTaught(ArrayList<Module> mModulesTaught) {
        this.mModulesTaught = mModulesTaught;
    }

    /**
     * Gets modules lead.
     *
     * @return the modules lead
     */
    public ArrayList<Module> getmModulesLead() {
        return mModulesLead;
    }

    /**
     * Sets modules lead.
     *
     * @param mModulesLead the m modules lead
     */
    public void setmModulesLead(ArrayList<Module> mModulesLead) {
        this.mModulesLead = mModulesLead;
    }

    /**
     * Add module taught.
     *
     * @param newModule the new module
     */
    public void addModuleTaught(Module newModule){
        this.mModulesTaught.add(newModule);
    }

    /**
     * Drop module taught.
     *
     * @param droppedModule the dropped module
     */
    public void dropModuleTaught(Module droppedModule){
        this.mModulesTaught.remove(droppedModule);
    }

    /**
     * Add module lead.
     *
     * @param newModule the new module
     */
    public void addModuleLead(Module newModule){
        this.mModulesLead.add(newModule);
    }

    /**
     * Drop module lead.
     *
     * @param droppedModule the dropped module
     */
    public void dropModuleLead(Module droppedModule){
        this.mModulesLead.remove(droppedModule);
    }
}
