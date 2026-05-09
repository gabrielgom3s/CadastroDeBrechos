package dev.gwenterprice.CadastrosDeBrechos.Brechos.Controller.BrechoService;

import dev.gwenterprice.CadastrosDeBrechos.Roupas.RoupasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Entity ele transforma uma classe em uma entidade do BD
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro_de_brechos")
@NoArgsConstructor //<- cria construtores vazios
@AllArgsConstructor //<- cria todos os contrutores
@Data // <- cria todos os getter and setters
public class BrechoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endreco;
    private String estiloRoupa;

    //Uso @ManyToMany pois o brecho pode ter varias roupas
    @OneToMany
    @JoinColumn(name = "roupa_id") //Foreing Key
    private RoupasModel roupa;

}
