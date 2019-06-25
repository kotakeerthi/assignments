class Eigth{
public static void main(String args[]){
if(args.length==0){
System.out.println("please enter a Code");
}
else{
String s=args[0];
char c=s.charAt(0);
switch(c) {
         case 'R' :
            System.out.println("RED"); 
            break;
         case 'B' :
            System.out.println("BLUE");
            break;
         case 'G' :
            System.out.println("GREEN");
	    break;
         case 'O' :
            System.out.println("ORANGE");
            break;
	 case 'Y' :
            System.out.println("YELLOW"); 
            break;
         case 'W' :
            System.out.println("WHITE");
            break;

         default :
            System.out.println("Invalid Code");
      }
}

}
}
