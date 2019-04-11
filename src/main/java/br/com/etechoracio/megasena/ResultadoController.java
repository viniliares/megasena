package br.com.etechoracio.megasena;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/megasena")
public class ResultadoController {
	@GetMapping
	public String getResultado() throws Exception {
		Megasena megasena = new Megasena();
		return megasena.obterUltimoResultado();
	}

}
