package controle.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * @author BOURGEOIS Thibault
 * Date     09/11/2017
 * Time     12:23
 */
@Data
@Entity(name = "exemplaries")
public class examplaryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private bookEntitiy bookEntitiy;

    @Column(name = "is_loan")
    private Boolean isLoan;

}
