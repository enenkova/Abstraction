package employeeWorkOnATask;

public class Task {
	private String nameTask;
	private int workingHours;
	

	public Task(String nameTask, int workingHours) {
		if (nameTask != null && !nameTask.equals("")) {
			this.nameTask = nameTask;
		} else {
			System.out.println("Enter task name");
		}
		this.setWorkingHours(workingHours);
		if (workingHours < 0) {
			System.out.println("Enter valid working hour");
			this.workingHours = 0;
		}
		
	}

	int getWorkingHours() {
		return workingHours;
	}

	void setWorkingHours(int workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		}
	}

	String getNameTask() {
		return nameTask;
	}

}
