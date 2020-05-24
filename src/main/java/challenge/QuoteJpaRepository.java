package challenge;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteJpaRepository
        extends QuoteRepository, PagingAndSortingRepository<Quote, Integer> {
}
