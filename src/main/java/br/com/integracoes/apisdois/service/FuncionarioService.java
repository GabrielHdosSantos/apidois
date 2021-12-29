package br.com.integracoes.apisdois.service;

import br.com.integracoes.apisdois.dto.Funcionario;
import br.com.integracoes.apisdois.repo.FuncionarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FuncionarioService {

    @Autowired
    private FuncionarioRepo funcionarioRepo;

    @PostMapping
    public List<Funcionario> acharPeloNome(@RequestBody String nome){
        return funcionarioRepo.findFuncionarioByNome(nome);
    }

}
