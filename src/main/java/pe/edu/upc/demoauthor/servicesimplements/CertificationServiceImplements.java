package pe.edu.upc.demoauthor.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demoauthor.dtos.InvestmentByUserDTO;
import pe.edu.upc.demoauthor.dtos.QuantityForUserDTO;
import pe.edu.upc.demoauthor.entities.Certification;
import pe.edu.upc.demoauthor.repositories.CertificationRepository;
import pe.edu.upc.demoauthor.services.ICertification;

import java.util.List;

@Service
public class CertificationServiceImplements implements ICertification {
    @Autowired
    private CertificationRepository djgccertificationRepository;

    @Override
    public void insert(Certification djgccertification) {
        djgccertificationRepository.save(djgccertification);
    }

    @Override
    public List<Certification> list() {
        return djgccertificationRepository.findAll();
    }

    @Override
    public List<QuantityForUserDTO> listCuantityForUser() {
        return djgccertificationRepository.findAllByDjgcIdUser();
    }

    @Override
    public List<InvestmentByUserDTO> listInvestmentByUser() {
        return djgccertificationRepository.findAllInvestmentByUserId();
    }

}
