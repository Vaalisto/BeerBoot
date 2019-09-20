package fi.vaalisto.BeerBoot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import fi.vaalisto.BeerBoot.repositories.BeerRepository;
import fi.vaalisto.BeerBoot.models.Beer;;

@RestController
public class BeerController {

    @Autowired
    private BeerRepository beerRepository;

    @GetMapping(path="/beers")
    @ResponseBody
    public List<Beer> getAllBeers() {
        return beerRepository.findAll();
    }

    @GetMapping(path="/beers/{id}")
    @ResponseBody
    public Beer getBeerById(@PathVariable("id") long id) {        
        return beerRepository.getOne(id);
    }
}