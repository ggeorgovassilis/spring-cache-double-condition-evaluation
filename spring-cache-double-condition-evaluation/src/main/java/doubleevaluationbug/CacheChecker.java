package doubleevaluationbug;

public class CacheChecker {

	public boolean canCache(String word) {
		System.out.println("Check "+word);
		return !word.startsWith("nocache");
	}
}
