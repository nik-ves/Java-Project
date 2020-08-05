package rs.ac.singidunum.fir.pj.Ispit1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.singidunum.fir.pj.Ispit1.entities.Match;
import rs.ac.singidunum.fir.pj.Ispit1.repositories.MatchRepository;

@RestController
public class MatchesController {
	
	@Autowired
	private MatchRepository repository;
	
	// CrudRepository upiti
	
	@GetMapping("/matches") // Lista svih meceva
	public List<Match> getAllMatches() {
		return (List<Match>) repository.findAll();
	}
	
	@GetMapping("/matches/{id}") // Samo jedan mec
	public Match getMatch(@PathVariable int id) {
		return repository.findById(id).orElse(null);
	}
	
	@PostMapping("/matches") // Dodavanje meca
	public Match addMatch(@RequestBody Match match) {
		return repository.save(match);
	}
	
	@DeleteMapping("/matches/{id}") // Brisanje meca
	public void deleteMatch(@PathVariable int id) {
		repository.deleteById(id);
	}
	
	@DeleteMapping("/matches/deleteall") // Brisanje svih meceva
	public void deleteAllMatches() {
		repository.deleteAll();
	}
	
	@PutMapping("/matches/{id}") // Azuriranje meca
	public Match updateMatch(@PathVariable int id, @RequestBody Match match) {
		return repository.save(match);
	}
	
	@GetMapping("/matches/count") // Ukupan broj meceva
	public long getNumberOfMatches() {
		return repository.count();
	}
	
	//////////////////////////////////////////////////////////////////////
	
	@GetMapping("/matches/date/{date}") // Svi mecevu u jednom danu
	public List<Match> getMatchByDate(@PathVariable String date) {
		return (List<Match>) repository.findByDateIgnoreCase(date);
	}
	
	@GetMapping("/matches/sport/{sport}") // Svi mecevi odredjenog sporta
	public List<Match> getMatchBySport(@PathVariable String sport) {
		return (List<Match>) repository.findBySportIgnoreCase(sport);
	}
	
	@GetMapping("/matches/search/{date}/{sport}") // Svi mecevi odredjenog dana odredjenog sporta
	public List<Match> getMatchByDayAndBySport(@PathVariable String date, @PathVariable String sport) {
		return (List<Match>) repository.findByDateAndSportIgnoreCase(date, sport);
	}
	
	@GetMapping("/matches/shopname/{name}") // Svi mecevi u jednoj radnji
	public List<Match> getAllMatchesByBettingShopsName(@PathVariable String name) {
		return (List<Match>) repository.findAllMatchesByBettingShopsName(name);
	}
	
	@GetMapping("/matches/search/{city}") // Svi mecevi u jednom gradu
	public List<Match> getAllMatchesByBettingShopCity(@PathVariable String city) {
		return (List<Match>) repository.findAllMatchesByBettingShopsCity(city);
	}
	
	

}
