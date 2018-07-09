package doubleevaluationbug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

public class Capitalizer {

	@Cacheable(cacheNames="capitalizer", condition="@cacheChecker.canCache(#p0)")
	public String capitalize(String word) {
		return word.toUpperCase();
	}

}
