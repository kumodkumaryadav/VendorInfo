package com.vendor_info.vendor_info.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendor_info.vendor_info.model.CloudVendor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/cloudvendor")
public class CloudApiServices {
    CloudVendor cloudVendor;

    @GetMapping("/{vendId}")
    public CloudVendor getVendorDetails( String vendId){

        // return cloudVendor;
        
      return  new CloudVendor("C1", "Suraj", "Nepura", "9876543210");

    }
    @PostMapping
    public String createVendor(@RequestBody CloudVendor cloudV) {
       
        this.cloudVendor=cloudV;
        
        return "Cloud vendor created successfully";
    }
    @PutMapping
    public String updateVendor(@RequestBody CloudVendor cloudVendor) {
        //TODO: process PUT request
        this.cloudVendor=cloudVendor;
        
        return "Cloud vendor updated Successfully";
    }
    
    @DeleteMapping("{venId}")
    public String deleteVendor(@PathVariable  String venId){

        this.cloudVendor=null;
        return  "vendor  deleted successfully";
    }
    
} 
