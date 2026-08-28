package codigos;

// Importa a biblioteca de scanner Java
import java.util.Scanner;


public class Aprendendo_java {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        // Começo obrigatório
        String operacao = "";
        linha();
        int res = v();

        while (true){
            linha();
            operacao = conta();
            int v = v();
            linha();
            res = calcular(v, res, operacao);
            String enc = cont().toUpperCase();
            if (enc.equals("N")){
                break;
            }
            
        }

        linha();
        System.out.printf("O resultado da operação é %d%n", res);
        linha();

    }

    // Mostra linha como enfeite
    public static void linha(){
        System.out.println("==================================================================");
    }
    public static int calcular(int v, int res, String operacao){
        if (operacao.equals("+")){
            return v + res;
        }
        else if (operacao.equals("*")){
            return res * v;
        }
        else if (operacao.equals("/")){
            return res / v;
        }
        else if (operacao.equals("-")){
            return res - v;
        }
        return 0;
    }

    // pede a operação que vai fazer
    public static String conta(){
        while (true){
            try {
                System.out.println("Qual operação deseja fazer?:");
                String res = scanner.next();
                if (res.equals("+")){
                   return res; 
                }
                else if (res.equals("-")){
                    return res;
                }
                else if (res.equals("*")){
                    return res;
                }
                else if (res.equals("/")){
                    return res;
                }
                else {
                    System.out.println("Operação inválida!");
                    linha();
                }
                
            }
            catch (Exception e){
                System.out.println("Tente de novo");
                scanner.nextLine();
            }

        }   

    }

    // Pede o valor do número
    public static int v(){
        while (true){
            try {
                System.out.println("Digite um número:");
                int v = scanner.nextInt();
                return v;        
            }
            catch (Exception e){
                System.out.println("Tente novamente!");
                scanner.nextLine();
            }
            
        }

    }

    // Pergunta se vai encerrar ou não
    public static String cont(){
        while (true) {
            try {
                System.out.println("Deseja continuar?[S/N]");
                String msg = scanner.next().toUpperCase();
                if (msg.equals("N") || msg.equals("S")){
                    return msg;
                }
                else {
                    System.out.println("Tente novamente!");
                }
            }
            catch (Exception e){
                System.out.println("Tente novamente!");
                scanner.nextLine();
            } 
        }
          
    }

}
