//instance method
class person
{
	int rollno;
	String name;
public void getdata()
{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		name = sc. next();
		System.out.println("enter your rollno");
		rollno = sc. next();
}
	public void display ()
{
System.out.println("your roll no is:" + rollno);
System.out.println("your name is:"+ name);
}
}
