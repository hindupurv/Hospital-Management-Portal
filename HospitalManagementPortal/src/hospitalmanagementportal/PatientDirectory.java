/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmanagementportal;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ASUS
 */
public class PatientDirectory 
{
    HashMap<String, ArrayList<String>> map = new HashMap<>();
//    static ArrayList<ArrayList<String>> patientDir = new ArrayList<>();
    ArrayList<String> patientData = new ArrayList<String>();
    Integer patientId = 0;
    String email = "";
    
    protected void addPatientDataInDirectory(String name, String contactNumPat, String age, String gender, String email, String password)
    {
        patientId+=1;
//        patientData.add(patientId.toString());
        patientData.add(patientId.toString());
        patientData.add(name);
        patientData.add(age);
        patientData.add(gender);
        patientData.add(contactNumPat);
        patientData.add(email);
        this.email = email;
        patientData.add(password);
        //add in main dir
        map.put(email, patientData);
//        patientDir.add(patientData);
    }
}
