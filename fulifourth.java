import java.util.Scanner;


public class fulifourth {
	public static void main(String[] args) {
		double amount ;
		 double rate  ;
		 double year,result,p;
		 result=0;
		 p=0;
	
		 Scanner keyboard = new Scanner(System.in);

		String ch ="n";
		 System.out.println("��ѡ�񣬵������㱾Ϣ����s:");
		 System.out.println("�������㱾Ϣ����d:");
		 System.out.println("���㱾������m:");
		 System.out.println("��������ʱ������t:");
		 System.out.println("������������������r:");
		 System.out.println("����Ͷ�������Ԥ������������j:");
		 System.out.println("����������Ϣ������h:");
		 
		 
		ch =keyboard.nextLine();
		
		if ( ch.equals("d")||ch.equals("D"))
		{
			
	 		 System.out.println("�����뱾��:");
	 		 amount = keyboard.nextDouble();
	 			 System.out.println("���������ʣ�������:");
	 		 rate = keyboard.nextDouble();
	 			 rate = rate/100;
	 			 System.out.println("������ʱ��:");
	 			 year = keyboard.nextInt();
			 for (int x = 1; x < year; x++){
	 				amount = amount * Math.pow(1.0 + rate, year);
	 			    }
			 System.out.println("���Ϊ"+amount);
		
		}
		
		else if(ch.equals("s")||ch.equals("S"))
		{
			
	 		 System.out.println("�����뱾��:");
	 		 amount = keyboard.nextDouble();
	 			 System.out.println("���������ʣ�������:");
	 		 rate = keyboard.nextDouble();
	 			 rate = rate/100;
	 			 System.out.println("������ʱ��:");
	 			 year = keyboard.nextInt();
		 for (int x = 1; x < year; x++){
			amount =   amount*(1+rate*year);
		    }
		System.out.println("���Ϊ"+amount);
		}
		else if(ch.equals("m")||ch.equals("M"))
		{
			 System.out.println("�����뱾Ϣ:");
	 		 amount = keyboard.nextDouble();
	 			 System.out.println("���������ʣ�������:");
	 		 rate = keyboard.nextDouble();
	 			 rate = rate/100;
	 			 System.out.println("������ʱ��:");
	 			 year = keyboard.nextInt();
		 for (int x = 1; x < year; x++){
			p= (rate+1)*x;
		    }
		 result=amount/p;
		 
		System.out.println("���Ϊ"+result);	
		}
		else if(ch.equals("t")||ch.equals("T"))
		{   double amount1,amount2;
		double time;
			System.out.println("�����뱾��:");
	 		 amount1 = keyboard.nextDouble();
	 		 System.out.println("�����뱾Ϣ:");
	 		 amount2 = keyboard.nextDouble();
	 			 System.out.println("���������ʣ�������:");
	 		 rate = keyboard.nextDouble();
	 			 rate = rate/100;	 
        time= (Math.log(amount2/amount1)/Math.log(1+rate));
		System.out.println("���Ϊ"+time);
		}
		else if(ch.equals("r")||ch.equals("R"))
		{   double amount1,amount2;
	      double rate1 =0;
	      
			System.out.println("�����뱾��:");
	 		 amount1 = keyboard.nextDouble();
	 		 System.out.println("�����뱾Ϣ:");
	 		 amount2 = keyboard.nextDouble();
	 			 System.out.println("������ʱ��:");
	 			 year = keyboard.nextInt();			 
	 			rate1=amount2/amount1/year;
		System.out.println("���Ϊ"+rate1);
		}
		else if(ch.equals("j")||ch.equals("J"))
		{   
	      double m, m1,m2,m3;int year1,p1,rate1,amount3;
	      m=0;m1=0;m2=0;m3=0;;
			System.out.println("�����붨Ͷ���:");
	 		 amount3 = keyboard.nextInt();
	 		 System.out.println("�����������ʣ�������:");
	 		 rate1 = keyboard.nextInt();
	 		 rate1=rate1/100;
	 			 System.out.println("�����붨Ͷ������ʱ�䣩:");
	 			 year1 = keyboard.nextInt();			 
	 			m1=amount3*(1+rate1);
	 			 m2=-1+Math.pow((1+rate1),year1)	;
	 			m3=m1*m2;
	 		
	 		m=m3/rate1;
	 			
	System.out.println("���Ϊ"+m);
		}
		else if(ch.equals("h")||ch.equals("H"))
		{    double amount1,amount2;
			 System.out.println("�����������:");
	 		 amount = keyboard.nextDouble();
	 			 System.out.println("���������ʣ�������:");
	 		 rate = keyboard.nextDouble();
	 			 rate = rate/100;
	 			 System.out.println("������ʱ��:");
	 			 year = keyboard.nextInt();
		amount1=amount*rate*Math.pow((1+rate),year );
		amount2=Math.pow(1+rate, year-1);
		
		 result=amount1/amount2;
		 
		System.out.println("���Ϊ"+result);	
		}
	
	}
}
