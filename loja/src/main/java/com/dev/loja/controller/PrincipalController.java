package com.dev.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {

    @GetMapping("/")
    public String acessarPrincipal(){
        return "administrativo/home";

    }

}