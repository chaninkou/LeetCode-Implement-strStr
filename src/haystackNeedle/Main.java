package haystackNeedle;

public class Main {
	public static void main(String[] args) {
		String haystack = "hello";
		
		String needle = "ll";
		
		System.out.println("haystack: " + haystack + " needle: " + needle);
		
		FindIndexOfNeedleInHaystackFunction solution = new FindIndexOfNeedleInHaystackFunction();
		
		System.out.println("Solution: " + solution.strStr(haystack, needle));
	}
}
