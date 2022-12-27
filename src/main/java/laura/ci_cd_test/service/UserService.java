package laura.ci_cd_test.service;

import laura.ci_cd_test.model.Bruger;
import laura.ci_cd_test.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService implements UserInterface{
    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public Set<Bruger> findAll() {
        //Opretter ny liste, hvor alle users fra evt database skal gemmes
        Set<Bruger> allUser = new HashSet<>();
        //Hent users fra Repo, løber dem igennem og gemmer dem i listen
        userRepo.findAll().forEach(allUser::add);
        System.out.println(allUser.size());
        return allUser;
    }

    @Override
    public Bruger save(Bruger object) {
        userRepo.save(object);
        return object;
    }

    @Override
    public void delete(Bruger object) {
        userRepo.delete(object);
        System.out.println("You deleted: " + object);
    }

    @Override
    public void deleteById(Long aLong) {
        userRepo.deleteById(aLong);
        System.out.println("You deleted the user with id : " + aLong );
    }

    @Override
    public Optional<Bruger> findById(Long aLong) {
        return userRepo.findById(aLong);
    }

}
