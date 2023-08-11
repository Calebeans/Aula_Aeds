import java.io.*;
public class Main {

    public static void main(String[] args){

        String arq = "E:/Users/0048606/IdeaProjects/aeds/teste.txt";



        String lista[] = {"C", "A", "S", "A", "M", "E", "N", "T", "O", "S", "I", "I"};
        int tam = 12;
        /*for (int i = 0; i < tam; i++){
            System.out.println(lista[i]);
        }*/
        bubbleSort(lista, tam);

        String conteudo;

        for (int i = 0; i < tam; i++){
            conteudo = lista[i];
            //System.out.println(lista[i]);
            write(arq, lista[i]);
        }



    }

    public static void bubbleSort(String lista[] , int tam){
        int troca;
        String aux;
        for (int i = 0; i < tam - 1; i++){
            troca = 0;
            for (int j = 1; j < tam - i; j++){
                if(lista[j].compareTo(lista[j-1]) < 0){
                    aux = lista[j];
                    lista[j] = lista[j-1];
                    lista[j-1] = aux;
                }
            }
        }
    }

    public static boolean write(String caminho, String conteudo){
        try {
            FileWriter arq = new FileWriter(caminho);
            PrintWriter gravaArq = new PrintWriter(arq);
            gravaArq.println(conteudo);
            gravaArq.close();
            return true;
        }catch (IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}