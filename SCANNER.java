import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        String nome = "";
        int idade = 0;
        double peso = 0.0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe seus dados:  ");
        idade = scanner.nextInt();
        scanner.nextLine();
        peso = scanner.nextDouble();
        scanner.nextLine(); 
        nome = scanner.nextLine();
        
        
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
          scanner.close();
    }
}
