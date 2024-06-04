
import javax.swing.JOptionPane;
import calculadora.Calculadora;

public class Main {

    public static void main(String[] args) {
        String opcao = "";
        Calculadora calculadora = new Calculadora();

        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog("Qual operação deseja fazer? \n 1. Soma \n 2. Subtração \n 3. Multiplicação \n 4. Divisão \n 9. Sair");
            switch (Integer.parseInt(opcao)) {
                case 1:
                    calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A: ")));
                    calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B: ")));
                    JOptionPane.showMessageDialog(null, "Soma de " + calculadora.getValorA() + " e " + calculadora.getValorB() + ": " + calculadora.getAdicao());
                    break;
                case 2:
                    calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A: ")));
                    calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B: ")));
                    JOptionPane.showMessageDialog(null, "Subtração de " + calculadora.getValorA() + " e " + calculadora.getValorB() + ": " + +calculadora.getSubtracao());
                    break;
                case 3:
                    calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A: ")));
                    calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B: ")));
                    JOptionPane.showMessageDialog(null, "Multiplicação de " + calculadora.getValorA() + " e " + calculadora.getValorB() + ": " + calculadora.getProduto());
                    break;
                case 4:
                    calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A: ")));
                    calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B: ")));
                    JOptionPane.showMessageDialog(null, "Divisão de " + calculadora.getValorA() + " e " + calculadora.getValorB() + ": " + calculadora.getDivisao());
                    break;
            }
        }

    }
}
