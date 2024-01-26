package desafioFinalLogicaDio;

public class Program {

	public static void main(String[] args) {
		
		Heroi monge = new Heroi("Lucas", 41, "monge");
		Heroi guerreiro = new Heroi("Luana", 18, "guerreiro");
		Heroi mago = new Heroi("Ronaldo", 50, "mago");
		Heroi ninja = new Heroi("Carla", 32, "ninja");
		
		monge.atacar();
		guerreiro.atacar();
		mago.atacar();
		ninja.atacar();
		
		

	}

}
