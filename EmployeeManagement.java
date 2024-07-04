public class EmployeeManagement {
    private int employeeID;
    private String name;
    private String position;
    private double salary;

    public EmployeeManagement(int employeeID,String name,String position,double salary){

        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public int getEmployeeID(){
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public String getname(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPosition(){
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Employee ID: "+ employeeID + "Name: "+ name + " Position: "+ position +"Salary: "+ salary;
    }
}
