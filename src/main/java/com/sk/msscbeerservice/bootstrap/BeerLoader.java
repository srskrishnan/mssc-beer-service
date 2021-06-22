package com.sk.msscbeerservice.bootstrap;

import com.sk.msscbeerservice.domain.Beer;
import com.sk.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {

        if(beerRepository.count() == 0 ) {
            beerRepository.save(Beer.builder()
                    .beerName("Mango BOBS")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .upc(33701000000L)
                    .price(new BigDecimal("12.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .upc(3370343000000L)
                    .price(new BigDecimal("11.95"))
                    .build());
        }

        System.out.println("Loaded Beers : " + beerRepository.count());
    }
}
