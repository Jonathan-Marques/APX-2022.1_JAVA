//pacote da classe APX1_2022_1_Q2
////APX de POO Questão 2
//Jonathan Santiago Marques, Matricula:20213050125
abstract class Item {
    abstract double getTamanho();
}
class Arquivo extends Item {
    String nome;
    String extensao;
    double tamanho;
    public Arquivo(String nome, String extensao, double tamanho) {
        this.nome = nome;
        this.extensao = extensao;
        this.tamanho = tamanho;
    }
    public String toString() {
        return this.nome + "." + this.extensao + " " + this.tamanho + "\n";
    }
    double getTamanho() {
        return this.tamanho;
    }
}
class Diretorio extends Item {
    String nome;
    Item conteudo[];
    public Diretorio(String nome, Item[] conteudo) {
        this.nome = nome;
        this.conteudo = conteudo;

    }
    public String toString() {
        String saida = this.nome + " "+ this.getTamanho();
        //removido a função que retornava o nomes dos arquivos
        //if (this.conteudo != null)
           // for (Item i : conteudo) {
               // saida += i;
         //   }

        return saida;
    }

    double getTamanho() {
        double total = 0;
        for (Item i : conteudo) {
            total += i.getTamanho();
        }
        return total;
    }
}