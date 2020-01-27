package org.springframework.samples.petclinic.setup;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class SetupController {
	
	@GetMapping("/setup")
	public String showSetup(Map<String, Object> model) {
		return "setup/setup";
	}

}
