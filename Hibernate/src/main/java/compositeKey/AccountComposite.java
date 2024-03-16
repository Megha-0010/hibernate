package compositeKey;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable // represents a class as composite key
public class AccountComposite implements Serializable {
	private long accountNumber;
	private int pincode;

	public AccountComposite(long accountNumber, int pincode) {
		this.accountNumber = accountNumber;
		this.pincode = pincode;

	}

}
