package io.divisionone.petclinic.services.map;

import io.divisionone.petclinic.model.Vet;
import io.divisionone.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class VetServiceMapImpl extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
