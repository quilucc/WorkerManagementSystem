public class Worker {
    private String name;
    private double baseSalary;
    private double complement;

    public Worker(String name, double baseSalary, double complement) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.complement = complement;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getComplement() {
        return complement;
    }

    public double getTotalSalary() {
        return baseSalary + complement;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Base Salary: %.2f, Complement: %.2f, Total Salary: %.2f",
                name, baseSalary, complement, getTotalSalary());
    }
}
