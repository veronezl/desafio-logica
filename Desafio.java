import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       String name;
       int qtdXp;
       String temporaria = "";
       
       name = sc.nextLine();
       qtdXp = sc.nextInt();

       if(qtdXp < 1000) {
        temporaria = "Ferro";
       }
       else if(qtdXp > 1001 && qtdXp < 2001) {
        temporaria = "Bronze";
       }
       else if(qtdXp > 2000 && qtdXp < 5001) {
        temporaria = "Prata";
       }
       else if(qtdXp > 5000 && qtdXp < 7001) {
        temporaria = "Ouro";
       }
       else if(qtdXp > 7000 && qtdXp < 8001) {
        temporaria = "Platina";
       }
       else if(qtdXp > 8000 && qtdXp < 9001) {
        temporaria = "Ascendente";
       }
       else if(qtdXp > 9000 && qtdXp < 10001) {
        temporaria = "Imortal";
       }
       else {
        temporaria = "Radiante";
       }

       System.out.println("O Herói de nome " + name + 
       " está no nível de " + temporaria +".");

       sc.close();
        
    }
}