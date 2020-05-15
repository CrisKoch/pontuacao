import java.util.Locale;
import java.util.Scanner;
public class avaliacaoPrimeira {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidade, atraso, scoreCompras;
		double ticketMedio, volumeCompras;
		char formaPagamento;
		
		scoreCompras = 0;
		
		//Cabecalho
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("------------------------------");
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		
		//Leitura do volume
		
		System.out.println();
		System.out.print("Quantas compras o cliente fez no �ltimo ano? ");
		quantidade = sc.nextInt();
		System.out.print("Qual o ticket m�dio? ");
		ticketMedio = sc.nextDouble();
		
		
		volumeCompras = quantidade * ticketMedio;
		
		//Leitura dos outros dados
		
		System.out.println();
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		atraso = sc.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cart�o, ou boleto (D/C/B)? ");
		formaPagamento = sc.next().charAt(0);
		
		
		//Score do volume de compras
		
		if ( volumeCompras == 0 ) {
			scoreCompras = 0;
		}
		else if( volumeCompras < 3000.00 && quantidade <= 2) {
			scoreCompras = 20;
		}
		else if( volumeCompras < 3000.00 && quantidade > 2) {
			scoreCompras = 40;
		}
		else if( volumeCompras >= 3000.00) {
			scoreCompras = 60;
		}
		
		System.out.println();
		System.out.println("Score de volume de compras = " + scoreCompras + " pontos");
		
		
		
		sc.close();
	}

}
