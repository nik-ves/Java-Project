package rs.ac.singidunum.fir.pj.Ispit1.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name = "matches")
public class Match {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int match_id;
	
	private String sport;
	private String date;
	private double odd_1;
	private double odd_2;
	
	@ManyToMany(mappedBy = "matches")
	private Set<BettingShop> bettingShops;
	
	public Match(int match_id, String sport, String date, double odd_1, double odd_2) {
		this.match_id = match_id;
		this.sport = sport;
		this.date = date;
		this.odd_1 = odd_1;
		this.odd_2 = odd_2;
	}
	
	public Match() {
		
	}

	public int getMatch_id() {
		return match_id;
	}

	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getOdd_1() {
		return odd_1;
	}

	public void setOdd_1(double odd_1) {
		this.odd_1 = odd_1;
	}

	public double getOdd_2() {
		return odd_2;
	}

	public void setOdd_2(double odd_2) {
		this.odd_2 = odd_2;
	}
	
}
