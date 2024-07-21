package com.proyectoapp.ProyectoApp.controller;

import com.proyectoapp.ProyectoApp.model.Client;
import com.proyectoapp.ProyectoApp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/clientes")


public class ClientController {

    // Inyección de dependencias

    @Autowired
    private ClientRepository clientRepository;

    // Manejador de la lista de clientes de los Get

    // Mapeador de atributos

    @GetMapping
    public String listarClientes(Model model){
        List<Client> client = clientRepository.findAll();
        model.addAttribute("Client", client);
        return "Client";
    }

    // Función Usuario nuevo

    @GetMapping("/nuevo")
    private String mostrarFormularioDeRegistro(Model model){
        model.addAttribute("Client", new Client());
        return "registro_cliente";
    }

    // Función que maneja las solicitudes POST a /cliente y crear un nuevo cliente

    @PostMapping
    public String crearCliente(@ModelAttribute("Client") Client client){
        clientRepository.save(client);
        return  "rediret:/clientes";

    }

    // Función mostrar lista clientes de edición

    @GetMapping("/editar/{id}")
    public String mostrarFormularioDeEdicion(@PathVariable long id, Model model){
        Client client = clientRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
        model.addAttribute("client", client);
        return "editar_cliente";
    }

    @PostMapping("/{id}")
    public String actualizarCliente(@PathVariable Long id, @ModelAttribute("client") Client clienteActualizado){
        Client client = clientRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
        client.setName(clienteActualizado.getName());
        client.setEmail(clienteActualizado.getEmail());
        client.setPhone(clienteActualizado.getPhone());
        clientRepository.save(client);
        return "redirect:/clientes";
    }

    @GetMapping("/eliminar/id")
    public String borrarCliente(@PathVariable Long id){
        clientRepository.deleteById(id);
        return "redirect:/clientes";
    }

}








