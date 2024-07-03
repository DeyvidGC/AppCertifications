package pe.edu.upc.demoauthor.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Certification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long djgcId;
    @Column(nullable = false)
    private String djgcName;
    @Column(nullable = false)
    private LocalDate djgcDate;
    @Column(nullable = false)
    private String djgcType;
    @Column(nullable = false)
    private Double djgcPrice;
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name="User_id", referencedColumnName = "user_id")
    private User djgcIdUser;
}
