package com.sf.msscbeerservice.events;

import com.sf.msscbeerservice.web.model.BeerDto;

public class BrewBeerEvent extends BeerEvent{

    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
