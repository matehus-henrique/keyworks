package com.keyworks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keyworks.domain.Cards;

@Repository
public interface CardsRepository extends JpaRepository<Cards, Integer> {

}
