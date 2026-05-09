package dev.gwenterprice.CadastrosDeBrechos.Roupas;

import dev.gwenterprice.CadastrosDeBrechos.Brechos.Controller.BrechoService.BrechoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_roupas")
@NoArgsConstructor //<- cria construtores vazios
@AllArgsConstructor //<- cria todos os contrutores
@Data // <- cria todos os getter and setters
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
}
