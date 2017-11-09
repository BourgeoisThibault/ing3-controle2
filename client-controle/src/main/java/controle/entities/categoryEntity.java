package controle.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * @author BOURGEOIS Thibault
 * Date     09/11/2017
 * Time     12:22
 */
@Data
@Entity(name = "categories")
public class categoryEntity {

    @Id
    private String name;

}
