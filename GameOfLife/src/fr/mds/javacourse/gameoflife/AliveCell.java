package fr.mds.javacourse.gameoflife;

public class AliveCell implements Cell {

	@Override
	public Cell newGeneration(int nbNeighbours) {
		if (nbNeighbours == 2 || nbNeighbours == 3) {
			return new AliveCell();
		} else {
			return new DeadCell();
		}
	}

	@Override
	public String getAsString() {
		return " 0 ";
	}

	@Override
	public Boolean isAlive() {
		return true;
	}

}
