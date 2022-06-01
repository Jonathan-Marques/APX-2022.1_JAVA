//APX de POO Questão 1
//Jonathan Santiago Marques, Matricula:20213050125
public class APX1_2022_1_Q1 {
    public static void main(String args[]){
        Intercalacoes(args[0],args[1]);
    }
    // IMPLEMENTE ESSE METODO
    public static void Intercalacoes(String s1, String s2){
        System.out.println(s1 + s2); //PRINT PRIMEIRA LINHA
        String[] ps = s1.split(""); // A PRIMEIRA STRING
        String pcps = ps[0]; // O PRIMEIRO CARACTER DA PRIMEIRA STRING
        String scps = ps[1]; // O SEGUNDA CARACTER DA PRIMEIRA STRING
        String[] segString = s2.split(""); // A SEGUNDA STRING
        String pcSegString = segString[0]; // O PRIMEIRO CARACTER DA SEGUNDA STRING
        String segcarSegString = segString[1]; // O SEGUNDO CARACTER DA SEGUNDA STRING
        System.out.println(pcps+pcSegString+scps+segcarSegString); //PRINT SEGUNDA LINHA
        System.out.println(pcps+pcSegString+segcarSegString+scps); //PRINT TERCEIRA LINHA
        System.out.println(pcSegString+pcps+scps+segcarSegString); //PRINT QUARTA LINHA
        System.out.println(pcSegString+pcps+segcarSegString+scps); //PRINT QUINTA LINHA
        System.out.println(pcSegString+segcarSegString+pcps+scps); //PRINT SEXTA LINHA
    }

}