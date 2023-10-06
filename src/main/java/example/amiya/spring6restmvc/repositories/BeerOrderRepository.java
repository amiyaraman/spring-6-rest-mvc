package example.amiya.spring6restmvc.repositories;

import example.amiya.spring6restmvc.entities.BeerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerOrderRepository  extends JpaRepository<BeerOrder, UUID> {
}
