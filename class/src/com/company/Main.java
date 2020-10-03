package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher walterwhite = new Teacher(3, "Walter White", 800);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(walterwhite);

        Student ram = new Student(1, "Ram", 4);
        Student laxman = new Student(2, "Laxman", 6);
        Student sita = new Student(3, "Sita", 7);

        List<Student> studentList = new ArrayList<>();
        studentList.add(ram);
        studentList.add(laxman);
        studentList.add(sita);

        School sxg = new School(teacherList, studentList);

        ram.updateFeesPaid(5000);
        laxman.updateFeesPaid(6000);
        System.out.println("SXG has earned " + sxg.getTotalMoneyEarned());

        lizzy.receiveSalary(lizzy.salary());
        System.out.println("SXG has paid "+ lizzy.getName()+" "+ lizzy.salary());

        System.out.println("SXG's profit " + (School.getTotalMoneyEarned()-School.getTotalMoneySpent()));

        System.out.println(ram);

    }
}