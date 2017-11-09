package controle.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author BOURGEOIS Thibault
 * Date     09/11/2017
 * Time     12:23
 */
@Data
@Entity(name = "histories")
public class historyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_out")
    private Date dateOut;

    @Column(name = "date_back")
    private Date dateBack;

    @ManyToOne
    private examplaryEntity examplaryEntity;

    @ManyToOne
    private userEntity userEntity;
}
