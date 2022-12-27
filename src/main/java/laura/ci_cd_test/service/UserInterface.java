package laura.ci_cd_test.service;

import laura.ci_cd_test.model.Bruger;

public interface UserInterface extends CRUDService<Bruger, Long >{
    //Vi extender, fordi dette UserInterface bliver en child class til CRUDService(Parentclass)
}
