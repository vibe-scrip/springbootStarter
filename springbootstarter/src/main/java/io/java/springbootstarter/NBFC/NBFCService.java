package io.java.springbootstarter.NBFC;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NBFCService {
    
       @Autowired
       NBFCRepository nbfcRepository;

                public List<NBFC> getAllNbfcs(int bankId){
                       List<NBFC> nbfcs= new ArrayList<>();
                       nbfcRepository.findByBankId(bankId).forEach(nbfcs::add);
                       return nbfcs;
                }

                // for(int key : Bank){
                //     System.out.println(key);
                // }

                public Optional<NBFC> getNbfc(int id){
                      return nbfcRepository.findById(id);
                }

                @SuppressWarnings("null")
                public void addNbfc(NBFC nbfcs) {
                     nbfcRepository.save(nbfcs);
                }

                @SuppressWarnings("null")
                public void updateNbfc(NBFC nbfcs) {
                     nbfcRepository.save(nbfcs);
                         }
                      
                public void deleteNbfc(int id) {
                     nbfcRepository.deleteById(id);
                }
}
