package rs.ac.singidunum.fir.pj.Ispit1.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "betting_shop")
public class BettingShop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int betting_shop_id;
	
	private String name;
	private String city;
	private String owner;
	private String address;
	private double earnings;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "betting_shop_match", 
	joinColumns = @JoinColumn(name = "betting_shop_id", referencedColumnName = "betting_shop_id"),
	inverseJoinColumns = @JoinColumn (name = "match_id", referencedColumnName = "match_id"))
	private Set<Match> matches;
	
	public BettingShop(int betting_shop_id, String name, String city, String owner, String address, int earnings) {
		this.betting_shop_id = betting_shop_id;
		this.name = name;
		this.city = city;
		this.owner = owner;
		this.address = address;
		this.earnings = earnings;
	}
	
	public BettingShop() {
		
	}

	public int getBetting_shop_id() {
		return betting_shop_id;
	}

	public void setBetting_shop_id(int betting_shop_id) {
		this.betting_shop_id = betting_shop_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getEarnings() {
		return earnings;
	}

	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}
	
	
	
}
