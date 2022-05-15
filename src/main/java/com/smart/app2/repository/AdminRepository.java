package com.smart.app2.repository;

import com.smart.app2.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminRepository  extends JpaRepository<Admin, Long> {
    List<Admin> findByEmailAndPassword(String email, String password);
}
