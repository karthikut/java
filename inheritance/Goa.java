class Goa extends Place{
String beachName;
static int bar=75000;

Goa(String beachName, int bar){
	
	super(true, 100000, 25);
	
	this.beachName=beachName;
	this.bar=bar;
	
	System.out.println(Goa.bar);
}

}