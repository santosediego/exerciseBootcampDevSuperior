package com.santosediego.dsexercicio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santosediego.dsexercicio.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}