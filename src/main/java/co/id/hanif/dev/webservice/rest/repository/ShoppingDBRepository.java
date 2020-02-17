package co.id.hanif.dev.webservice.rest.repository;

import co.id.hanif.dev.webservice.rest.entity.Shopping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingDBRepository extends CrudRepository<Shopping, Integer> {
}
