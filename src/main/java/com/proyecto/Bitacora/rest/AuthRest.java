package com.proyecto.Bitacora.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthRest {

    //METODOS
    @PostMapping(value = "login")
    public String login()
    {
        return "Login";
    }

}
