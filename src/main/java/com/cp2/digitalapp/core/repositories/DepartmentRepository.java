package com.cp2.digitalapp.core.repositories;

import com.cp2.digitalapp.core.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByNome(String nome);

}
