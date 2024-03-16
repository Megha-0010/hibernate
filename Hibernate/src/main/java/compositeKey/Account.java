package compositeKey;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Account {

	private int id;

	@EmbeddedId // is used to import composite key inside entity class
	private AccountComposite ac;

	private double balance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AccountComposite getAc() {
		return ac;
	}

	public void setAc(AccountComposite ac) {
		this.ac = ac;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
