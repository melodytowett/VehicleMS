package com.example.Admin.repositories;

import ch.qos.logback.core.net.server.Client;
import com.example.Admin.models.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends JpaRepository<Clients,Integer> {
}
