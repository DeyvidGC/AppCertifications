package pe.edu.upc.demoauthor.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class QuantityForUserDTO {
    private String djgcName;
    private Long djgcCuantity;
}
