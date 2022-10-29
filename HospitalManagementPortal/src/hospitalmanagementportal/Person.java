/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmanagementportal;

/**
 *
 * @author ASUS
 */
public class Person 
{
    Doctor doctor = null;
    Patient patient = null;
     
    public Person()
    {
        doctor = new Doctor();
        patient = new Patient();
    }
}
