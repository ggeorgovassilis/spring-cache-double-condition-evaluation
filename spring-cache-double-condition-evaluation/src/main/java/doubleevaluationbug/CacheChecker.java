package doubleevaluationbug;

public class CacheChecker {
	
	int invocationCount;
	
	public int getInvocationCount() {
		return invocationCount;
	}
	
	public boolean canCache(String word) {
		System.out.println("Check "+word);
		invocationCount++;
		return !word.startsWith("nocache");
	}
}
