
package com.vendor_info.vendor_info.model;

/**
 * CloudVendor
 */
public class CloudVendor {

    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;

    //setter 
   public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }
    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    //getter
public String getVendorId() {
        return vendorId;
    }
    public String getVendorName() {
        return vendorName;
    }
    public String getVendorAddress() {
        return vendorAddress;
    }
    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }
public CloudVendor(){};  
   public CloudVendor(String vendorId, String vendroNamne, String vendorAddress, String vendorPhoneNumber){

    this.vendorId=vendorId;
    this.vendorName=vendroNamne;
    this.vendorAddress=vendorAddress;
    this.vendorPhoneNumber=vendorPhoneNumber;

   }
}