package io.java.springbootstarter.Bank;

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

@RestController
public class BankController {

	@Autowired
    private BankService bankService;

	@GetMapping("/bank")
	public List<Bank> run() {
		return bankService.getAllBanks();
	}

	@GetMapping("/bank/{id}")
	public Optional<Bank> getBank(@PathVariable int id){
        return bankService.getBank(id);
	}

	@PostMapping(value = "/bank")
	public void addBank(@RequestBody Bank bank){
         bankService.addBank(bank);
	}

    @PutMapping(value = "/bank/{id}")
	public void addBank(@RequestBody Bank bank, @PathVariable int id){
         bankService.updateBank(bank);
	}
  
	@DeleteMapping(value = "/bank/{id}")
	public void addBank(@PathVariable int id){
         bankService.deleteBank(id);
	}

}
