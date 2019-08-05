package br.com.labs;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "pdf", url = "http://www.ic.unicamp.br/~ducatte/mc102/aula01.pdf")
public interface IntegrationPDF {
	
	@GetMapping
	byte[] getPDF();
}
