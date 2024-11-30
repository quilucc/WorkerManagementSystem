import java.util.ArrayList;
import java.util.List;

public class WorkerManager {
    private List<Worker> workers;

    public WorkerManager() {
        workers = new ArrayList<>();
    }

    public void addWorker(String name, double baseSalary, double complement) {
        workers.add(new Worker(name, baseSalary, complement));
    }

    public double calculateGlobalTotalSalary() {
        double total = 0;
        for (Worker worker : workers) {
            total += worker.getTotalSalary();
        }
        return total;
    }

    public void listWorkers() {
        if (workers.isEmpty()) {
            System.out.println("No workers added yet.");
            return;
        }
        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
}
