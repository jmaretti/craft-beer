/**
 * 
 */
package com.beerhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beerhouse.entity.Beer;

/**
 * Interface de acesso à dados das cervejas
 * @author Jefferson
 *
 */
@Repository
public interface BeerRepository extends JpaRepository<Beer, Long> {

	
}
