import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double num1, num2, soma;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o primeiro numero:"));

        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Agora, informe o segundo numero:"));

        soma = num1 + num2; JOptionPane.showMessageDialog(null,"A soma dos numeros informados e: " + soma + "!");
        System.exit(0);
    }
}