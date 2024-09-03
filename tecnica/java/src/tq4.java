import java.util.HashMap;
import java.util.Map;
public class tq4 {
    public static void main(String[] args) {
        Map<String, Double> salesPerState = new HashMap<>();
        salesPerState.put("SP", 67836.43);
        salesPerState.put("RJ", 36678.66);
        salesPerState.put("MG", 29229.88);
        salesPerState.put("ES", 27165.48);
        salesPerState.put("Outros", 19849.53);

        double totalValue = salesPerState.values().stream().mapToDouble(Double::doubleValue).sum();

        System.out.println("Percentual de representação por estado:");

        for (Map.Entry<String, Double> entry : salesPerState.entrySet()) {
            String state = entry.getKey();
            double value = entry.getValue();
            double percent = (value / totalValue) * 100;

            System.out.printf("%s: %.2f%%\n", state, percent);
        }
    }
}