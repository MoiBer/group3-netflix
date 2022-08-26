package com.group3.netflix.category.infrastructure;

import com.group3.netflix.category.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
