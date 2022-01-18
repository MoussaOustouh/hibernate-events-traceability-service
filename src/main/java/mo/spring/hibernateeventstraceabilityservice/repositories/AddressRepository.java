package mo.spring.hibernateeventstraceabilityservice.repositories;

import mo.spring.hibernateeventstraceabilityservice.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
