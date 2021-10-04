public class Quadratic
{
	public static void main(String[] args)
	{
		
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		
		System.out.println(" Value of a : " +a);
		System.out.println(" Value of b : " +b);
		System.out.println(" Value of c : " +c);
	
		double delta = (b * b) - (4 * a * c);
		
		/* delta = Math.pow(b, 2)-4*a*c; */
		
		System.out.println(" Value of Delta : " +delta);
		
		double root1, root2;
		
		root1 = (-b + Math.sqrt(delta))/(2*a);
		root2 = (-b - Math.sqrt(delta))/(2*a);
		
		System.out.println("Root 1 : "+root1);
		System.out.println("Root 2 : "+root2);
	}
}
