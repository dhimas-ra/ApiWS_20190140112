/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pws.consume.pws.consume2;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dhimas
 */
@CrossOrigin
@RestController
@RequestMapping("/mobil")
public class RentalController {
    

    @Autowired
    private rentalmobilrepo rental;

    @GetMapping("/rental")
    public List<Mobil> getAllMobil() {
        return rental.findAll();
    }

    @GetMapping("/rental/{idmobil}")
    public Mobil getMobilById(@PathVariable String id) {
        return rental.findById(id).get();
    }

    @PostMapping("/rental")
    public Mobil saveMobilDetails(@RequestBody Mobil m) {
        return rental.save(m);
    }

    @PutMapping("/rental")
    public Mobil updateMobil(@RequestBody Mobil m) {
        return rental.save(m);
    }

    @DeleteMapping("/rental")
    public ResponseEntity<HttpStatus> deleteMobilById(@PathVariable String id) {
        rental.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

