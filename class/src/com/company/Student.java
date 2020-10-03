package com.company;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /**
     * to create new student initialization.
     * @param id for the student which is going to be unique value
     * @param name name of the student
     * @param grade grade of the student
     */
    public Student (int id, String name, int grade){
        feesPaid=0;
        feesTotal=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // not going to change student's name and id

    /**
     * used to grade students grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * keep adding to feesPaid
     * add fees to the feesPaid
     * @param fees is the fees paid by the student
     */
    public void updateFeesPaid(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }  

    public int feesRemaining(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + name +
                "Total fees paid: " + feesPaid;
    }
}
