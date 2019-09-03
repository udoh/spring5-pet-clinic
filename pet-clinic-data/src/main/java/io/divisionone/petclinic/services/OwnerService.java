package io.divisionone.petclinic.services;

import io.divisionone.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
