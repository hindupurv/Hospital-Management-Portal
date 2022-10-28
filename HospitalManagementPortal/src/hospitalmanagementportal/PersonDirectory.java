/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmanagementportal;

import java.util.HashMap;

/**
 *
 * @author ASUS
 */
public class PersonDirectory 
{
//    A person is anyone - patient admins, doctor, sys admin, hosp adin, comm admin
    // just calling them here is enough
    static HashMap<String, String> loginInfo = new HashMap<>();
    static HashMap<String, String> personRoleInfo = new HashMap<>();
    
    static String user1 = "sysadm123";
//    static String user2 = "docdoc";
//    static String user3 = "patient12";
//    static String user4 = "commadm123";
//    static String user5 = "hospadm123";
    
    String role1 = "sys adm";
//    String role2 = "doc";
//    String role3 = "patient";
//    String role4 = "comm adm";
//    String role5 = "hosp adm";
    
    String pass1 = "sysadm";
//    String pass2 = "doctor";
//    String pass3 = "patient";
//    String pass4 = "commadm";
//    String pass5 = "hospadm";
   
    protected PersonDirectory()
    {
        personRoleInfo.put(user1,role1);
        loginInfo.put( user1, pass1);
        
//        personRoleInfo.put(user2,role2);
//        loginInfo.put( user2, pass2);
//        
//        personRoleInfo.put(user3,role3);
//        loginInfo.put( user3, pass3);
//        
//        personRoleInfo.put(user4,role4);
//        loginInfo.put( user4, pass4);
//        
//        personRoleInfo.put(user5,role5);
//        loginInfo.put( user5, pass5);
        
    }
    
    protected String getSysAdminPasswordValue(String username) {
        return loginInfo.get(username);
    }
    
    protected String getSysAdminRoleValue(String username) {
        return personRoleInfo.get(username);
    }
    
}
