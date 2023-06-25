package repository;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

@Component
public class TranslateRepository {
	private static final Map<String, String> translator = new HashMap<>();

	@PostConstruct
	public void initData() {
		translator.put("привет","hello");
		translator.put("конфета","candy");

	}

	public String translate(String word) {
		Assert.notNull(word, "The word must not be null");
		return translator.get(word);
	}
}
