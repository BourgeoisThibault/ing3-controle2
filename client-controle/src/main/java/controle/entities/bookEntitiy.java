package controle.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * @author BOURGEOIS Thibault
 * Date     09/11/2017
 * Time     12:22
 */
@Data
@Entity(name="books")
public class bookEntitiy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "autor")
    private String autor;

    @Column(name = "newest")
    private Boolean newest;

    @ManyToOne
    private categoryEntity category;

}
