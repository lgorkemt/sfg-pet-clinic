package turan.springframework.sfgpetclinic.service;

import turan.springframework.sfgpetclinic.model.Owner;

import java.util.Set;


/**
 * Created by jt on 7/18/18.
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long Id);

    Owner save(Owner owner);

    Set<Owner> findAllByLastNameLike(String lastName);
}