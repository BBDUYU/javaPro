package days24;

import java.util.TreeSet;

public class Ex08_02 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("abc");      ts.add("alien");   ts.add("bat");
		ts.add("car");      ts.add("Car");     ts.add("disc");
		ts.add("dance");    ts.add("dzzz");    ts.add("dzzzz");
		ts.add("elephant"); ts.add("elevator");ts.add("fan");
		ts.add("flower");
		System.out.println(ts);
		System.out.println(ts.subSet("a", "d"));
		
		//Ex08.java		TreeSet<Integer>
		//Ex08_02.java	TreeSet<String>
	}

}
