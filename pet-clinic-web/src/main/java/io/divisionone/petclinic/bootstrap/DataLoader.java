package io.divisionone.petclinic.bootstrap;

import io.divisionone.petclinic.model.Owner;
import io.divisionone.petclinic.model.PetType;
import io.divisionone.petclinic.model.Vet;
import io.divisionone.petclinic.services.OwnerService;
import io.divisionone.petclinic.services.PetTypeService;
import io.divisionone.petclinic.services.VetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final Logger log = LoggerFactory.getLogger(DataLoader.class);

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner o1 = new Owner();
        o1.setFirstName("Michael");
        o1.setLastName("Weston");
        o1.setAddress("123 Brickel");
        o1.setCity("Miami");
        o1.setTelephone("213-555-4321");

        ownerService.save(o1);

        Owner o2 = new Owner();
        o2.setFirstName("Fiona");
        o2.setLastName("Glenanne");
        o2.setAddress("321 Main");
        o2.setCity("Tampa");
        o2.setTelephone("323-555-1234");

        ownerService.save(o2);

        log.info("Loaded Owners ...");

        Vet v1 = new Vet();
        v1.setFirstName("Sam");
        v1.setLastName("Axe");

        vetService.save(v1);

        Vet v2 = new Vet();
        v2.setFirstName("Jessie");
        v2.setLastName("Porter");

        vetService.save(v2);

        log.info("Loaded Vets ...");
    }
}
