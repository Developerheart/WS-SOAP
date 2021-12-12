package soap.calculadora;


import javax.jws.WebService;

@WebService(endpointInterface = "soap.calculadora.Calculadora", serviceName = "Calculadora" )
public class CalculadoraImpl implements Calculadora{

	public Float soma(Float n1, Float n2) {
		return  n1 + n2;
	}

	public Float subtracao(Float n1, Float n2) {
		return  n1 - n2;
	}

	public Float func(Float n1, Float n2, String operador) {
		switch (operador){
			case "soma":
				return  n1 + n2;
			case "sub":
				return n1 - n2;
			case  "mult":
				return  n1 * n2;
			case  "div":
				return  n1 / n2;
			default:
				return  0F;
		}
	}
}
