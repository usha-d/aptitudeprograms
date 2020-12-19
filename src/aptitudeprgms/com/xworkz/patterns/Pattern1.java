package aptitudeprgms.com.xworkz.patterns;

public class Pattern1 {
	public static void main(String args[]) {
		int lines=12;
		for(int i=0;i<lines-1;i++)
		{
			for(int j=0;j<lines-1;j++)
			{
				if(i == 0|| j == 0|| i == lines-1 || j == lines-1)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();	}
		
		
	}


}
