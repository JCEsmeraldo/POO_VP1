import java.util.*;

public class Mesa extends Bar{
 int numero;
 ArrayList<Produto> produtos = new ArrayList<>();
 
 public void adicionarProduto(Produto produto){
  produtos.add(produto);
 }
 
 public String listarConta() {
  String conta = "";
  
  for(int i = 0; i < produtos.size(); i++ ) {
   Produto p = produtos.get(i);
   conta = conta + p.nome + " - " + p.preco +  "\n";
  }
  
  
  return conta;
 }
 
 public double valorConta() {
	  double conta = 0;
	  
	  for(int i = 0; i < produtos.size(); i++ ) {
	   Produto p = produtos.get(i);
	   conta = conta + p.preco;
	  }
	 
	  return conta;
	 }
 
}