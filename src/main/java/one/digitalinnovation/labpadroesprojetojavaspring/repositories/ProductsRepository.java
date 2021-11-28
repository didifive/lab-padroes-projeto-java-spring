package one.digitalinnovation.labpadroesprojetojavaspring.repositories;

import one.digitalinnovation.labpadroesprojetojavaspring.entities.Products;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends CrudRepository<Products, Long> {

}
