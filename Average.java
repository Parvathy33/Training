class Average
{
public static float avg(int a, int b, int c)
 {
	int avge;
	avge = (a+b+c)/3;
	return avge;
}
public static void main(String[] args)
{
 float val = Average.avg(2,3,5);
 System.out.println("Average is" + val);
}
}