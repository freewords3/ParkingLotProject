package pl.project.cars;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CarsRepository extends CrudRepository<Cars, Long> {

}