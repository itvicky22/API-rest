package uea.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import uea.restaurante.models.Refeicao;

public interface RefeicaoRepository extends JpaRepository<Refeicao, Long> {

}
