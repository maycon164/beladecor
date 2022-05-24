package com.portfolio.beladecor.controller;

import com.portfolio.beladecor.model.Item;
import com.portfolio.beladecor.model.Kit;
import com.portfolio.beladecor.repository.ItemRepository;
import com.portfolio.beladecor.repository.KitRepository;
import com.sun.tools.jconsole.JConsoleContext;
import com.sun.tools.jconsole.JConsolePlugin;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kits")
public class KitController {

    @Autowired
    private KitRepository kitRepository;
    @Autowired
    private ItemRepository itemRepository;


    @GetMapping
    public List<Kit> getAllKits(){
        return kitRepository.findAll();
    }

    @PostMapping
    public Kit saveKit(@RequestBody Kit kit){
        System.out.println(kit);
        return kitRepository.save(kit);
    }

}
