/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmanagementportal;

/**
 *
 * @author ASUS
 */
public class Hospital {
    
    private String name = "";
    private String contactNum = "";
    private City city = null;
    private Community community = null;
    
    public Hospital(String name, String contactNum)
    {
        this.name = name;
        this.contactNum = contactNum;
        city = new City();
        community = new Community();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ContactNum
     */
    public String getContactNum() {
        return contactNum;
    }

    /**
     * @param contactNum the ContactNum to set
     */
    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }
    
}
