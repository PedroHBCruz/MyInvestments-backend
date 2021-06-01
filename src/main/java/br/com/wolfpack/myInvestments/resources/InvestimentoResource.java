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

import br.com.wolfpack.myInvestments.domain.Investimento;
import br.com.wolfpack.myInvestments.repositories.InvestimentoRepository;

@RestController
@RequestMapping("/investimentos")
@CrossOrigin(origins = "http://localhost:3000")
public class InvestimentoResource {

	@Autowired
	private InvestimentoRepository investimentoRepository;

	@GetMapping
	public List<Investimento> findAll() {
		return investimentoRepository.findAll();
	}

	@GetMapping("/{codigo}")
	public Investimento findById(@PathVariable Long codigo) {
		return investimentoRepository.findById(codigo).orElse(null);
	}

	@DeleteMapping("/{codigo}")
	public void remove(@PathVariable Long codigo) {
		investimentoRepository.deleteById(codigo);
	}

	@PostMapping
	public Investimento cadastrar(@RequestBody Investimento investimento) {
		return investimentoRepository.save(investimento);
	}
}
