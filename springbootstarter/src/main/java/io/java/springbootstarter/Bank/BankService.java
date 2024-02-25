package io.java.springbootstarter.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
    
       @Autowired
       BankRepository bankRepository;

                public List<Bank> getAllBanks(){
                       List<Bank> banks= new ArrayList<>();
                       bankRepository.findAll().forEach(banks::add);;
                       return banks; 
                }

                // for(int key : Bank){
                //     System.out.println(key);
                // }

                public Optional<Bank> getBank(int id){
                      return bankRepository.findById(id);
                }

                @SuppressWarnings("null")
                public void addBank(Bank banks) {
                       bankRepository.save(banks);
                }

                @SuppressWarnings("null")
                public void updateBank(Bank bank2) {
                      bankRepository.save(bank2);
                         }
                      
                public void deleteBank(int id) {
                     bankRepository.deleteById(id);
                }
}
