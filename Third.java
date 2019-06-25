class Third{
public static void main(String args[]){
if(args.length==0){
System.out.println("No Values");
}
else 
	for(String i:args){
		if(i.equals(args[args.length-1])){
			System.out.println(i);
		}
		else {
		System.out.print(i+",");
}
	}
}
}
