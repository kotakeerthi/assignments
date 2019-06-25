class Sixth{
public static void main(String args[]){
String s=args[0];
int a=Integer.parseInt(args[1]);
if(s.equals("Female")){
if(a>=1&&a<=58){
System.out.println("Interest is "+8.2+"%");
}
else if(a>=59&&a<=100){
System.out.println("Interest is "+9.2+"%");
}
}
else if(s.equals("Male")){
if(a>=1&&a<=58){
System.out.println("Interest is "+8.4+"%");
}
else if(a>=59&&a<=100){
System.out.println("Interest is "+10.4+"%");
}
}
}
}
