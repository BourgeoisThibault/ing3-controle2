package controle.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author BOURGEOIS Thibault
 * Date     09/11/2017
 * Time     12:23
 */
@Data
@Entity(name = "users")
public class userEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "booksInCharge")
    private List<examplaryEntity> examplaireEntityList;

}
