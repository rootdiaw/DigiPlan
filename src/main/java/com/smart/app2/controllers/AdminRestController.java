package com.smart.app2.controllers;


import com.smart.app2.entities.Admin;
import com.smart.app2.services.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/apiadmin")
public class AdminRestController {

       private AdminService adminService;
    public AdminRestController(AdminService adminService) {
        super();
        this.adminService = adminService;
    }
    @PostMapping(path="/auth")
    public List<Admin> getEmailAndPassword(@RequestBody Admin admin) {
        return adminService.getEmailAndPassword(admin.getEmail(),admin.getPassword());
    }
}
