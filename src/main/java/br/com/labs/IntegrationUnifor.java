package br.com.labs;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "unifor", url = "https://unifor.br")
public interface IntegrationUnifor {

	@GetMapping
	String getSiteUnifor();
}
