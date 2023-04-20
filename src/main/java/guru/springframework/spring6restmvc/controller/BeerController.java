package guru.springframework.spring6restmvc.controller;

import guru.springframework.spring6restmvc.model.Beer;
import guru.springframework.spring6restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@Slf4j
@AllArgsConstructor
@RestController
public class BeerController {
    private final BeerService beerService;

    @GetMapping("/api/v1/beer")
    public List listBeers() {
        return beerService.listBeers();
    }

    public Beer getBeerById(UUID uuid) {
        log.debug("BeerController.getBeerById(uuid:" + uuid + ")");
        return beerService.getBeerById(uuid);
    }
}
