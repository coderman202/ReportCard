package com.example.android.reportcard;

/**
 * A custom class to represent grades of Students
 */
public class Grade {

    private Student mStudent;
    private Module mModule;
    private int mFinalGrade;
    private boolean mHasPassed;
    private Enum mLetterGrade;

    /**
     * Instantiates a new Grade.
     *
     * @param mStudent    the m student
     * @param mModule     the m module
     * @param mFinalGrade the m final grade
     */
    public Grade(Student mStudent, Module mModule, int mFinalGrade) {
        this.mStudent = mStudent;
        this.mModule = mModule;
        this.mFinalGrade = mFinalGrade;
        this.mLetterGrade = LetterGrade.getGrade(mFinalGrade);
        this.setHasPassed();
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
     * Gets module.
     *
     * @return the module
     */
    public Module getmModule() {
        return mModule;
    }

    /**
     * Sets module.
     *
     * @param mModule the module
     */
    public void setmModule(Module mModule) {
        this.mModule = mModule;
    }

    /**
     * Gets final grade.
     *
     * @return the final grade
     */
    public int getmFinalGrade() {
        return mFinalGrade;
    }

    /**
     * Sets final grade.
     *
     * @param mFinalGrade the final grade
     */
    public void setmFinalGrade(int mFinalGrade) {
        this.mFinalGrade = mFinalGrade;
    }

    public Enum getmLetterGrade() {
        return mLetterGrade;
    }

    /**
     * Sets whether the student has passed the module
     *
     */
    private void setHasPassed(){
        if(this.mFinalGrade < 40){
            this.mHasPassed = false;
        }
        else{
            this.mHasPassed = false;
        }
    }

    public String toString() {
        return mStudent.getmStudentName() + " scored " + this.mFinalGrade + " in " +
                this.mModule.getmModuleName() + ". Result: " + this.mLetterGrade.toString() + ".";
    }

}
