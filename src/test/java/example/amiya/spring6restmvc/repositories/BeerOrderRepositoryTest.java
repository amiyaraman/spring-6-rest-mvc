package example.amiya.spring6restmvc.repositories;

import example.amiya.spring6restmvc.entities.Beer;
import example.amiya.spring6restmvc.entities.BeerOrder;
import example.amiya.spring6restmvc.entities.BeerOrderShipment;
import example.amiya.spring6restmvc.entities.Customer;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeerOrderRepositoryTest {

    @Autowired
    BeerOrderRepository beerOrderRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BeerRepository beerRepository;

    Customer testCustomer;
    Beer testBeer;

    @BeforeEach
    void setUp() {
        testCustomer=customerRepository.findAll().get(0);
        testBeer=beerRepository.findAll().get(0);
    }
    @Transactional
    @Test
    void testBeerOrders(){
        BeerOrder beerOrder=BeerOrder.builder()
                .customerRef("Test order").beerOrderShipment(BeerOrderShipment.builder()
                        .trackingNumber("12345").build())
                .customer(testCustomer)
                .build();

        BeerOrder savedBeerOrder = beerOrderRepository.save(beerOrder);

        System.out.println(savedBeerOrder.getCustomerRef());


    }




}