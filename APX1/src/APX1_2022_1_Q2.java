//APX de POO Questão 2
//Jonathan Santiago Marques, Matricula:20213050125
public class APX1_2022_1_Q2 {
    public static void main(String [] args) {
        Arquivo apx1q1 = new Arquivo("APX1_POO_Q1", "txt", 14.0);// CRIANDO ARQUIVO DE APX Q1
        Arquivo apx1q2 = new Arquivo("APX1_POO_Q2", "txt", 14.0);// CRIANDO ARQUIVO DE APX Q2
        Item apxs[] = {apx1q1, apx1q2};// ARMAZENANDO O ARQUIVO DENTRO DO VETOR ITEM
        Diretorio diretorio_aps = new Diretorio("APs", apxs);// CRIANDO UM NOVO DIRETORIO APXs
        Arquivo ad1 = new Arquivo("AD1_FAC", "txt", 13.0);//CRIANDO ARQUIVO DE AD1
        Arquivo ad2 = new Arquivo("AD2_FAC", "txt", 14.0);//CRIANDO ARQUIVO DE AD2
        Item ads[] = {ad1, ad2};//ARMAZENANDO O ARQUIVO DENTRO DO VETOR ITEM
        Diretorio diretorio_ads = new Diretorio("ADs", ads);// CRIANDO UM NOVO DIRETORIO ADs
        Arquivo ad1_poo = new Arquivo("AD1_POO", "txt", 14.0);//CRIANDO ARQUIVO DE AD1 POO
        Item ad[] = {ad1_poo};//ARMAZENANDO O ARQUIVO DENTRO DO VETOR ITEM
        Diretorio diretorio_ads_poo = new Diretorio("ADs", ad);//CRIANDO UM NOVO DIRETORIO ADs POO
        Diretorio diretorio_notas[] = {diretorio_ads, diretorio_aps}; //SALVANDO O VALOR DA VARIAVEIS ADS E APS DO
        // DIRETORIO E ARMAZENANDO NA VARIAVEL DIRETORIO_NOTAS
        Diretorio dir3 = new Diretorio("Avaliacoes", diretorio_notas);//ARMAZENANDO OS DADOS NA VARIAVAL DIR3
        System.out.println(dir3);// IMPRIMINDO O VALOR DA VARIAVEL DIR 3
        System.out.println(diretorio_aps);//IMPRIMINDO O VALOR DA VARIAVEL DIRETORIO_APS
        System.out.println(diretorio_ads+"\n" +"\n"+diretorio_ads+"\n"+ad1+""+ad1_poo);//IMPRIMINDO O VALOR DA VARIAVEL
        // DIRETORIO_ADS, AD1, AD1_POO
        System.out.println(diretorio_ads_poo +"\n"+ ad1_poo);//IMPRIMINDO O VALOR DA VARIAVEL DIRETORIO_ADS_POO, AD1_POO
        Diretorio diretorio_notas2[] = {diretorio_ads_poo, diretorio_aps};//ARMAZENANDO VALORES DA VARIAVEL DIRETORIO_ADS_POO,
        //DIRETORIO_APS DIRETORIO_NOTAS2
        Diretorio dir4 = new Diretorio("Avaliacoes", diretorio_notas2);//ARMAZENANDO OS DADOS NA VARIAVAL DIR4
        System.out.println(dir4+"\n"+diretorio_aps+"\n"+diretorio_ads_poo);//IMPRIMINDO O VALOR DA VARIAVEL DIR4
        // DIRETORIO_APS, DIETORIO_ADS_POO

    }
}