package challenge;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity(name = "scripts")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Quote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message = "Actor required")
	@Column(columnDefinition = "TEXT", nullable = false)
	private String actor;

	@NotBlank(message = "Quote required")
	@Column(name = "detail", columnDefinition = "TEXT", nullable = false)
	private String quote;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}
}