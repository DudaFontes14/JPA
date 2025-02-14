package br.edu.fatecpg.AplicacaoJPA.repository;

import br.edu.fatecpg.AplicacaoJPA.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    Endereco findByCep(String cep);
}
