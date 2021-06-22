package com.sk.msscbeerservice.web.mappers;

import com.sk.msscbeerservice.domain.Beer;
import com.sk.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto beerDto);
}
