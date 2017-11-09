package controle.models;

import controle.entities.categoryEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

/**
 * @author BOURGEOIS Thibault
 * Date     09/11/2017
 * Time     13:08
 */
@Data
@ToString
public class bookDto {

    private Long id;
    private String title;
    private String autor;
    private Boolean newest;
    private String category;

}
