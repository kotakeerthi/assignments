class Eighteen{
public static void main(String args[]){
int n=Integer.parseInt(args[0]);
int k=n;
int r;
int sum=0;
if(n==0){
System.out.println("Palindrome");
}
while(n>0){
r=n%10;
sum=sum*10+r;
n=n/10;
}
if(k==sum){
System.out.println("Palindrome");

}
else System.out.println("Not Palindrome");
}
}
