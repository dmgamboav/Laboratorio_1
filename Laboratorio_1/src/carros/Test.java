package carros;
public class Test {

	public static void main(String[] args) {
		//System.out.println("hola mundo");
		/*System.out.println(CarrosEnum.PICKUP.getNombre());
		System.out.println(CarrosEnum.SEDAN.getNombre());
		System.out.println(CarrosEnum.SUV.getNombre());*/
		
		ejecutarCarros(CarrosEnum.SEDAN);
		
	}
	
	private static void ejecutarCarros(CarrosEnum carro) {
	  if(carro.equals(CarrosEnum.PICKUP)) {
		  System.out.println("Soy hilux");	
	  }
	
	  if(carro.equals(CarrosEnum.SEDAN)) {
		  System.out.println("Soy corolla");	
	  }
	  
	  if(carro.equals(CarrosEnum.SUV)) {
		  System.out.println("Soy rav4");
	  }
	
	}
	
	/*private static void ejecutarCarros(String carro) {
		
		assert(!"Crossover".equals(carro));
		
		if ("Pickup".equals(carro)) {
		  System.out.println("Soy hilux");	
		}
		
		if ("Sedan".equals(carro)) {
			 System.out.println("Soy corolla");	
		}
		
		if ("Suv".equals(carro)) {
			 System.out.println("Soy rav4");	
		}
	}*/
	
	
	

}
