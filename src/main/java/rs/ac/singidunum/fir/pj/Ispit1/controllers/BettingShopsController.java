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

import rs.ac.singidunum.fir.pj.Ispit1.entities.BettingShop;
import rs.ac.singidunum.fir.pj.Ispit1.entities.Match;
import rs.ac.singidunum.fir.pj.Ispit1.repositories.BettingShopRepository;

@RestController
public class BettingShopsController {
	
	@Autowired
	private BettingShopRepository repository;
	
	// CrudRepository upiti
	
	@GetMapping("/shops") // Lista svih radnji
	public List<BettingShop> getAllBettingShops() {
		return (List<BettingShop>) repository.findAll();
	}
	
	@GetMapping("/shops/{id}") // Samo jedna radnja
	public BettingShop getBettingShop(@PathVariable int id) {
		return repository.findById(id).orElse(null);
	}
	
	@PostMapping("/shops") // Dodavanje radnje
	public BettingShop addBettingShop(@RequestBody BettingShop bettingShop) {
		return repository.save(bettingShop);
	}
	
	@DeleteMapping("/shops/{id}") // Brisanje radnje
	public void deleteBettingShop(@PathVariable int id) {
		repository.deleteById(id);
	}
	
	@PutMapping("/shops/{id}") // Azuriranje radnje
	public BettingShop updateBettingShop(@PathVariable int id, @RequestBody BettingShop bettingShop) {
		return repository.save(bettingShop);
	}
	
	@GetMapping("/shops/count") // Ukupan broj radnji
	public long getNumberOfBettingShops() {
		return repository.count();
	}
	
	//////////////////////////////////////////////////////////////////////
	
	@GetMapping("/shops/city/{city}") // Sve radnje u jednom gradu
	public List<BettingShop> getBettingShopByCity(@PathVariable String city) {
		return (List<BettingShop>) repository.findByCityIgnoreCase(city);
	}
	
	@GetMapping("/shops/owner/{owner}") // Sve radnje koje ima jedan vlasnik
	public List<BettingShop> getBettingShopByOwner(@PathVariable String owner) {
		return (List<BettingShop>) repository.findByOwnerIgnoreCase(owner);
	}
	
	@GetMapping("/shops/matches") // Nalazenje radnje pomocu meca
	public List<BettingShop> getBettingShopByMatch(@RequestBody Match match) {
		return repository.findAllBettingShopsBymatches(match);
	}
	
	@GetMapping("/shops/earnings/between/{earnings1}-{earnings2}") // Pretraga po mesecnoj zaradi izmedju dva broja
	public List<BettingShop> getBettingShopEarningsBetween(@PathVariable double earnings1, @PathVariable double earnings2) {
		return (List<BettingShop>) repository.findByEarningsBetween(earnings1, earnings2);
	}
	
	@GetMapping("/shops/matches/{sport}") // Radnje koje imaju odredjeni sport
	public List<BettingShop> getBettingShopMatchesByDate(@PathVariable String sport) {
		return (List<BettingShop>) repository.findAllBettingShopByMatchesSport(sport);
	}
	
}
