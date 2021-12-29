package br.com.integracoes.apisdois.repo;

import br.com.integracoes.apisdois.dto.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepo extends JpaRepository<Funcionario, Long> {

    List<Funcionario> findFuncionarioByNome(String nome);

}
