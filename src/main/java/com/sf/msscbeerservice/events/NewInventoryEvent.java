package com.sf.msscbeerservice.events;

import com.sf.msscbeerservice.web.model.BeerDto;

public class NewInventoryEvent extends BeerEvent{
    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
