package pe.edu.upc.demoauthor.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class InvestmentByUserDTO {
    private String djgcName;
    private Double djgTotal;
}
