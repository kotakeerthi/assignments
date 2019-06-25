class Fourteen{
public static void main(String args[]){
if(args.length==0){
System.out.println("please enter an integer");
}

else {
int i=Integer.parseInt(args[0]);
if(i==0||i==1){
System.out.println(i+" "+"is neither prime nor composite");
}
else{
int c=0;
for(int j=1;j<=i;j++){
if(i%j==0){
c++;
}
}
if(c==2){
System.out.println("Prime");
}
else System.out.println("Not Prime");
}
}
}
}
