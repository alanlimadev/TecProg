package processamentoDados;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import geracaoBotoesJanelas.BotaoCadNome;
import persistencia.ParticipanteDAO;
import processamentoJanelas.Final;
import processamentoJanelas.SelecaoCampea;
import processamentoJanelas.QuartasDeFinais;
import processamentoJanelas.Semifinais;

public class CadBolao extends JFrame {
	private ProcessamentoGeral processamentoGeral;
	private ParticipanteDAO p;
	private ProcessarQuartas processarQuartas;
	private ProcessarSemi processarSemi;
	private ProcessarFinal processarFinal;

	public CadBolao() {
		processamentoGeral = new ProcessamentoGeral();
		processarQuartas = new ProcessarQuartas();
		p = new ParticipanteDAO();
		run();
	}

	private void run() {
		janelaNome();
	}

	private void janelaNome() {
		JFrame jFrame = new JFrame("INFORMAÇÃO DO PARTICIPANTE DO BOLÃO");
		jFrame.setSize(new Dimension(437, 134));
		jFrame.setVisible(true);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel jPanel = new JPanel();
		JLabel jLabel = new JLabel("NOME:");
		jPanel.add(jLabel);
		JTextField jTextField = new JTextField(41);
		jPanel.add(jTextField);
		BotaoCadNome botaoCadNome = new BotaoCadNome(this, jFrame, jTextField);
		jPanel.add(botaoCadNome);
		jFrame.add(jPanel);
	}

	public void janelaQuartas() {
		p.inserir(processamentoGeral);
		QuartasDeFinais quartasDeFinais = new QuartasDeFinais(this);
	}

	public void janelaSemi() {
		processamentoGeral.setQuartas(processarQuartas.getGerar2());
		p.updateQuartasDeFinal(processamentoGeral);
		processarSemi = new ProcessarSemi(processarQuartas);
		Semifinais semifinais = new Semifinais(this);
	}

	public void janelaFinal() {
		processamentoGeral.setSemi(processarSemi.getGerar3());
		p.updateSemifinais(processamentoGeral);
		processarFinal = new ProcessarFinal(processarSemi);
		Final f = new Final(this);
	}

	public void janelaGanhador() {
		processamentoGeral.setFaseFinal(processarFinal.getGerar1());
		p.updateFinal(processamentoGeral);
		processamentoGeral.setVencedor(processarFinal.getVencedores().get(0));
		p.updateVencedor(processamentoGeral);
		SelecaoCampea selecaoCampea = new SelecaoCampea(this);
	}

	public ProcessamentoGeral getProcessamentoGeral() {
		return processamentoGeral;
	}

	public ProcessarQuartas getProcessarQuartas() {
		return processarQuartas;
	}

	public ProcessarSemi getProcessarSemi() {
		return processarSemi;
	}

	public ProcessarFinal getProcessarFinal() {
		return processarFinal;
	}

}