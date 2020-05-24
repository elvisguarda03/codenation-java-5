package challenge;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface QuoteRepository {
    Page<Quote> findAll(Pageable pageable);

    List<Quote> findByActor(String actor);

    long count();
}
