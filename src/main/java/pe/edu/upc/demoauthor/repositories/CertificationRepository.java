package pe.edu.upc.demoauthor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demoauthor.dtos.InvestmentByUserDTO;
import pe.edu.upc.demoauthor.dtos.QuantityForUserDTO;
import pe.edu.upc.demoauthor.entities.Certification;

import java.util.List;

@Repository
public interface CertificationRepository extends JpaRepository<Certification, Long> {
    @Query("select new pe.edu.upc.demoauthor.dtos.QuantityForUserDTO(c.djgcIdUser.username, count(c.djgcId)) from Certification c group by c.djgcIdUser.username")
    List<QuantityForUserDTO> findAllByDjgcIdUser();
    @Query("select new pe.edu.upc.demoauthor.dtos.InvestmentByUserDTO(c.djgcIdUser.username , sum(c.djgcPrice))from Certification c group by  c.djgcIdUser.username")
    List<InvestmentByUserDTO> findAllInvestmentByUserId();
}
