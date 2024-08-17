import java.util.Scanner;
public class IT24101167Lab4Q2
{
	public static void main(String[] args)
	{
		
		Scanner input=new Scanner(System.in);
		int exam_marks, lab_marks, examMarksPercentage, labMarksPercentage;

		System.out.print("Please enter exam marks( out of 100): ");
		exam_marks=input.nextInt();
		if((exam_marks>100) || (exam_marks<0))
		{
			System.out.println("Invalid input for exam marks. Terminating program.");
			return;
		}
		Scanner input1=new Scanner(System.in);
		System.out.print("Please enter lab submission marks (out of 100):");
		 lab_marks=input1.nextInt();
		if((lab_marks>100) || (lab_marks<0))
		{
			System.out.println("Invalid input for lab submission marks. Terminating program.");
			return;
		}

		Scanner input2=new Scanner(System.in);
		System.out.print("Please enter the percentage given for the exam:");
		examMarksPercentage=input2.nextInt();
		Scanner input3=new Scanner(System.in);
		System.out.print("Please enter the percentage given for the lab submission:");
		labMarksPercentage=input3.nextInt();
		
		if((examMarksPercentage + labMarksPercentage ) !=100 )
		{
			System.out.println("The percentage must add up to 100. Terminating program.");
			return;
		}
		
		double finalMarks = (exam_marks * examMarksPercentage  / 100.0) + ( lab_marks * labMarksPercentage  / 100.0);
		System.out.println("Final Exam mark is: " + finalMarks);
	}
}

		
		
		

