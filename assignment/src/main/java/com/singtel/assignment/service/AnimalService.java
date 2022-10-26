package com.singtel.assignment.service;

import com.singtel.assignment.repo.AnimalRepo;

public interface AnimalService {

    public Animal[] getAnimalData(String name);
    public String saveAnimalData(AnimalRepo animalRepo);
    public String updateAnimalName(AnimalRepo animalRepo);
    public String deleteAnimalData(String name);
}
