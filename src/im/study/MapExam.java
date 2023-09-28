package im.study;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExam {

	public static void main(String[] args) {
		Map<String,String> map1 = new HashMap<>();
		map1.put("001", "aaa");
		map1.put("002", "bbb");
		map1.put("003", "ccc");
		map1.put("001", "ddd");
		System.out.println(map1.size());
		Iterator<String> it1 = map1.keySet().iterator();
		while(it1.hasNext()) {
			String key = it1.next();
			System.out.println(key+"/"+map1.get(key));
		}
	}

}
