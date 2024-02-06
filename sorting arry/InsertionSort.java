package Arrays;
class UnicElements {
	public static void main(String args[]) {
		String str = "javabykiraninstitute";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					System.out.println(str.charAt(i));
				}
			}
		}
	}
}