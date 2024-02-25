package io.java.springbootstarter.NBFC;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.java.springbootstarter.Bank.Bank;

@RestController
public class NBFCController {

	@Autowired
    private NBFCService nbfcService;

	@GetMapping("/bank/{id}/nbfc")
	public List<NBFC> getAllNbfcs(@PathVariable int id) {
		return nbfcService.getAllNbfcs(id);
	}

	@GetMapping("/bank/{bankId}/nbfc/{id}")
	public Optional<NBFC> getNbfc(@PathVariable int id){
        return nbfcService.getNbfc(id);
	}

	@PostMapping(value = "/bank/{bankId}/nbfc")
	public void addNbfc(@RequestBody NBFC nbfc,@PathVariable int bankId){
		nbfc.setBank(new Bank(bankId,"",""));
		nbfcService.addNbfc(nbfc);
	}

	@PutMapping(value = "/bank/{bankId}/nbfc/{id}")
	public void updateNbfc(@RequestBody NBFC nbfc, @PathVariable int bankId, @PathVariable int id){
		nbfc.setBank(new Bank(bankId,"",""));
		nbfcService.updateNbfc(nbfc);
	}
  
	@DeleteMapping(value = "/bank/{bankId}/nbfc/{id}") 
	public void deleteNbfc(@PathVariable int id){
		nbfcService.deleteNbfc(id);
	}

}
