import javax.swing.JOptionPane;

public class Main {

	public static void Main() {
		Moneda moneda = new Moneda();
		Conversor temperatura = new Temperatura();

		try {

			// Seleccion de conversor(Divisas o temperatura)
			String convertidor = (JOptionPane.showInputDialog(null, "Seleccione el tipo de convertidor",
					"Convertidor de Monedas y temperatura", JOptionPane.PLAIN_MESSAGE, null,
					new Object[] { "Conversor de divisas", "Conversor de temperatura" }, "Selecciona")).toString();

			// Seccion si el usuario elige la opcion de "DIVISAS"

			if (convertidor == "Conversor de divisas") {
				String divisas = (JOptionPane.showInputDialog(null, "Selecciona la divisa que deseas convertir",
						"Seleccion de moneda", JOptionPane.PLAIN_MESSAGE, null,
						new Object[] { "Peso mxn a Dólar", "Peso mxn a Euro", "Peso mxn a Libras", "Peso mxn a Yen",
								"Peso mxn a Won Coreano", "Dólar a peso MXN", "Euro a peso MXN", "Libra a peso MXN",
								"Yen a peso MXN", "Won Coreano a peso MXN" },
						"Selecciona")).toString();

				// SECCION DE INGRESAR VALOR
				// si escoge de moneda extranjera a moneda nacional
				if (moneda.convertidorInvertido(divisas)) {
					// try {
					Double valor = Double.parseDouble(JOptionPane.showInputDialog(null,
							"Introduce la cantidad en moneda extranjera a peso mexicano"));

					JOptionPane.showMessageDialog(null,
							"El resultado es : " + moneda.calcular(valor, divisas) + moneda.getAccion());

				}
				// si escoge de moneda nacional a moneda extranjera.
				else {

					Double valor = Double.parseDouble(JOptionPane.showInputDialog(null,
							"Introduce la cantidad en peso mexicano, que deseas convertir."));

					JOptionPane.showMessageDialog(null, "El resultado es : "
							+ String.format("%.2f", moneda.calcular(valor, divisas)) + moneda.getAccion());

				}

			}
			// Seccion si el usuario elige la opcion de "TEMPERATURA"
			else if (convertidor == "Conversor de temperatura") {
				String temperaturaS = (JOptionPane.showInputDialog(null,
						"Selecciona la temperatura que deseas convertir", "" + "Seleccion de temperatura",
						JOptionPane.PLAIN_MESSAGE, null,
						new Object[] { "Celcius a Farenheit", "Celcius a Kelvin", "Farenheit a Celcius", "Farenheit a Kelvin", "Kelvin a Celcius", "Kelvin a Farenheit"  },
						"Selecciona")).toString();

				Double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el valor de Celcius"));

				JOptionPane.showMessageDialog(null,
						"El resultado es " + temperatura.calcular(valor, temperaturaS) + temperatura.getAccion());

			}

			// seccion si desea continuar o salirse
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea continuar");

			if (resp == JOptionPane.YES_OPTION) {
				Main();
			} else if (resp == JOptionPane.NO_OPTION | resp == JOptionPane.CANCEL_OPTION ) {
				JOptionPane.showMessageDialog(null, "Programa terminado");
			}

		} catch (NullPointerException | NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Programa terminado");
		}

	}

	public static void main(String[] args) {
		Main();
	}
}