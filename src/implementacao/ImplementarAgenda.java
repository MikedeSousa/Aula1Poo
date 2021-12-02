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
		agendamento.veiculo = "Veículo agendado";
		agendamento.modelo = "Modelo do veículo";

		System.out.println("A data do agendamento é: " + agendamento.data);
		System.out.println("O horário agendado é: " + agendamento.hora);
		System.out.println("O cliente agendado é: " + agendamento.cliente);
		System.out.println("O telefone do cliente é: " + agendamento.fone);
		System.out.println("O veículo do cliente é: " + agendamento.veiculo);
		System.out.println("A marca do veículo é: " + agendamento.modelo);

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
