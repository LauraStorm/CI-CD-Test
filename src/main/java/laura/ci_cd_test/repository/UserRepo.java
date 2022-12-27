package laura.ci_cd_test.repository;

import laura.ci_cd_test.model.Bruger;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<Bruger, Long> {
    //Vi extender til CrudRepository, som allerede har metoder i sin class
}
