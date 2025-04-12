public class Employee {

    private String empName;
    private Integer empNumber;

    public Integer getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Integer empNumber) {
        this.empNumber = empNumber;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public Employee(String empName, Integer empNumber) {
        this.empName = empName;
        this.empNumber = empNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empNumber=" + empNumber +
                '}';
    }
}
