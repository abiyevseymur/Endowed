package az.barama.endowed.dao;

import az.barama.endowed.model.CustomerEntity;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
=======
>>>>>>> 023b369feb4e660af448062d1571c81ace09e276
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    @Query(value = "SELECT * FROM customers ", nativeQuery = true)


}
