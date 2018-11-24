package az.barama.endowed.dao;

import az.barama.endowed.model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    @Query(value = "SELECT * FROM customers ", nativeQuery = true)

}
