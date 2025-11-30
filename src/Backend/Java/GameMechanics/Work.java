package GameMechanics;

public class Work {
    
    // Work class to manage player's work-related activities
    private String jobTitle;
    private int hoursWorked;
    private double salary;

    public Work(String jobTitle, int hoursWorked, double salary) {
        this.jobTitle = jobTitle;
        this.hoursWorked = hoursWorked;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getSalary() {
        return salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
