package Question1;

import javax.swing.JOptionPane;

public class App01 {
	public static void main (String[]args) {
		Pessoa p = new Pessoa();
		p.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
		p.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:")));
		p.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:")));
		p.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:")));
		String resultado = "Nome: " + p.getNome()
        + ", Idade: " + p.getIdade()
        + ", Altura: " + p.getAltura()
        + ", Peso: " + p.getPeso();
		JOptionPane.showMessageDialog(null, resultado);
		
		
		
	}
}
