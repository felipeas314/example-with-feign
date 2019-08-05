package br.com.labs;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignController {

	private IntegrationUnifor integrationFeign;

	private IntegrationPDF integrationPDF;

	public FeignController(IntegrationUnifor integrationFeign, IntegrationPDF integrationPDF) {
		this.integrationFeign = integrationFeign;
		this.integrationPDF = integrationPDF;
	}

	@GetMapping("/unifor")
	public ResponseEntity<String> getSiteUnifor() {
		return ResponseEntity.ok(integrationFeign.getSiteUnifor());
	}

	@GetMapping("/pdf")
	public ResponseEntity<byte[]> getPDF() {

		byte[] pdf = integrationPDF.getPDF();

		return ResponseEntity.ok().contentLength(pdf.length).contentType(MediaType.APPLICATION_PDF)
//				.header("application", "force-download")
				.header("Content-Disposition", "attachment; filename=\"relatorio\".pdf").body(pdf);
	}
}
