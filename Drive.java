class Drive{

public static void main (String[] args){
	
	String name= new String("unsafe");
	boolean newName= name.startsWith("un");
	System.out.println(newName);
	
	String type= new String("importance");
	System.out.println(type.endsWith("ance"));
	System.out.println(type.endsWith("bad"));
	
	
	System.out.println(name.startsWith("un"));
	
	String call= new String("unhappy");
	String c= ("hello java boy abhishek");
	System.out.println(c.substring(6,19));
	
	String newCall= call.substring(2);
	System.out.println(newCall);
	System.out.println(call.substring(1,5));
	
	
	int len;
	String s= new String("   hello brother    ");
	System.out.println(s);
	
	len=s.length();
	System.out.println("length of the string before"+len);
	s= s.trim();
	
	len=s.length();
	System.out.println("length of the string after"+len);
	System.out.println(s);
	
	String x= new String("happiest");
	System.out.println(x.equals("happy"));
	System.out.println(x.equals("happiest"));
	
	String a= new String("happiest");
	System.out.println(a.indexOf(0,7));
	
	String b= new String("good");
	boolean f= b.isEmpty();
	System.out.println(f);
	
	String h= new String();
	boolean g= h.isEmpty();
	System.out.println(g);
	
	String m=("FLASHMOB");
	System.out.println(m.toLowerCase());
	
	String n=("great");
	System.out.println(n.toUpperCase());
	
	
	
	
	
	
	
	
	
	
	
	
}


}