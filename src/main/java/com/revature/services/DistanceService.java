package com.revature.services;

import java.io.IOException;
import java.util.Set;

import com.google.maps.errors.ApiException;
import com.revature.entities.Employee;

public interface DistanceService {
	
	public Set<Employee> distanceMatrix (String[] origins, String[] destinations) throws ApiException, InterruptedException, IOException ;
	
	public  String getGoogleMAPKey();
	
	public Set<Employee> getDriverByLocation(String address) throws ApiException, InterruptedException, IOException;

}
