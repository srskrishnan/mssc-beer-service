package com.sk.msscbeerservice.web.mappers;

import com.sk.msscbeerservice.domain.Beer;
import com.sk.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
