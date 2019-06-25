class Thirteen{
public static void main(String args[]){
int c=0,i,j;
for(j=10;j<=99;j++){
int n=j;
c=0;
for(i=1;i<=n;i++){

if(n%i==0){
c++;
}
}
if(c==2){
System.out.println(j);
}
}
}
}

