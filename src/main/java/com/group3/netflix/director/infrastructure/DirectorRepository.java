package com.group3.netflix.director.infrastructure;

import com.group3.netflix.director.domain.Director;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DirectorRepository extends JpaRepository<Director, Integer> {
}
