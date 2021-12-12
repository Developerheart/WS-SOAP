package soap.calculadora;

import java.net.MalformedURLException;

public class CalculadoraClient {

	public static void main(String[] args) throws MalformedURLException {
		Calculadora calculadora = CalculadoraService.Build();
		Float resultado = calculadora.func(110F, 10F, "sub");
		System.out.println(resultado);

	}


}
