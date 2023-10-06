package example.amiya.spring6restmvc.mappers;

import example.amiya.spring6restmvc.entities.Customer;
import example.amiya.spring6restmvc.model.CustomerDTO;
import org.mapstruct.Mapper;


@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);

}
