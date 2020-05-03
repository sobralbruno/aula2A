package br.usjt.app_previsoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.usjt.app_previsoes.model.Previsao;

public interface PrevisoesRepository extends JpaRepository<Previsao, Long>
{
}
