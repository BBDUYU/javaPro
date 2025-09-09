package days17;

public class Ex03_02 {

	public static void main(String[] args) {
		Point3D p1=new Point3D(1,2,3);
		Point3D p2=new Point3D(p1);
		
		p1.dispPoint3D();
		
		System.out.println(p2.getXYZ());
	}

}
