import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class tq3 {
    private static final Logger logger = LoggerFactory.getLogger(tq3.class);

    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(new File("E:/target-TI/tecnica/java/src/sales.json"));
            List<Double> dailySales = new ArrayList<>();
            for (JsonNode node : rootNode) {
                double value = node.get("value").asDouble();
                if (value > 0) {
                    dailySales.add(value);
                }
            }
            double lowerSale = dailySales.stream().mapToDouble(v -> v).min().orElse(0);
            double higherSale = dailySales.stream().mapToDouble(v -> v).max().orElse(0);
            double sumSale = dailySales.stream().mapToDouble(v -> v).sum();
            double averageSale = sumSale / dailySales.size();
            long daysAboveAverage = dailySales.stream().filter(v -> v > averageSale).count();
            System.out.println("Menor faturamento: R$ " + String.format("%.2f", lowerSale));
            System.out.println("Maior faturamento: R$ " + String.format("%.2f", higherSale));
            System.out.println("Número de dias com faturamento acima da média: " + daysAboveAverage);
        } catch (IOException e) {
            logger.error("Erro ao ler o arquivo JSON", e);
        }
    }
}