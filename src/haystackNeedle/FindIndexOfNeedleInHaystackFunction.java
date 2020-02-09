package haystackNeedle;

public class FindIndexOfNeedleInHaystackFunction {
	public int strStr(String haystack, String needle) {
		// if there is no needle, that mean 0 appearing (from question)
		if (needle.length() == 0) {
			return 0;
		}

		// If there is no haystack, needle could never be in haystack
		if (haystack.length() == 0) {
			return -1;
		}

		// One pointer will keep track of current start, reset when next element
		// Within haystack.length
		for (int i = 0; i < haystack.length(); i++) {
			// No point of checking if needle is too long to be in haystack
			if (i + needle.length() > haystack.length()) {
				break;
			}

			// Check the needle on every i elements
			// Within needle.length
			for (int j = 0; j < needle.length(); j++) {
				// Stop the loop when they don't equal for example h != l
				// Its like a base case
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}

				// Since previous if statement will make sure everything til here is equal to each other
				if (j == needle.length() - 1) {
					// I is starting index
					return i;
				}
			}
		}
		
		// If not found
		return -1;
	}
	
	// Easy solution with built in, faster way
	public int strStr2(String haystack, String needle){
		return haystack.indexOf(needle);
	}
}
