package dev.gwenterprice.CadastrosDeBrechos.Brechos.Controller.BrechoService;

import dev.gwenterprice.CadastrosDeBrechos.Roupas.RoupasModel;
import jakarta.persistence.*;

import java.util.List;

//Entity ele transforma uma classe em uma entidade do BD
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro_de_brechos")
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

    public BrechoModel() {
    }

    public BrechoModel(String nome, String endreco, String estiloRoupa) {
        this.nome = nome;
        this.endreco = endreco;
        this.estiloRoupa = estiloRoupa;
    }

    public String getNome() {
        return nome;
    }

    public String getEndreco() {
        return endreco;
    }

    public String getEstiloRoupa() {
        return estiloRoupa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndreco(String endreco) {
        this.endreco = endreco;
    }

    public void setEstiloRoupa(String estiloRoupa) {
        this.estiloRoupa = estiloRoupa;
    }
}
