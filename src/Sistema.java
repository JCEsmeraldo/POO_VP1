import javax.swing.JOptionPane;

public class Sistema {
 public static void main(String[] args){
  
  String nomeBar = JOptionPane.showInputDialog("Qual é o nome do seu bar?");
  Bar bar = new Bar(nomeBar);
  
  Mesa m1 = new Mesa();
  m1.numero = 1;
  
  Produto p1 = new Produto();
  p1.nome = JOptionPane.showInputDialog("Qual é o nome do produto que voce deseja adicionar a mesa?");
  p1.preco = Double.parseDouble(JOptionPane.showInputDialog("Qual é o preço do produto " + p1.nome + "?"));
  
  m1.adicionarProduto(p1); 

  double conta = m1.valorConta();
  
  JOptionPane.showMessageDialog(null, "O nome do seu bar eh: " + bar.nome);
  JOptionPane.showMessageDialog(null, "O valor da sua conta eh: " + conta);
 }
}
