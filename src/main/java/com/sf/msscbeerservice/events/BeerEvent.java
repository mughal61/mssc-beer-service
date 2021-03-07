package com.sf.msscbeerservice.events;


import com.sf.msscbeerservice.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    static final long serialVersionUID = 1699525710982653992L;
    private final BeerDto beerDto;
}
