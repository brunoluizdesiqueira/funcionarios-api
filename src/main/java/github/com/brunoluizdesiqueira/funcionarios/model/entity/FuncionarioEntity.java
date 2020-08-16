package github.com.brunoluizdesiqueira.funcionarios.model.entity;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "funcionario", schema = "public")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "id")
@EqualsAndHashCode
public class FuncionarioEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private Integer idade;

    @Getter
    @Setter
    private String cargo;
}
