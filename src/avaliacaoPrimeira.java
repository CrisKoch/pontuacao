import java.util.Locale;
import java.util.Scanner;
public class avaliacaoPrimeira {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidade, atraso;
		double ticketMedio, volumeCompras;
		char formaPagamento;
		
		//Cabecalho
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		
		//Leitura do volume
		
		System.out.println();
		System.out.print("Quantas compras o cliente fez no último ano? ");
		quantidade = sc.nextInt();
		System.out.print("Qual o ticket médio? ");
		ticketMedio = sc.nextDouble();
		
		
		volumeCompras = quantidade * ticketMedio;
		
		//Leitura dos outros dados
		
		System.out.println();
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		atraso = sc.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		formaPagamento = sc.next().charAt(0);
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
