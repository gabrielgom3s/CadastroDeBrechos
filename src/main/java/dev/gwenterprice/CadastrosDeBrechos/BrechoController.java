package dev.gwenterprice.CadastrosDeBrechos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BrechoController {

    @GetMapping("/boasvindas")
    public String boasvindas(){
        return "Essa é minha primeira mensagem ";
    }
}