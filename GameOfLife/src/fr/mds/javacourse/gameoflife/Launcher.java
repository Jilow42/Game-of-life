package fr.mds.javacourse.gameoflife;

public class Launcher {

	public static void main(String[] args) {

		World stonksWorld = new World(42, 42);
		stonksWorld.newGeneration();
		System.out.println(stonksWorld.toString());

		for (int i = 0; i < 100; i++) {
			stonksWorld.newGeneration();
			System.out.println(stonksWorld.toString());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
