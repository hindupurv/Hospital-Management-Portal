/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmanagementportal;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 *
 * @author ASUS
 */
public class Community {
    
    HashMap<Integer, ArrayList<String>> map = new HashMap<>();
    ArrayList<String> communityData = new ArrayList<>();
    String communityName = "";
    String communityCity = "";
    Integer communityNum = 0;
    
    //adding community admin details here since there will be only one 
    ArrayList<String> communityAdminData = new ArrayList<>();
    String role = "comm adm";
    String commonPassword = "commadm";
    
    public void addCommunityAdminDetailsDir(String communityAdminName, String communityAdminCity, String communityAdminEmail)
    {
        communityAdminData.add(communityAdminName); //0
        communityAdminData.add(communityAdminCity); //1
        communityAdminData.add(communityAdminEmail); //2
        communityAdminData.add(role); //3
        communityAdminData.add(commonPassword); //4
    }
    
    
    public void addCommunityDir(String communityName, String communityCity)
    {
        communityNum+=1;
        communityData.add(communityName);
        communityData.add(communityCity);
        map.put(communityNum, communityData);
    }
//    
//    public void writeDataIntoAFile()
//    {
//        try
//        {
//            File file = new File("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\JavaSwingProject2\\JavaSwingApplication_HospitalPortal\\HospitalManagementPortal\\src\\hospitalmanagementportal\\output.txt");
//            FileOutputStream writeData = new FileOutputStream(file);
//            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
//            
//            for(int i = 0; i<communityAdminData.size();i++)
//            {
//                writeStream.writeObject(communityAdminData.get(i)+",");
//            }
//            writeStream.flush();
//            writeStream.close();
//        
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//    }
//    
//    public static void main (String args[])
//    {
//        Community community = new Community();
//        community.addCommunityAdminDetailsDir("omg oo", "boston","s@g.com");
//        System.out.println("hospitalmanagementportal.Community.main()");
//        for(int i = 0; i<communityAdminData.size();i++)
//        {
//            System.out.println(communityAdminData.get(i));
//        }
//        community.writeDataIntoAFile();
//    }
//    
}
