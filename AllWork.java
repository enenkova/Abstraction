package employeeWorkOnATask;

public class AllWork {
	private static final int MAX_TASKS_FOR_WORK = 10;
	private Task[] tasks;
	private int freePlacesForTask;
	private int currentUnassignedTask;

	AllWork() {
		this.tasks = new Task[MAX_TASKS_FOR_WORK];
		this.freePlacesForTask = MAX_TASKS_FOR_WORK;
		this.currentUnassignedTask = 0;
	}

	void addTask(Task task) {
		for (int index = 0; index < tasks.length; index++) {
			if (freePlacesForTask > 0) {
				if (tasks[index] == null) {
					this.tasks[index] = task;
					this.freePlacesForTask--;
					break;
				}
			} else {
				System.out.println("There are no free places for tasks!");
				break;
			}
		}
	}

	Task getNextTask() {
			if (this.currentUnassignedTask >= MAX_TASKS_FOR_WORK) {
				return new Task("no name", 0);
			}
			Task task = this.tasks[currentUnassignedTask];
			this.currentUnassignedTask++;
			return task;
		}

	boolean isAllWorkDone() {
		boolean isAllDone = true;
		for (int index = 0; index < tasks.length; index++) {
			if (this.tasks[index].getWorkingHours() != 0) {
				isAllDone = false;
				break;
			}
		}
		return isAllDone;
	}
}
