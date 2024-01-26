package desafioFinalLogicaDio;

public class Heroi {
	
	private String name;
	private int idade;
	private String tipo;
	
	public Heroi(String name, int idade, String tipo) {
		this.name = name;
		this.idade = idade;
		this.tipo = tipo;
	}
	
	public void atacar() {
		String ataque;
		
		// Determina o tipo de ataque com base no tipo do personagem
        if (tipo.equals("mago")) {
            ataque = "usou magia";
        } else if (tipo.equals("guerreiro")) {
            ataque = "usou espada";
        } else if (tipo.equals("monge")) {
            ataque = "usou artes marciais";
        } else if (tipo.equals("ninja")) {
            ataque = "usou shuriken";
        } else {
            ataque = "ataque desconhecido";
        }

        // Exibe a mensagem de ataque
        System.out.println("O " + tipo + " atacou usando " + ataque);
    
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	
	

}
