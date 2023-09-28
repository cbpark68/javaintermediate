package im.study;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("aaa");
		list1.add("bbb");
		list1.add("aaa");
		System.out.println(list1.size());
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
	}

}
