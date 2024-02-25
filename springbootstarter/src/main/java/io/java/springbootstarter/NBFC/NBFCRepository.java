package io.java.springbootstarter.NBFC;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface NBFCRepository extends CrudRepository<NBFC,Integer>{
             public List<NBFC> findByBankId(int id);
}
