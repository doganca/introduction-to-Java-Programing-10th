package Chapter4;

public class Soru06 {
	
	public static void main(String[] args) {
		double r = 40;
		
		double a1 = Math.random() * 2 * Math.PI;
		double x1 = Math.cos(a1) * r;
		double y1 = Math.sin(a1) * r;
		
		double a2 = Math.random() * 2 * Math.PI;
		double x2 = Math.cos(a2);
		double y2 = Math.sin(a2);
		
		double a3 = Math.random() * 2 * Math.PI;
		double x3 = Math.cos(a3);
		double y3 = Math.sin(a3);
		
		//iki nokta daha bulunacak
		
		double s1 = Math.sqrt((x1 - x1) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		double s2 = Math.sqrt((x2 - x2) * (x2 - x2) + (y2 - y2) * (y2 - y2));
		double s3 = Math.sqrt((x3 - x3) * (x3 - x3) + (y3 - y3) * (y3 - y3));
		
		//iki kenar daha hesaplanacak
		
		aa
		double cosA = (s2 * s2 + s3 * s3 - s1 * s1) / (2 * s2 * s3); 
		
		double A = Math.acos(cosA);
		
	}
}
