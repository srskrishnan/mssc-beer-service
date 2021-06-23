package com.sk.msscbeerservice.web.controller;

import com.sk.msscbeerservice.services.BeerService;
import com.sk.msscbeerservice.web.model.BeerDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RequiredArgsConstructor
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){

        //todo impl
        //return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
        return new ResponseEntity<>(beerService.getById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer( @RequestBody @Validated BeerDto beerDto){

        //todo impl
        //return new ResponseEntity(HttpStatus.CREATED);
        return new ResponseEntity<>(beerService.saveNewBeer(beerDto),HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody  @Validated BeerDto beerDto){

        //todo impl
        //return new ResponseEntity(HttpStatus.NO_CONTENT);
        return  new ResponseEntity<>(beerService.updateBeerById(beerId, beerDto),HttpStatus.NO_CONTENT);
    }

}