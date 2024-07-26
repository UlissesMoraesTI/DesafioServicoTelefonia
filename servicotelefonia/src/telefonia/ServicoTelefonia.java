package telefonia;

import java.security.KeyStore.TrustedCertificateEntry;
import java.util.Scanner;

public class ServicoTelefonia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, informe o tipo de serviço:");		
		String servico = scanner.nextLine().trim();
				
		System.out.println("Por favor, informe nome Cliente seguido pelos serviços:");
		String entradaCliente = scanner.nextLine().trim();
		
		String[] partes = entradaCliente.split(",");
		
		String nomeCliente = partes[0];
		boolean contratado = false;
		
		for (int i = 0; i < partes.length; i++) {
			
			if (servico.equals(partes[i])) {
				contratado = true;
				break;
			} 
		}
		
		if (contratado == true) {
			System.out.println("Sim");
			} else {
			System.out.println("Nao");	
			}
		scanner.close();
		}		
	}
