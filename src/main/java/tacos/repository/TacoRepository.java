package tacos.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import tacos.data.Taco;

import java.util.Optional;


public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {
    Taco save(Taco taco2);
}
