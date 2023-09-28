package im.study;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		boolean f1 = set1.add("aaa");
		boolean f2 = set1.add("bbb");
		boolean f3 = set1.add("aaa");
		System.out.println(set1.size());
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
}
