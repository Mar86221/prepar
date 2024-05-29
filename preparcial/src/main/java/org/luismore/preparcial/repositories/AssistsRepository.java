package org.luismore.preparcial.repositories;

import org.luismore.preparcial.domin.entities.Assists;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AssistsRepository extends JpaRepository<Assists, UUID> {
}
