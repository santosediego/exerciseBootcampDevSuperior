package com.santosediego.dsexercicio.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.santosediego.dsexercicio.dto.ClientDTO;
import com.santosediego.dsexercicio.entities.Client;
import com.santosediego.dsexercicio.repositories.ClientRepository;
import com.santosediego.dsexercicio.services.exceptions.ResourceNotFoundException;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	@Transactional
	public ClientDTO findById(Long id) {
		Optional<Client> obj = clientRepository.findById(id);
		Client entity = obj.orElseThrow(() -> new ResourceNotFoundException("Clinet not found"));
		return new ClientDTO(entity);
	}
}