package Collections;

public class Hotels {

	String name ;
	String loc;
	Hotels(String n, String l){
		this.name=n;
		this.loc=l;
		
	}
   public int compareTo(Hotels h) {
	   return this.loc.compareTo(loc);
   }
}
