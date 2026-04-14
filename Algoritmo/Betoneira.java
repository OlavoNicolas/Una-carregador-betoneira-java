import java.util.Scanner;

public class Betoneira {
public static void main(String[] args) {

    Scanner ls = new Scanner(System.in);
    double pesoAlvo = 500.0, pesoAtual = 0.0;
    int ciclo = 0;

    System.out.println("Simulador de peso");
    System.out.println("Meta: " + pesoAlvo + " kg de brita.");
    
    do{
    System.out.println("Digite o peso da brita add (Kg)");
    double pesoAdd = ls.nextDouble();
    pesoAtual+=pesoAdd;
    ciclo++;

    System.out.println("Peso atual: " + pesoAtual + " Kg" + " peso alvo: " + pesoAlvo );
    
    }while (pesoAtual<pesoAlvo);

    
    if (pesoAtual > pesoAlvo + 1.05) {
        System.out.println("CUIDADO, Peso ultrapassado!");
    }else{
        System.out.println("Meta atingida no ciclo " + ciclo);

    }

    ls.close();
}    
}       