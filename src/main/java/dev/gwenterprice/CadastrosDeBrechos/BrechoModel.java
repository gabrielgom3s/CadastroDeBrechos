package dev.gwenterprice.CadastrosDeBrechos;

import jakarta.persistence.*;

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
