package alan;

import aula11_10_22.IPlay;

public class PlayDoAlan implements IPlay {

	@Override
	public void start() {
		System.out.println("Start!");

	}

	@Override
	public void next(int quantidade) {
		System.out.println("Next: " + quantidade);

	}

	@Override
	public void back(int quantidade) {
		// TODO Auto-generated method stub
		System.out.println("Back: " + quantidade);
	}

	@Override
	public void stop() {
		System.out.println("Stop!");

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pause!");
	}

	@Override
	public String fabricante() {
		// TODO Auto-generated method stub
		return "ROADSTAR";
	}

}
