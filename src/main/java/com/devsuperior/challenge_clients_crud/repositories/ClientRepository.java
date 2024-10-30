package com.devsuperior.challenge_clients_crud.repositories;

import com.devsuperior.challenge_clients_crud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
