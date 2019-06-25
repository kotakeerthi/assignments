class Twelve{
public static void main(String args[]){
int c=0,i;
int n=Integer.parseInt(args[0]);
for(i=1;i<=n;i++){
if(n%i==0){
c++;
}
}
if(c==2){
System.out.println("Prime");
}
else System.out.println("Not Prime");
}
}

