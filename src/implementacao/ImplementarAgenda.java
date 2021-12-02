package implementacao;

import java.text.SimpleDateFormat;
import java.util.Date;

import beans.AgendaRevisao;

public class ImplementarAgenda {

	public static void main(String[] args) {
		SimpleDateFormat minhaData = new SimpleDateFormat("dd/mm/yyyy");

		AgendaRevisao agendamento = new AgendaRevisao();
		agendamento.data = minhaData("27/10/2021");
		agendamento.hora = minhaHora("10:00:00");
		agendamento.cliente = "Fulano da Silva";
		agendamento.fone = "(11) 954271753";
		agendamento.veiculo = "Ve�culo agendado";
		agendamento.modelo = "Modelo do ve�culo";

		System.out.println("A data do agendamento �: " + agendamento.data);
		System.out.println("O hor�rio agendado �: " + agendamento.hora);
		System.out.println("O cliente agendado �: " + agendamento.cliente);
		System.out.println("O telefone do cliente �: " + agendamento.fone);
		System.out.println("O ve�culo do cliente �: " + agendamento.veiculo);
		System.out.println("A marca do ve�culo �: " + agendamento.modelo);

	}

	private static Date minhaData(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Date minhaHora(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
