/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KurtLaurenceLGotana
 */
public class Teacher extends Person{
    
    private String subject;
    
    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }

}
