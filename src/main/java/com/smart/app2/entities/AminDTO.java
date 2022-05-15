package com.smart.app2.entities;


import lombok.Data;

@Data
public class AminDTO {

    private Long idadmin;
    private String login;
    private String password;
    private String email;
}
