package pe.edu.upc.demoauthor.services;

import pe.edu.upc.demoauthor.dtos.InvestmentByUserDTO;
import pe.edu.upc.demoauthor.dtos.QuantityForUserDTO;
import pe.edu.upc.demoauthor.entities.Certification;

import java.util.List;

public interface ICertification {

    public void insert(Certification certification);
    List<Certification> list();
    List<QuantityForUserDTO> listCuantityForUser();
    List<InvestmentByUserDTO> listInvestmentByUser();
}
