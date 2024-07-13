import com.google.gson.annotations.SerializedName;

public class Coin {
    @SerializedName("conversion_rates")
    private String conversion_rates;

    public Coin(String conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

//    public Coin(CoinOmdb miCoinOmdb) {
//        this.conversion_rates = miCoinOmdb.conversion_rates();
//    }

    public String getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(String conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "conversion_rates='" + conversion_rates + '\'' +
                '}';
    }
}
