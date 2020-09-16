package fr.mds.javacourse.gameoflife;

public interface Cell {
	abstract Cell newGeneration(int nbNeighbours);

	abstract String getAsString();

	abstract Boolean isAlive();
}
