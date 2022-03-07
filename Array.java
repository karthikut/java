class Array{
public static void main(String[] args){

String[] comanyNames= {"tata", "maruti", "hyundai", "bmw", "audi", "benz"};
System.out.println(comanyNames[4]);	

int[] ticketNo={7,9,11,13,15,17,19,21,23,2,5,8,6};
System.out.println(ticketNo[6]);

int equal= ticketNo.length;
System.out.println("equal length is" + equal);

System.out.println(ticketNo[equal-5]);
System.out.println(ticketNo[equal-9]);
System.out.println(comanyNames[0]);
System.out.println(ticketNo[equal-10]);

System.out.println(equal);
}
}