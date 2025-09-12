package days20;

public class Ex04_06 {

	public static void main(String[] args) {
		String dir=System.getProperty("user.dir");
//		System.out.println(dir.substring(dir.length()-1));
		System.out.println(dir.charAt(dir.length()-1));
		
		String fileName="Ex01.java";
		//String regex=".*\\\\";
		
		
		//전체경로 = dir+fileName
		String path=dir.concat(fileName);
		//if(fileName.matches(regex)) System.out.printf(path);
		//else System.out.println(dir+"\\"+fileName);
		if (dir.charAt(dir.length()-1)=='\\') {
			path=dir+fileName;
		}else path=dir+"\\"+fileName;
		System.out.println(path);
	}

}
