package disputaDePenaltis;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class JanelaEstatisticas extends JFrame {

	public JanelaEstatisticas(ProcessamentoDados processamentoDados) {
		setTitle("Estatísticas");
		setLayout(new BorderLayout());
		setSize(600, 80);
		setLocation(100, 50);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		add(new Estatisticas(processamentoDados));
		
		setLocationRelativeTo( null );
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
}
