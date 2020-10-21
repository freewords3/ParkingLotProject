package pl.project.cars;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CarsService {
    @Autowired CarsRepository repo;

    public void save(Cars customer) {
        repo.save(customer);
    }

    public List<Cars> listAll() {
        return (List<Cars>) repo.findAll();
    }

    public Cars get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

}