package view;

import java.time.LocalDate;
import java.util.Scanner;

import model.Movimentacao;

public class fakeWindow {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String movimentacao = input.nextLine();
		String locaoPessoa = input.nextLine();
		String pagamento = input.nextLine();
		String status=input.nextLine();
		LocalDate dataMovimentacao = LocalDate.now();
		double valor=input.nextDouble();
		
		
		Movimentacao movi = new Movimentacao();
		movi.setDataMovimentacao(dataMovimentacao);
		movi.setMovimentacao(movimentacao);
		movi.setLocaoPessoa(locaoPessoa);
		movi.setPagamento(pagamento);
		movi.setStatus(status);
		movi.setValor(valor);
		
		String msg = "";
		msg+= movi.getDataMovimentacao()+ "  | ";
		msg+= movi.getMovimentacao()+"  | ";
		msg+= movi.getLocaoPessoa()+"  | ";
		msg+= movi.getPagamento()+"  | ";
		msg+= movi.getValor() + "  | ";
		msg+= movi.getStatus()+ "  | ";
		
		System.out.println(msg);
		
		
	}
}
