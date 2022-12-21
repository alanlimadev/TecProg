package geracaoBotoesJanelas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

import processamentoDados.CadBolao;
import processamentoDados.ProcessamentoGeral;

public class BotaoCadNome extends BaseBotoes {
	private ProcessamentoGeral processamentoGeral;
	private CadBolao cadBolao;
	private JFrame jFrame;
	private JTextField jTextField;

	public BotaoCadNome(CadBolao cadBolao, JFrame jFrame, JTextField jTextField) {
		setText("INICIAR BOLÃO");
		setPreferredSize(new Dimension(413, 40));
		addActionListener(this);
		this.cadBolao = cadBolao;
		this.jFrame = jFrame;
		this.jTextField = jTextField;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		String nome = jTextField.getText();
		cadBolao.getProcessamentoGeral().setNome(nome);
		jFrame.setVisible(false);
		cadBolao.janelaQuartas();
	}
}