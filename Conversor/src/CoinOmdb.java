import java.util.Map;

public record CoinOmdb(Map<String, Double> conversion_rates, String base_code) {
}
