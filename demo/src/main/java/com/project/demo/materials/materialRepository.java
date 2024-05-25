package com.project.demo.materials;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface materialRepository extends JpaRepository<material, Long> {
}
