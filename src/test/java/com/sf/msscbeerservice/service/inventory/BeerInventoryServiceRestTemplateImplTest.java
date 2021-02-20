package com.sf.msscbeerservice.service.inventory;


import com.sf.msscbeerservice.services.inventory.BeerInventoryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
public class BeerInventoryServiceRestTemplateImplTest {

    @Autowired
    BeerInventoryService beerInventoryService;

    @BeforeEach
    void setUp(){
    }

    @Test
    void getOnHandInventory(){
        final UUID BEER_1_UUID = UUID.fromString("0a818933-087d-47f2-ad83-2f986ed087eb");
        Integer qoh = beerInventoryService.getOnHandInventory(BEER_1_UUID);
        System.out.println(qoh);
    }
}
