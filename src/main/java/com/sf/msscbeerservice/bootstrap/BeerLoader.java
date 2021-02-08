package com.sf.msscbeerservice.bootstrap;


import com.sf.msscbeerservice.domain.Beer;
import com.sf.msscbeerservice.repositories.BeerRepository;
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
    public void run(String... args) {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
            .beerName("Mango Bobs")
            .beerStyle("IPA")
            .quantityToBrew(200)
            .minOnHand(12)
            .upc(33701000000001L)
            .price(new BigDecimal("12.95"))
            .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy cat")
                    .beerStyle("pale_ale")
                    .quantityToBrew(25)
                    .minOnHand(126)
                    .upc(33701000000002L)
                    .price(new BigDecimal("11.15"))
                    .build());
        }
    }
}
