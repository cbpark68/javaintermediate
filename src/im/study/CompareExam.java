package im.study;

public class CompareExam {
	public static void exec(Compare compare) {
		int k = 10;
		int m = 20;
		int v = compare.compareTo(k, m);
		System.out.println(v);
	}

	public static void main(String[] args) {
		exec((i,j)->{
			return i-j;
		});
	}

}
