
public class Temperatura  implements Conversor{
	private String accion;
	
	
	@Override
	public double calcular(double valor, String accion) {
		
		return valor * acciones(accion);
	}

	@Override
	public void setAccion(String accion) {
		this.accion = accion;
		
	}

	@Override
	public String getAccion() {
		
		return accion;
	}

	@Override
	public double acciones(String accion) {
		
		switch(accion){
		case "Celcius a Farenheit":
			setAccion(" Farenheit");
			return 33.8;			
		case "Celcius a Kelvin":
			setAccion(" kelvin");
			return 274.15;		
		case "Farenheit a Celcius":
			setAccion(" Celcius"); 
			return -17222222;
		case "Farenheit a Kelvin":
			setAccion(" Kelvin"); 
			return 255927778;
		case "Kelvin a Celcius":
			setAccion(" Celcius"); 
			return -272.15;
		case "Kelvin a Farenheit":
			setAccion(" Farenheit"); 
			return -457.87;
		default:
			
		}
		return 0;
	}
}
