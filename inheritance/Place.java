class Place{
static boolean touristPlace;
int population;
int beach;

Place(){
	
	System.out.println("goa is one of the famous tourist place");
}
Place(boolean touristPlace, int population, int beach){
	this();
	this.touristPlace=touristPlace;
	this.population=population;
	this.beach=beach;
	
	System.out.println(Place.touristPlace);
	System.out.println(beach);
	System.out.println(population);
	
	
	System.out.println("goa is one of the famous for beach");
}

}