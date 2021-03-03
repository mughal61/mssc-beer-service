package com.sf.msscbeerservice.bootstrap;


import com.sf.msscbeerservice.domain.Beer;
import com.sf.msscbeerservice.repositories.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Component
public class BeerLoader implements CommandLineRunner {
    public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";
    public static final String BEER_3_UPC = "0083783375213";
    private final BeerRepository beerRepository;

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
            .minOnHand(13)
            .upc(BEER_1_UPC)
            .price(new BigDecimal("12.95"))
            .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy cat")
                    .beerStyle("PORTER")
                    .quantityToBrew(25)
                    .minOnHand(126)
                    .upc(BEER_2_UPC)
                    .price(new BigDecimal("11.15"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("No hammers on the Bar")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(25)
                    .minOnHand(45)
                    .upc(BEER_3_UPC)
                    .price(new BigDecimal("7.15"))
                    .build());
        }
    }
}
