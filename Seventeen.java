class Seventeen{
public static void main(String args[]){
int n=Integer.parseInt(args[0]);
int r;
int sum=0;
if(n==0){
System.out.println(n);
}
while(n>0){
r=n%10;
sum=sum*10+r;
n=n/10;
}
System.out.println(sum);
}

}
