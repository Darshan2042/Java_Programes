package VibrantTest;

import java.util.HashSet;

public class RemoveDuplicates {
	public String remove(String s) {
		StringBuilder sb = new StringBuilder();
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!set.contains(ch)) {
				set.add(ch);
				sb.append(ch);
			}
		}
		return new String(sb);

	}

	public static void main(String args[]) {
		RemoveDuplicates d = new RemoveDuplicates();
		String str = "Programming";
		System.out.println(d.remove(str));
	}
}
