/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmanagementportal;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class DoctorDirectory 
{
    ArrayList<ArrayList<String> > doctorDir = new ArrayList<ArrayList<String>>();
    ArrayList<String> doctorData = new ArrayList<String>();
    
    void addDoctorName(String name)
    {
        doctorData.add(name);
    }
    
    void addContactNumberDoctor(String contactNumDoc)
    {
        doctorData.add(contactNumDoc);
    }
}
