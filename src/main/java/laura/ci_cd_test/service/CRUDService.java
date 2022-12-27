package laura.ci_cd_test.service;

import java.util.Optional;
import java.util.Set;

public interface CRUDService<T, ID>{
    Set<T> findAll();
    T save (T object);
    void delete (T object);
    void deleteById (ID id);
    Optional<T> findById (ID id);
}
