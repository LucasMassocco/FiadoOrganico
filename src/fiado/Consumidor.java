package fiado;

public class Consumidor {
	
	// Atributos
	private String nome;
	private int[] fiados;
	private int posicao = 0;
	private String fone;

	
	// construtor - prepara o objeto para mim
	public Consumidor(String nome) {
		this.nome = nome;
		this.fiados = new int[10]; //inicializa com um array de 10 posi��es
		this.fone = fone;
	}
	
	// Getter and Setter -  para resolver os Privates
	
	public String getFone( ) {
		return this.fone;
	}
	
	public void setfone (String fone ) {
		this.fone = fone;
	}
	
	public String getNome( ) {
		return this.nome;
	}
	
	public void setNome (String nome ) {
		this.nome = nome;
	}
	
	public void registrarFiado(int valor) {
		this.fiados[posicao] = valor;
		posicao++;
	}
	
	public int getFiado() {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
		}
		return total;
	}
}
