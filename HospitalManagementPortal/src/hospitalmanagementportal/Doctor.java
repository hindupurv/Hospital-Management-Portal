package hospitalmanagementportal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Doctor {
    
    private String name = "";
    private String contactNumDoc = "";
    private String hospitalName = "";
    private String contactNumHospital = "";
    private Hospital hospital = null;
//    City city = new City();
//    Community community = new Community();
    
    public Doctor(String name, String contactNumDoc, String hospitalName, String contactNumHospital)
    {
        this.name = name;
        this.contactNumDoc = contactNumDoc;
        this.hospitalName = hospitalName;
        this.contactNumHospital = contactNumHospital;
        hospital = new Hospital(hospitalName, contactNumHospital);
    }

    /**
     * @return the Name
     */
    public String getName() {
        return name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.name = Name;
    }

    /**
     * @return the ContactNum
     */
    public String getContactNumDoc() {
        return contactNumDoc;
    }

    /**
     * @param ContactNum the ContactNum to set
     */
    public void setContactNumDoc(String ContactNum) {
        this.contactNumDoc = ContactNum;
    }
   
}
