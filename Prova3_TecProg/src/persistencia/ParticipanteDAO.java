package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import processamentoDados.ProcessamentoGeral;
import processamentoJanelas.GeracaoPlacarConfrontoSelecoes;

public class ParticipanteDAO {

	public void inserir(ProcessamentoGeral processamentoGeral) {
		try (Connection connection = new Conexao().getConexao()) {
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into bolaocopa (nome) values (?)");
			preparedStatement.setString(1, processamentoGeral.getNome());
			preparedStatement.executeUpdate();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	private void update(ProcessamentoGeral processamentoGeral, String query,
			ArrayList<GeracaoPlacarConfrontoSelecoes> etapa) {
		try (Connection connection = new Conexao().getConexao()) {
			PreparedStatement preparedStatemet = connection.prepareStatement(query);
			preencherStatement(preparedStatemet, processamentoGeral, etapa);
			preparedStatemet.executeUpdate();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void updateQuartasDeFinal(ProcessamentoGeral processamentoGeral) {
		String query = "update bolaocopa set QFS1 =?,QFS2=?,QFS3=?,QFS4=?,QFS5=?,QFS6=?,QFS7=?,QFS8=?,"
				+ "PQFS1=?,PQFS2=?,PQFS3=?,PQFS4=?,PQFS5=?,PQFS6=?,PQFS7=?,PQFS8=? where nome=?";
		update(processamentoGeral, query, processamentoGeral.getQuartas());
	}

	public void updateSemifinais(ProcessamentoGeral processamentoGeral) {
		String query = "update bolaocopa set SFS1=?,SFS2=?,SFS3=?,SFS4=?,"
				+ "PSFS1=?,PSFS2=?,PSFS3=?,PSFS4=? where nome=?";
		update(processamentoGeral, query, processamentoGeral.getSemi());
	}

	public void updateFinal(ProcessamentoGeral processamentoGeral) {
		String query = "update bolaocopa set FS1 =?,FS2=?," + "PFS1=?,PFS2=? where nome=?";
		update(processamentoGeral, query, processamentoGeral.getFaseFinal());
	}

	public void updateVencedor(ProcessamentoGeral processamentoGeral) {
		try (Connection connection = new Conexao().getConexao()) {
			String query = "update bolaocopa set SC =? where nome=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, processamentoGeral.getVencedor());
			statement.setString(2, processamentoGeral.getNome());
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void preencherStatement(PreparedStatement preparedStatement, ProcessamentoGeral processamentoGeral,
			ArrayList<GeracaoPlacarConfrontoSelecoes> g) {
		int cont = 1;
		try {
			for (String selecao : processamentoGeral.selecoes(g)) {
				preparedStatement.setString(cont, selecao);
				cont++;
			}
			for (Integer placar : processamentoGeral.placar(g)) {
				preparedStatement.setInt(cont, placar);
				cont++;
			}
			preparedStatement.setString(cont, processamentoGeral.getNome());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}