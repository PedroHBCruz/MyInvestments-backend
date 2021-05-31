package br.com.wolfpack.myInvestments.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.wolfpack.myInvestments.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {

}
