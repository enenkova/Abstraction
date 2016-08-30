package employeeWorkOnATask;

public class Employee {
	private String nameEmployee;
	private Task currentTask;
	private int hourLeft;
	private static AllWork allwork;

	Employee(String name) {
		if (name != null && !name.equals("")) {
			this.nameEmployee = name;
		} else {
			System.out.println("Enter correct name");
		}
	}

	private void work() {
		if (this.currentTask == null) {
			this.setCurrentTask(Employee.allwork.getNextTask());
			System.out.println(this.nameEmployee + " starts working on: " + this.currentTask.getNameTask());
		}
		if (this.currentTask.getNameTask().equals("no name")) {
			return;
		}
		if (this.hourLeft >= currentTask.getWorkingHours()) {
			this.hourLeft -= currentTask.getWorkingHours();
			currentTask.setWorkingHours(0);
			System.out.println(this.nameEmployee + " just finished " + this.currentTask.getNameTask());
			this.currentTask = null;
		} else {
			currentTask.setWorkingHours(currentTask.getWorkingHours() - this.hourLeft);
			this.hourLeft = 0;
			System.out.println(this.nameEmployee + " no working hours left");
			return;
		}
		if (this.getHourLeft() > 0) {
			this.currentTask = Employee.allwork.getNextTask();
			System.out.println(this.nameEmployee + " starts a new task " + this.currentTask.getNameTask());
			this.work();
		}
	}

	void startWorkingDay() {
		if (this.getHourLeft() == 0) {
			this.setHourLeft(8);
			System.out.println();
			System.out.println(this.nameEmployee + " starts new day");
		}
		this.work();
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
		}
	}

	public int getHourLeft() {
		return hourLeft;
	}

	public void setHourLeft(int hoursLeft) {
		if (hoursLeft < 0 || hoursLeft > 8) {
			System.out.println("The hours are between 0 and 8");
		} else {
			this.hourLeft = hoursLeft;
		}
	}

	public AllWork getAllwork() {
		return allwork;
	}

	public void setAllwork(AllWork allwork) {
		if (allwork != null) {
			Employee.allwork = allwork;
		}
	}

	public String getName() {
		return nameEmployee;
	}
}
