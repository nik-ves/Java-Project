package rs.ac.singidunum.fir.pj.Ispit1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import rs.ac.singidunum.fir.pj.Ispit1.entities.Match;

public interface MatchRepository extends CrudRepository<Match, Integer>{
	
	// Upiti unutar tabele matches
	
	List<Match> findByDateIgnoreCase (String date); 
	List<Match> findBySportIgnoreCase (String sport); 
	List<Match> findByDateAndSportIgnoreCase (String date, String sport); 
	
	// Upiti koji su povezani sa tabelom betting_shops
	
	List<Match> findAllMatchesByBettingShopsName (String name);
	List<Match> findAllMatchesByBettingShopsCity (String city); 
}
