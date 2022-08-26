package com.group3.netflix.actor.infrastructure;

import com.group3.netflix.actor.domain.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
}
