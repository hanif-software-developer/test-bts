package co.id.hanif.dev.webservice.rest.repository;

import co.id.hanif.dev.webservice.rest.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDBRepository extends CrudRepository<User,Integer> {
}
