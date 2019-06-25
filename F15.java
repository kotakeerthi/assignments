class F15{
public static void main(String ar[])
{
int sum;
int num=Integer.parseInt(ar[0]);
for(sum=0;num>0;num=num/10){
sum=sum+num%10;
}
System.out.printf("%d",sum);

}
}
