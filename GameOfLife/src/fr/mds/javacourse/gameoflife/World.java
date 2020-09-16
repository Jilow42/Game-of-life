package fr.mds.javacourse.gameoflife;

import java.util.Random;

public class World {

	private int nbOfColumns;
	private int nbOfRows;
	private int generation;

	private Cell[][] worldGame;

	public World(int nbOfColumns, int nbOfRows) {
		this.nbOfColumns = nbOfColumns;
		this.nbOfRows = nbOfRows;
		this.generation = 0;
	}

	public void newGeneration() {

		System.out.println("Géneration "+this.generation+":");

		if (this.generation == 0) {
			this.worldGame = new Cell[nbOfColumns][nbOfRows];
			Random random = new Random();
			for (int i = 0; i < worldGame.length; i++) {
				for (int j = 0; j < worldGame[i].length; j++) {
					int plop = random.nextInt(2);
					if (plop == 0) {
						worldGame[i][j] = new AliveCell();
					} else {
						worldGame[i][j] = new DeadCell();
					}
				}
			}


		} else {

			Cell[][] wordGameCopy = new Cell[nbOfColumns][nbOfRows];
			for (int i = 0; i < worldGame.length; i++) {
				for (int j = 0; j < worldGame[i].length; j++) {

					int nbNeighbours = 0;

					for (int x = i-1; x <= i+1 ; x++) {
						for (int y = j-1; y <= j+1; y++) {
							if (x != i || y != j) {
								if(x != -1 && y != -1 && x != worldGame.length && y != worldGame[i].length) {
									if(this.worldGame[x][y].isAlive()) {
										nbNeighbours++;
									}

								}
							}
						}
					}
					wordGameCopy[i][j] = this.worldGame[i][j].newGeneration(nbNeighbours);
				}
			}
			this.worldGame = wordGameCopy;
		}

		this.generation++;

	}

	@Override
	public String toString() {
		String showTimeString = "";
		for (int i = 0; i < worldGame.length; i++) {
			for (int j = 0; j < worldGame[i].length; j++) {
				showTimeString += worldGame[i][j].getAsString();
			}
			showTimeString += "\n";

		}

		return showTimeString;

	}

}
