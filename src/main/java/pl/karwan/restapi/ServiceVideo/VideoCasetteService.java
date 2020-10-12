package pl.karwan.restapi.ServiceVideo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.karwan.restapi.Model.VideoCasette;
import pl.karwan.restapi.Repository.VideoCasetteRepo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class VideoCasetteService {

    @Autowired
    public VideoCasetteRepo videoCasetteRepo;




    public Optional<VideoCasette> findById (Long id){
        return videoCasetteRepo.findById(id);
    }



    public Iterable<VideoCasette> findALL (){
        return videoCasetteRepo.findAll();
    }

    public void delet (Long id){
        videoCasetteRepo.deleteById(id);
    }

    public VideoCasette save (VideoCasette videoCasette){
        return   videoCasetteRepo.save(videoCasette);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){

        save(new VideoCasette(1L , "Titanic" , LocalDate.of(1995 , 1 , 2)));
        save(new VideoCasette(2L , "Robocop" , LocalDate.of(2000 , 2 , 3)));
        save(new VideoCasette(3L , "Iron Man" , LocalDate.of(3000 , 2 , 3)));
    }


}
