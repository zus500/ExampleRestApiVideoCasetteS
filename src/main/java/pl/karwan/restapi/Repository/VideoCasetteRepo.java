package pl.karwan.restapi.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.karwan.restapi.Model.VideoCasette;


@Repository
public interface VideoCasetteRepo extends CrudRepository <VideoCasette , Long> {

}
