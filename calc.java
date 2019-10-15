import calculation.Calculate;

public class calc
{

public static void main(String ar[])
{

Calculate c=new Calculate();
int Add=c.Addition(10,20);
System.out.println("Addition is : "+Add);
int sub=c.Substraction(10,20);
System.out.println("Substraction is : "+sub);
int mul=c.Multiplication(10,20);
System.out.println("Multiplication is : "+mul);

}

}