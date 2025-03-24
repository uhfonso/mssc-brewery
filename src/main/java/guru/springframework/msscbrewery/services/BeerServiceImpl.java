package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(beerId)
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
       return BeerDto.builder()
               .id(beerDto.getId())
               .beerName(beerDto.getBeerName())
               .beerStyle(beerDto.getBeerStyle())
               .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        BeerDto.builder()
                .id(beerId)
                .beerName(beerDto.getBeerName())
                .beerStyle(beerDto.getBeerStyle())
                .build();

    }

    @Override
    public void deleteBeer(UUID beerId) {
        // TODO Implementar este metodo
    }
}
