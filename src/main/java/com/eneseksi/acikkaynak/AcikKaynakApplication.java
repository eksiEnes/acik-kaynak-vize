package com.eneseksi.acikkaynak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AcikKaynakApplication {

	@GetMapping("welcome")
	public String welcome(){
		return "selam dünya";
	}

	public static void main(String[] args) {
		SpringApplication.run(AcikKaynakApplication.class, args);
	}

}
