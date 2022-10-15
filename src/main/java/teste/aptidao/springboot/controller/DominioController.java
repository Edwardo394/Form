package teste.aptidao.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import teste.aptidao.springboot.domain.Dominio;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dominio")
public class DominioController {
    //http://localhost:8080/dominio/list
    @GetMapping(path = "list")
    public List<Dominio> list(){
        return List.of(new Dominio("first"), new Dominio("second"), new Dominio("third"));
    }

}
