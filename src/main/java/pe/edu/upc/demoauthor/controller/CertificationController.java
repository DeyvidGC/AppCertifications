package pe.edu.upc.demoauthor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import pe.edu.upc.demoauthor.services.ICertification;


@RestController
@RequestMapping("/Guevara/certifications")
@CrossOrigin(origins = "http://localhost:4200")
public class CertificationController {
    @Autowired
    private ICertification djgcICertification;

    @GetMapping("/Quantity")
    public ResponseEntity<?> listCuantityForUser() {
        try {
            return new ResponseEntity<>(djgcICertification.listCuantityForUser(), HttpStatus.OK);
        }catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @GetMapping("/Investment")
    public ResponseEntity<?> listInvestmentForUser() {
        try {
            return new ResponseEntity<>(djgcICertification.listInvestmentByUser(), HttpStatus.OK);
        }catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }
}
