package employeeWorkOnATask;

public class Demo {

	public static void main(String[] args) {
		AllWork singing = new AllWork();

		Task disco = new Task("Disco", 5);
		Task pop = new Task("Pop", 1);
		Task rock = new Task("Rock", 9);
		Task heavy = new Task("Heavy", 7);
		Task bla = new Task("Bla", 3);
		Task rap = new Task("Rap", 8);
		Task electro = new Task("Electro", 10);
		Task pro = new Task("Pro", 6);
		Task dance = new Task("Dance", 12);
		Task alter = new Task("Alter", 4);
		Task ballad = new Task("Ballad", 15);

		Employee work1 = new Employee("Gaga");
		Employee work2 = new Employee("Dada");
		Employee work3 = new Employee("Baba");

		singing.addTask(ballad);
		singing.addTask(alter);
		singing.addTask(dance);
		singing.addTask(pro);
		singing.addTask(electro);
		singing.addTask(rap);
		singing.addTask(bla);
		singing.addTask(heavy);
		singing.addTask(rock);
		singing.addTask(pop);
		singing.addTask(disco);

		work1.setAllwork(singing);
		work2.setAllwork(singing);
		work3.setAllwork(singing);

		int day = 1;
		work1.setCurrentTask(dance);

		while (true) {
			work1.startWorkingDay();
			work2.startWorkingDay();
			work3.startWorkingDay();
			System.out.println("Working day " + day + " finished");
			System.out.println();
			day++;
			if (singing.isAllWorkDone()) {
				System.out.println("All work is done");
				break;
			}
		}
	}

}
