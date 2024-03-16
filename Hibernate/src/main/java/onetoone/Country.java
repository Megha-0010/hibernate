package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Country {
	@Id
	private int id;
	private String name;
	private String population;
	
	@OneToOne
	private PrimeMinister p;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public PrimeMinister getP() {
		return p;
	}

	public void setP(PrimeMinister p) {
		this.p = p;
	}

}
