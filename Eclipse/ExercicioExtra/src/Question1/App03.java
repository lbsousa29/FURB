package Question1;

public class App03 {
	 public static void incrementarIdade(Pessoa p) {
	        int idadeAtual = p.getIdade();
	        p.setIdade(idadeAtual + 5);
	    }

	    public static void main(String[] args) {
	        Pessoa pessoa = new Pessoa();
	        pessoa.setNome("Maria");
	        pessoa.setIdade(15);
	        pessoa.setAltura(1.65);
	        pessoa.setPeso(60);

	        System.out.println("Idade antes do incremento: " + pessoa.getIdade());

	        incrementarIdade(pessoa);

	        System.out.println("Idade depois do incremento: " + pessoa.getIdade());
	    }
}
