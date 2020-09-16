package fr.mds.javacourse.gameoflife;

public class DeadCell implements Cell {

	@Override
	public Cell newGeneration(int nbNeighbours) {
		if (nbNeighbours == 3) {
			return new AliveCell();
		} else {
			return new DeadCell();
		}
	}

	@Override
	public String getAsString() {
		return " - ";
	}

	@Override
	public Boolean isAlive() {
		return false;
	}

}
