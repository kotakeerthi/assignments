class First{
public static void main(String args[]){
int c;
System.out.println(c=Integer.parseInt(args[0]));
if(c>0){
System.out.println("Positive");
}
else if(c<0){
System.out.println("Negative");
}
else if(c==0){
System.out.println("Zero");
}
}
}
