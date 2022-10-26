package com.singtel.assignent.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.singtel.assignment.repo.AnimalRepo;
import com.singtel.assignment.service.Animal;
import com.singtel.assignment.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@PreAuthorize("isAuthenticated()")
@RequestMapping(path = "/api")
public class AnimalController {
    @Autowired
    AnimalService animalService;

    @PreAuthorize("hasAuthority('Admin')")
    @PostMapping("/create/animal")
    public String saveAnimalData(@RequestParam("model") String animaldto) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        AnimalRepo animalRepo = objectMapper.readValue(animaldto, AnimalRepo.class);
        return animalService.saveAnimalData(animalRepo);

    }

    @PreAuthorize("hasAuthority('custom_scope')")
    @GetMapping("/get/animal")
    public Animal[] getAnimalData(@RequestParam("name")String name){
        return animalService.getAnimalData(name);
    }

    @PreAuthorize("hasAuthority('Admin')")
    @PutMapping("/update/animal")
    public String updateAnimalData(@RequestParam("model") String animaldto) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        AnimalRepo animalRepo = objectMapper.readValue(animaldto, AnimalRepo.class);
        return animalService.updateAnimalName(animalRepo);

    }
    @PreAuthorize("hasAuthority('Admin')")
    @GetMapping("/delete/animal")
    public String deleteAnimalData(@RequestParam("name")String name){
        return animalService.deleteAnimalData(name);
    }

}
