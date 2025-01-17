package com.fiona.Services.Repository;

import com.fiona.Services.Model.ServicesModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ServiceRepository extends JpaRepository<ServicesModel, UUID> {
}
