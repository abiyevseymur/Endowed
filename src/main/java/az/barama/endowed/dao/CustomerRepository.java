package az.barama.endowed.dao;

import az.barama.endowed.model.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {


}
