package pl.karwan.restapi.RestControler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.karwan.restapi.Model.VideoCasette;
import pl.karwan.restapi.ServiceVideo.VideoCasetteService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cassetts")
public class VideoCassetteControler {


        @Autowired
        VideoCasetteService videoCasettes;


        @GetMapping("/all")
        public Iterable<VideoCasette> getall(){
        return videoCasettes.findALL();
        }
        @GetMapping
        public Optional<VideoCasette> getById(@RequestParam Long id){
        return videoCasettes.findById(id);
        }

        @PostMapping
        public VideoCasette addVideo(@RequestBody VideoCasette videoCasette){
            return  videoCasettes.save(videoCasette);
        }

        @PutMapping
        public VideoCasette updateVideo(@RequestBody VideoCasette videoCasette){

        return videoCasettes.save(videoCasette);
        }

        @DeleteMapping
        public void updateVideo(@RequestParam Long id){
            videoCasettes.delet(id);
        }
}
