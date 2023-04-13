package main.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarModelRepository extends CrudRepository<CarModel, Integer> {

}
