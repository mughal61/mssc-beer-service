package com.sf.msscbeerservice.bootstrap;


import com.sf.msscbeerservice.domain.Beer;
import com.sf.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
public class BeerLoader implements CommandLineRunner {
    public final static String BEER_1_UPC = "063123456245";
    public final static String BEER_2_UPC = "064234234245";
    public final static String BEER_3_UPC = "063123232245";
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
            .upc(BEER_1_UPC)
            .price(new BigDecimal("12.95"))
            .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy cat")
                    .beerStyle("pale_ale")
                    .quantityToBrew(25)
                    .minOnHand(126)
                    .upc(BEER_2_UPC)
                    .price(new BigDecimal("11.15"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("No hammers on the Bar")
                    .beerStyle("pale_ale")
                    .quantityToBrew(25)
                    .minOnHand(45)
                    .upc(BEER_3_UPC)
                    .price(new BigDecimal("7.15"))
                    .build());
        }
    }
}
