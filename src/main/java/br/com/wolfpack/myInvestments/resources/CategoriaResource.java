package br.com.wolfpack.myInvestments.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wolfpack.myInvestments.domain.Categoria;
import br.com.wolfpack.myInvestments.repositories.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "http://localhost:3000")
public class CategoriaResource {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@GetMapping
	public List<Categoria> findAll() {
		return categoriaRepository.findAll();
	}

	@GetMapping("/{codigo}")
	public Categoria findById(@PathVariable Long codigo) {
		return categoriaRepository.findById(codigo).orElse(null);
	}

	@DeleteMapping("/{codigo}")
	public void remover(@PathVariable Long codigo) {
		categoriaRepository.deleteById(codigo);
	}

	@PostMapping
	public Categoria cadastrar(@RequestBody Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
}
