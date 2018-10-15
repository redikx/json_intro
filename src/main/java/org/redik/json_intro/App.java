package org.redik.json_intro;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;


public class App 
{
    public static void main( String[] args )
    {
        ObjectMapper mapper = new ObjectMapper();
        
        try {
	    Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
	
	    System.out.println("Id : " + theStudent.getId());
	    System.out.println("First Name : " + theStudent.getFirstName());
	    System.out.println("Last Name : " + theStudent.getLastName());
	    System.out.println("City : " + theStudent.getAddress().getCity());
        
        }
        catch (Exception e) {
	    e.printStackTrace();
	}
    
    }
}
