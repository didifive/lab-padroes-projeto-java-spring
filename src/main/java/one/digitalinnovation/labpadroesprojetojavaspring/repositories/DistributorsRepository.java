package one.digitalinnovation.labpadroesprojetojavaspring.repositories;

import one.digitalinnovation.labpadroesprojetojavaspring.entities.Distributors;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.OptionalDouble;

@Repository
public interface DistributorsRepository extends CrudRepository<Distributors, String> {

}
