package com.busluk.springbootdependencies.controller;

import com.busluk.springbootdependencies.model.Coffee;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CoffeeController {

    private final List<Coffee> coffees = new ArrayList<>();

    @PostConstruct
    void intCoffees() {
        coffees.addAll(List.of(
                new Coffee("Cafe Cereza"),
                new Coffee("Cafe Ganador"),
                new Coffee("Cafe Lareno"),
                new Coffee("Cafe Tres Pontas")
        ));
    }

    @GetMapping(value = "/coffees")
    public List<Coffee> getCoffees() {
        return coffees;
    }
}
