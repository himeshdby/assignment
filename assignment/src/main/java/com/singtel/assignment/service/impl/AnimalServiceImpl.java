package com.singtel.assignment.service.impl;

import com.singtel.assignment.repo.AnimalRepo;
import com.singtel.assignment.repo.AnimalRepository;
import com.singtel.assignment.service.Animal;
import com.singtel.assignment.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class AnimalServiceImpl implements AnimalService {
    @Autowired
    AnimalRepository repository;

    @Override
    public Animal[] getAnimalData(String name) {
        AnimalRepo animalRepo =repository.findbyName(name);
        if(Objects.nonNull(animalRepo) && Objects.nonNull(animalRepo.getName())){
           return new Animal[]{(Animal) animalRepo};
        }
       switch(name) {
            case "duck":
                System.out.println("----------------DUCK----------------");
                Animal myDuck =  new Duck();
                myDuck.walk();
                myDuck.fly();
                myDuck.sing();
                return new Animal[]{myDuck};

            case "chicken":
                System.out.println("----------------CHICKEN----------------");
                Animal myChicken =  new Chicken();
                myChicken.walk();
                myChicken.fly();
                myChicken.sing();
                return new Animal[]{myChicken};

            case "rooster":
                System.out.println("----------------ROOSTER----------------");
                Animal myRooster =  new Rooster();
                myRooster.walk();
                myRooster.fly();
                myRooster.sing();
                return new Animal[]{myRooster};

            case "roosterDelegation":
                System.out.println("----------------ROOSTER DELEGATION ----------------");
                RoosterDelegation myRoosterDel =  new RoosterDelegation();
                myRoosterDel.walk();
                myRoosterDel.fly();
                myRoosterDel.sing();
                return new Animal[]{(Animal) myRoosterDel};

            case "A parrot living with dogs says":
                System.out.println("----------------PARROT LIVING WITH DOGS----------------");
                Parrot myParrotwithDogs =  new Parrot();
                myParrotwithDogs.livingWith(new Dog());
                myParrotwithDogs.walk();
                myParrotwithDogs.fly();
                myParrotwithDogs.sing();
                return new Parrot[]{myParrotwithDogs};

                case "A parrot living with cats says":
                System.out.println("----------------PARROT LIVING WITH CATS----------------");
                Parrot myParrotwithCats =  new Parrot();
                myParrotwithCats.livingWith(new Cat());
                myParrotwithCats.walk();
                myParrotwithCats.fly();
                myParrotwithCats.sing();
                return new Parrot[]{myParrotwithCats};

                case "A parrot living with rooster says":
                System.out.println("----------------PARROT LIVING WITH ROOSTERS----------------");
                Parrot myParrotWithRoosters =  new Parrot();
                myParrotWithRoosters.livingWith(new Rooster());
                myParrotWithRoosters.walk();
                myParrotWithRoosters.fly();
                myParrotWithRoosters.sing();
                return new Parrot[]{myParrotWithRoosters};

            case "A parrot living with duck says":
                System.out.println("----------------PARROT LIVING WITH DUCKS----------------");
                Parrot myParrotWithDucks =  new Parrot();
                myParrotWithDucks.livingWith(new Duck());
                myParrotWithDucks.walk();
                myParrotWithDucks.fly();
                myParrotWithDucks.sing();
                return new Parrot[]{myParrotWithDucks};

            case "shark":
                System.out.println("----------------SHARK----------------");
                Shark mySFish = new Shark();
                mySFish.fly();
                mySFish.sing();
                mySFish.walk();
                mySFish.swim();
                mySFish.colour();
                mySFish.eat();
                mySFish.makeJokes();
                return new Shark[]{mySFish};

            case "clownFish":
                System.out.println("----------------CLOWNFISH----------------");
                Clownfish myCFish = new Clownfish();
                myCFish.fly();
                myCFish.sing();
                myCFish.walk();
                myCFish.swim();
                myCFish.colour();
                myCFish.eat();
                myCFish.makeJokes();
                return new Clownfish[]{myCFish};

            case "dolphin":
                System.out.println("----------------DOLPHIN----------------");
                Dolphin dolphin = new Dolphin();
                dolphin.hasFishBehaviour(new Shark());
                dolphin.fly();
                dolphin.sing();
                dolphin.swim();
                dolphin.walk();
                return new Dolphin[]{dolphin};

            case "butterFly":
                System.out.println("----------------BUTTERFLY----------------");
                Butterfly myButterFly =  new Butterfly();
                myButterFly.setCaterpiller(false);
                myButterFly.fly();
                myButterFly.sing();
                myButterFly.walk();
                return new Butterfly[]{myButterFly};

            case "caterPillar":
                System.out.println("----------------CATERPILLAR----------------");
                Butterfly myCaterpillar =  new Butterfly();
                myCaterpillar.setCaterpiller(true);
                myCaterpillar.fly();
                myCaterpillar.sing();
                myCaterpillar.walk();
                return new Butterfly[]{myCaterpillar};

            case "animalCount":
                System.out.println("----------------Animal Count----------------");
                Animal[] animals = new Animal[]{
                        new Bird(),
                        new Duck(),
                        new Chicken(),
                        new Rooster(),
                        new Parrot(),
                        new Shark(),
                        new Clownfish(),
                        new Dog(),
                        new Butterfly(),
                        new Cat()
                };
                int countFlying = 0 ;
                int countWalk = 0 ;
                int countSing = 0 ;
                int countSwim = 0 ;
                for (Animal animal : animals) {
                    System.out.println(animal.getClass().getName() + "---count start--------------------");
                    if(animal.fly())
                        countFlying++;
                    if(animal.walk())
                        countWalk++;
                    if(animal.sing())
                        countSing++;
                    if(animal.swim())
                        countSwim++;
                    System.out.println("------------------------count end---------------------");
                }
                System.out.println("Number of Animals that can fly: " + countFlying);
                System.out.println("Number of Animals that can walk: " + countWalk);
                System.out.println("Number of Animals that can sing: " + countSing);
                System.out.println("Number of Animals that can swim: " + countSwim);
                  return animals;

            case "roosterSound":
                System.out.println("---------------------------Test Language- ROOSTER--------------------");

                Rooster myRstr = new Rooster();
                List<String> arrayList = new ArrayList<String>(){{
                    add("English");
                    add("Danish");
                    add("Dutch");
                    add("Finnish");
                    add("French");
                    add("German");
                    add("Greek");
                    add("Hebrew");
                    add("Hungarian");
                    add("Italian");
                    add("Japanese");
                    add("Portuguese");
                    add("Russian");
                    add("Swedish");
                    add("Turkish");
                    add("Urdu");
                }};

                for (String lang : arrayList) {
                    myRstr.sing(lang);
                }
                return new Rooster[]{myRstr};

        }
        return null;
    }

    @Override
    public String saveAnimalData(AnimalRepo animalRepo) {
         repository.save(animalRepo);
        return "Animal Data Saved Success";
    }

    @Override
    public String updateAnimalName(AnimalRepo animalRepo) {
        AnimalRepo animalRepo1 = repository.findbyName(animalRepo.getName());
        if(Objects.nonNull(animalRepo1) &&Objects.nonNull(animalRepo1.getId())) {
            animalRepo.setId(animalRepo1.getId());
        }
        repository.save(animalRepo);

        return "Date updated success";
    }

    @Override
    public String deleteAnimalData(String name) {
        AnimalRepo animalRepo1 = repository.findbyName(name);
        repository.delete(animalRepo1);
        return "Data deleted success";
    }
}
