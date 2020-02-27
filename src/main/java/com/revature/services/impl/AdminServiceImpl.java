package com.revature.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Admin;
import com.revature.repositories.AdminRepository;
import com.revature.services.AdminService;

/**
 * AdminServiceImpl handles any additional services that need to be made before calling the
 * repository methods.
 * 
 * @author Adonis Cabreja
 *
 */

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository ar;
	
	@Override
	public List<Admin> getAdmins() {
		return ar.findAll();
	}
	
	@Override
	public Admin getAdminById(int id) {
		return ar.findById(id).get();
	}
	
	@Override
	public Admin createAdmin(Admin admin) {
		return ar.save(admin);
	}
	
	@Override
	public Admin updateAdmin(Admin admin) {
		return ar.save(admin);
	}
	
	@Override
	public String deleteAdminById(int id) {
		ar.deleteById(id);
		return "Admin with id: " + id + " was deleted.";
	}

}
