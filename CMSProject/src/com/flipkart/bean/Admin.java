/**
 * 
 */
package com.flipkart.bean;
import java.util.*;

/**
 * @author mehul
 *
 */

public class Admin extends User{
	private Date dateOfJoining;
	
	public Date getDateOfJoining() //method to get Date of joining
	{
		return dateOfJoining;
	}
	
	public void setDateOfJoining(Date dateOfJoining) //method to set date of joining.
	{
		this.dateOfJoining=dateOfJoining;
	}
	

}
