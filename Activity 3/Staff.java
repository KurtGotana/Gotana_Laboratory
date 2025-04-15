/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KurtLaurenceLGotana
 */
public class Staff extends Person{
    
    private String department;
    
    public Staff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }
    @Override   
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
    
}
