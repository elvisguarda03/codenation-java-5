package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService {
	@Autowired
	private QuoteRepository repository;

	@Override
	public Quote getQuote() {
		int randomNumber = generateRandomNumber();
		return repository.findAll(PageRequest.of(randomNumber, 1))
				.stream()
				.findFirst()
				.orElse(Quote.builder().build());
	}

	private int generateRandomNumber() {
		return (int)(Math.random() * repository.count());
	}

	@Override
	public Quote getQuoteByActor(String actor) {
		return repository.findByActor(actor)
				.stream()
				.findAny()
				.orElseThrow(ResourceNotFound::new);
	}
}
