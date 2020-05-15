import java.util.Locale;
import java.util.Scanner;
public class avaliacaoPrimeira {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidade, atraso, scoreCompras, scoreInadimplencia,scoreFormaPagamento;
		double ticketMedio, volumeCompras;
		char formaPagamento;
		
		scoreCompras = 0;
		scoreInadimplencia = 0;
		scoreFormaPagamento = 0;
		
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
		
		
		//Score de inadimplencia e pagamento
		
		if (atraso > 1 || quantidade == 0) {
			scoreInadimplencia = 0;
		}
		else if (quantidade > 0 && atraso == 1) {
			scoreInadimplencia = 15;
		}
		else if (quantidade > 0 && atraso == 0 ) {
			scoreInadimplencia = 30;
		}
		System.out.println();
		System.out.println("Score de inadimplência = " + scoreInadimplencia + " pontos");
		
		
		if (quantidade >= 1 && formaPagamento == 'd' || formaPagamento == 'D') {
			scoreFormaPagamento = 5;
		}
		
		else if ( quantidade >= 1 && formaPagamento == 'c' || formaPagamento == 'C' || formaPagamento == 'b' || formaPagamento == 'B') {
			scoreFormaPagamento = 10;
		}
		
		
		System.out.println("Score de forma de pagamento = " + scoreFormaPagamento + " pontos");
		
		
		sc.close();
	}

}
