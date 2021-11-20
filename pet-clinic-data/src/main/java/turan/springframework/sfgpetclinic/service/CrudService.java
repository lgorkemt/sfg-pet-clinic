package turan.springframework.sfgpetclinic.service;

import java.util.Set;

public interface CrudService<T, ID> {

    T findById(ID Id);

    T save(T t);

    Set<T> findAll();
}
