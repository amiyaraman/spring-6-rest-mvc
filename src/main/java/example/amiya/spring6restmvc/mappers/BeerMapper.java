package example.amiya.spring6restmvc.mappers;

import example.amiya.spring6restmvc.entities.Beer;
import example.amiya.spring6restmvc.model.BeerDTO;
import org.mapstruct.Mapper;


@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);

}
