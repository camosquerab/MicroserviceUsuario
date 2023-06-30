package mx.com.gm.Dao;

import mx.com.gm.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonDao extends CrudRepository<Person, Long> {
}
