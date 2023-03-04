package sistema_smart_tv;

import java.util.Scanner;

public class Usuario {
	
	public static void main(String[] agrs) {
		
		int canal = 2;
		String controleCanal = "manter";
		
		SmartTv smartTv = new SmartTv();
		Scanner teclado = new Scanner(System.in);
		
		smartTv.desligar();
		
		System.out.println("A TV está desligada, deseja liga-la?");
		String resp = teclado.next();
		
			if(resp.equals("sim")) {
			smartTv.ligar();
			
			}else {
			System.out.println("A TV continuará desligada");
			 System.exit(0);
			}
		
			smartTv.volumeAtual();
			smartTv.canalAtual();
		
		do {
			
			System.out.println("Deseja aumentar, diminuir ou manter o volume atual?");
			String volume = teclado.next();
			
			switch(volume) {
			case "aumentar":
				smartTv.aumentarVolume();
				smartTv.volumeAtual();
				break;
			
			case "diminuir":
				smartTv.diminuirVolume();
				smartTv.volumeAtual();
				break;
				
			case "manter":
				System.out.println("Volume não mudará");
				smartTv.volumeAtual();
				break;
			
			}
			
			System.out.println("Deseja assistir esse canal, avançar, voltar ou selecionar?");
			String trocar = teclado.next();
			
			if(trocar.equalsIgnoreCase("avançar")) {
				smartTv.avancarCanal();
				smartTv.canalAtual();
				
			}else if(trocar.equalsIgnoreCase("voltar")) {
				smartTv.voltarCanal();
				smartTv.canalAtual();
				
			}else if(trocar.equalsIgnoreCase("selecionar")) {
				System.out.println("Informe o canal: ");
				canal = teclado.nextInt();
				smartTv.mudarCanal(canal);
				smartTv.canalAtual();
			}
				
			System.out.println("Deseja desligar ou alterar?");
			controleCanal = teclado.next();
			
		}while(controleCanal.equalsIgnoreCase("alterar"));
		
	smartTv.desligar();
	System.exit(0);
	}

	
	
}
