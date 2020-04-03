package br.com.daione.pavan.repository;

import br.com.daione.pavan.entidade.JogadorEntidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<JogadorEntidade, String> {
}
