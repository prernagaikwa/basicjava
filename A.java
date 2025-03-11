class A{
void add(){
int a,b,c;
c = a+b;
System.out.println("sum is c");
}
void add(int x, int y){
c= x+y;
System.out.println("sum is c");
}
void add ( int x, boolean y){
c = x+y;
System.out.println("sum is c");
}
}
Public static void main(String argds[])
{
A ref= new A();
ref.add();
ref add(4,5);
ref add(1,4);
System.out.println("add");
}

