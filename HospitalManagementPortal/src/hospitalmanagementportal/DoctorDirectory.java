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
    
    protected void addDoctorDataInDirectory(String name, String contactNumDoc, String doctorHospitalName, String doctorCommunityName)
    {
        doctorData.add(name);
        doctorData.add(contactNumDoc);
        doctorData.add(doctorHospitalName);
        doctorData.add(doctorCommunityName);
        doctorDir.add(doctorData);
    }
    
}
