package com.smart.app2.services;

import com.smart.app2.entities.Admin;

import java.util.List;

public interface AdminService {

    List<Admin> getEmailAndPassword(String email, String password);
}
