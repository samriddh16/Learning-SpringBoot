package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.document.Player;

public interface IPlayerOTMRepo extends MongoRepository<Player, Integer> {

}
