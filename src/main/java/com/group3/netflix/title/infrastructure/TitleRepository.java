package com.group3.netflix.title.infrastructure;

import com.group3.netflix.title.domain.Title;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitleRepository extends JpaRepository<Title, Integer> {

}
