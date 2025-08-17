package com.repository.offers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.offers.Offers;

public interface IOffersRepository extends JpaRepository<Offers, Integer> {

}
