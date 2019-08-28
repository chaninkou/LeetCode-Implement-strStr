package haystackNeedle;

public class FindIndexOfNeedleInHaystackFunction {
	public int strStr(String haystack, String needle) {
		// if there is no needle, that mean 0 appearing
		if (needle.length() == 0) {
			return 0;
		}

		// If there is no haystack, needle could never be in haystack
		if (haystack.length() == 0) {
			return -1;
		}

		// Within haystack.length
		for (int i = 0; i < haystack.length(); i++) {
			// There could not have enough spaces for needle after i
			if (i + needle.length() > haystack.length()) {
				break;
			}

			// Within needle.length
			for (int j = 0; j < needle.length(); j++) {
				// Stop the loop when they don't equal for example h != l
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}

				// If index j is the same length as needle, that means i is the
				// answer
				// Since this statement will only happen when they equal l = l,
				// and same length
				if (j == needle.length() - 1) {
					return i;
				}
			}
		}

		return -1;
	}
}
