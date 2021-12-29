package br.com.integracoes.apisdois.dto;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nome;
    public String cpf;
    public LocalDate dataContratacao;

}
