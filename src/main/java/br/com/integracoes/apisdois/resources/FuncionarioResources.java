package br.com.integracoes.apisdois.resources;

import br.com.integracoes.apisdois.dto.Funcionario;
import br.com.integracoes.apisdois.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("filtro")
public class FuncionarioResources {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping()
    public ResponseEntity<List<Funcionario>> acharPeloNome(@RequestBody Funcionario dto){
        List<Funcionario> newFuncionario = funcionarioService.acharPeloNome(dto.nome);

        return new ResponseEntity<>(newFuncionario, HttpStatus.OK);
    }

}
