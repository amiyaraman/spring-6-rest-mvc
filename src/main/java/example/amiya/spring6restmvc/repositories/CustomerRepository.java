package example.amiya.spring6restmvc.repositories;

import example.amiya.spring6restmvc.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
