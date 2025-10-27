public class Produto {
   public String nome;
   public double preco;
   public int qtd;


   public double totalValorEstoque() {
       return qtd * preco;
   }
   public void addProduto(int qtd) {
       this.qtd += qtd;
   }
   public void removerProduto(int qtd) {
       this.qtd -= qtd;
   }
   public double valorTotalEstoque() {
       return preco * qtd;
   }
   @Override
   public String toString(){
       return String.format("Produto: %s " +
                               "\nPreco: R$ %.2f" +
                                "\nQuantidade: %d" +
                                   "\nValor total em estoque: R$ %,2f",
                                   nome, preco, qtd, ()
   }
   /*@Override
   public String toString(){
       return "---------------------" +
               "\nProduto: " + nome +
               "\nPreço: " + preco +
               "\nQuantidade: " + qtd +
               "\nValor do estoque: " + (preco * qtd);
   }


}
