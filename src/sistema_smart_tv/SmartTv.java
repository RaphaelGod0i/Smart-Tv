package sistema_smart_tv;

public class SmartTv {
	
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public void ligar() {	
		ligada = true;	
		if(ligada == true) {
			System.out.println("TV ligada");
		}
	}
	
	public void desligar() {	
		ligada = false;
		if(ligada == false) {
			System.out.println("TV desligada");
		}
	}
	
	public void volumeAtual() {
		System.out.println("Volume atual é: " + volume);
	}
	
	public void aumentarVolume() {
		
		volume += 5;
		System.out.println("Aumentando volume para " + volume);
	}
	
	public void diminuirVolume() {
		
		volume -= 5;
		System.out.println("diminuindo volume para " + volume);
	}

	public void avancarCanal() {
		canal++;
		System.out.println("aumentando canal para " + canal);
	}
	
	public void voltarCanal() {
		canal--;
		System.out.println("voltando canal para " + canal);
		
	}
	
	public void mudarCanal (int novoCanal) {
		canal = novoCanal;
		System.out.println("mudando canal para " + canal);
		
	}
	
	public void canalAtual() {
		
		System.out.println("O canal atual é: " + canal);
	}
	
}
