package com.proyectoapp.ProyectoApp.repository;

import com.proyectoapp.ProyectoApp.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface ClientRepository extends JpaRepository<Client, Long> {
}
