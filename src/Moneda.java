
public class Moneda implements Conversor {

	private String accion;
	private static boolean invertido;

	@Override
	public double calcular(double valor, String accion) {
		
		 if (invertido == true){
		 return acciones(accion) * valor;
		 } else{
			 return valor / acciones(accion);
		}

	}
	
	@Override
	public double acciones(String accion) {

		switch (accion) {
		case "Peso mxn a Dólar":
			setAccion(" Dolar(es)");
			this.invertido = false;
			return 17.89;
		case "Dólar a peso MXN":
			setAccion(" Peso(s) mexicano(s)");
			this.invertido = true;
			return 17.89;
		case "Peso mxn a Euro":
			setAccion(" Euro(s)");
			this.invertido = false;
			return 19.21;
		case "Euro a peso MXN":
			setAccion(" Peso(s) mexicano(s)");
			this.invertido = false;
			return 19.21;
		case "Peso mxn a Libras":
			setAccion(" Libra(s)");
			this.invertido = false;
			return 21.63;
		case "Libra a peso MXN":
			setAccion(" Peso(s) mexicano(s)");
			this.invertido = true;
			return 21.63;
		case "Peso mxn a Yen":
			setAccion(" Yen(es)");
			this.invertido = false;
			return 0.13;
		case "Yen a peso MXN":
			setAccion(" Peso(s) mexicano(s)");
			this.invertido = true;
			return 0.13;
		case "Peso mxn a Won Coreano":
			setAccion(" Won(es)");
			this.invertido = false;
			return 0.014;
		case "Won Coreano a peso MXN":
			setAccion(" Peso(s) mexicano(s)");
			this.invertido = true;
			return 0.014;
		default:
			// code block
		}
		return 0;
	}

	@Override
	public void setAccion(String accion) {
		this.accion = accion;
	}

	@Override
	public String getAccion() {
		return accion;
	}

	
	public boolean convertidorInvertido(String divisas) {
		if (divisas == "Dólar a peso MXN" || divisas == "Euro a peso MXN" || divisas == "Libra a peso MXN"
		 	|| divisas == "Yen a peso MXN" || divisas == "Won Coreano a peso MXN") {
			this.invertido = true;
			return true;
		} else {
			this.invertido = false;
			return false;
		}

	}

}
