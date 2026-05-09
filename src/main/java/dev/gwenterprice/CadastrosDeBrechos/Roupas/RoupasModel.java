package dev.gwenterprice.CadastrosDeBrechos.Roupas;

import dev.gwenterprice.CadastrosDeBrechos.Brechos.Controller.BrechoService.BrechoModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_roupas")
public class RoupasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String corDaRoupa;
    private String tamanhoDaRoupa;
    private String marcaDaRoupa;

    //Uso o @OneToOne pois quando eu vou cadastrar a roupa, esse roupa estara apenas no brecho espeficico, não podendo estar em mais de um
    @OneToOne(mappedBy = "roupa")
    private BrechoModel brecho;

    //Contrutor Vazio
    public RoupasModel() {
    }

    //Construtores
    public RoupasModel(String corDaRoupa, String tamanhoDaRoupa, String marcaDaRoupa) {
        this.corDaRoupa = corDaRoupa;
        this.tamanhoDaRoupa = tamanhoDaRoupa;
        this.marcaDaRoupa = marcaDaRoupa;
    }

    //Getters
    public String getCorDaRoupa() {
        return corDaRoupa;
    }

    public String getTamanhoDaRoupa() {
        return tamanhoDaRoupa;
    }

    public String getMarcaDaRoupa() {
        return marcaDaRoupa;
    }

    //Setters
    public void setCorDaRoupa(String corDaRoupa) {
        this.corDaRoupa = corDaRoupa;
    }

    public void setTamanhoDaRoupa(String tamanhoDaRoupa) {
        this.tamanhoDaRoupa = tamanhoDaRoupa;
    }

    public void setMarcaDaRoupa(String marcaDaRoupa) {
        this.marcaDaRoupa = marcaDaRoupa;
    }
}
