/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KurtLaurenceLGotana
 */

class Student extends Person{

    private String gradeLevel;

    public Student(String name, int id, String gradeLevel) {
        super(name, id);
        this.gradeLevel = gradeLevel;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade Level: " + gradeLevel);
    }
}
