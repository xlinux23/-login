package com.proyectoapp.ProyectoApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")


public class ClientController {

    // Inyección de dependencias

    @Autowired
    private ClientRepository clientRepository;




}








