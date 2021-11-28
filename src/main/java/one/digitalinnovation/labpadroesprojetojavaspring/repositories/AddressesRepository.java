package one.digitalinnovation.labpadroesprojetojavaspring.repositories;

import one.digitalinnovation.labpadroesprojetojavaspring.entities.Addresses;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressesRepository extends CrudRepository<Addresses, String> {

}