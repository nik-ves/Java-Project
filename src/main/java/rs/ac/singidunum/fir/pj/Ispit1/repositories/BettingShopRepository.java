package rs.ac.singidunum.fir.pj.Ispit1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import rs.ac.singidunum.fir.pj.Ispit1.entities.BettingShop;
import rs.ac.singidunum.fir.pj.Ispit1.entities.Match;

public interface BettingShopRepository extends CrudRepository<BettingShop, Integer>{
	
	// Upiti unutar tabele betting_shops
	
	List<BettingShop> findByCityIgnoreCase (String city);
	List<BettingShop> findByOwnerIgnoreCase (String owner);
	List<BettingShop> findByEarningsBetween (double earnings1, double earnings2);
	
	// Upiti koji su povezani sa tabelom matches
	
	List<BettingShop> findAllBettingShopsBymatches (Match match); 
	List<BettingShop> findAllBettingShopByMatchesSport (String sport); 
}
