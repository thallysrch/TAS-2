
package br.edu.materdei.tas.frotas.repository;

import br.edu.materdei.tas.frotas.entity.MotoristaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotoristaRepository extends JpaRepository<MotoristaEntity, Integer> {
    
}
