package io.divisionone.petclinic.services.map;

import io.divisionone.petclinic.model.Pet;
import io.divisionone.petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class PetServiceMapImpl extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
