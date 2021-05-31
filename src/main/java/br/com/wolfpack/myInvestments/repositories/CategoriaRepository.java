package br.com.wolfpack.myInvestments.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.wolfpack.myInvestments.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
