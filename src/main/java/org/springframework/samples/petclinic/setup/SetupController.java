package org.springframework.samples.petclinic.setup;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class SetupController {

	// private final VetRepository vets;
	//
	// public VetController(VetRepository clinicService) {
	// this.vets = clinicService;
	// }

	@GetMapping("/setup")
	public String showSetup(Map<String, Object> model) {
		return "setup/setup";
	}

	// @GetMapping({ "/vets" })
	// public @ResponseBody Vets showResourcesVetList() {
	// Vets vets = new Vets();
	// vets.getVetList().addAll(this.vets.findAll());
	// return vets;
	// }

}
