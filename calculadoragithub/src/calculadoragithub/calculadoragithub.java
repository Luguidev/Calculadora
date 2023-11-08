package calculadoragithub;
import java.util.*;


public class calculadoragithub {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

	        while (true) {
	            System.out.println("CALCULADORA SIMPLES");
	            System.out.println("1 - Adição");
	            System.out.println("2 - Subtração");
	            System.out.println("3 - Multiplicação");
	            System.out.println("4 - Divisão");
	            System.out.println("5 - Encerrar");

	            System.out.print("Digite a operação desejada (1-5): ");
	            int opc = input.nextInt();

	            if (opc == 5) {
	                System.out.println("Encerrando a calculadora.");
	                break;
	            }

	            System.out.print("Digite o primeiro número: ");
	            if (!input.hasNextFloat()) {
	                System.out.println("Erro: Entrada inválida. Insira um número válido.");
	                input.next(); // Limpa a entrada inválida
	                continue;
	            }
	            float a = input.nextFloat();

	            System.out.print("Digite o segundo número: ");
	            if (!input.hasNextFloat()) {
	                System.out.println("Erro: Entrada inválida. Insira um número válido.");
	                input.next(); // Limpa a entrada inválida
	                continue;
	            }
	            float b = input.nextFloat();

	            float resultado = 0;

	            switch (opc) {
	                case 1:
	                    resultado = a + b;
	                    break;
	                case 2:
	                    resultado = a - b;
	                    break;
	                case 3:
	                    resultado = a * b;
	                    break;
	                case 4:
	                    if (b != 0) {
	                        resultado = a / b;
	                    } else {
	                        System.out.println("Erro: Divisão por zero não é permitida.");
	                        continue;
	                    }
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	                    continue;
	            }

	            System.out.println("Resultado: " + resultado);
	        }

	        input.close();
	    }
	}


