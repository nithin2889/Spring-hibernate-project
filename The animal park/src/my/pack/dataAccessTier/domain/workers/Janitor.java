package my.pack.dataAccessTier.domain.workers;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import my.pack.dataAccessTier.domain.subfacilities.Address;
import my.pack.dataAccessTier.domain.superclasses.Worker;

@Entity
public class Janitor extends Worker {

	public Janitor() {}
	
	public Janitor(String first_name, String last_name, int age,
		      char gender, long id, Address address,int salary, long cell_number) {
	
	super(first_name, last_name, age, gender, cell_number, address, salary, cell_number);
	}
	
	@Override
	public String toString() {
		return "Janitor";
	}
}
