import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner respuesta = new Scanner(System.in);
        Scanner lectura = new Scanner(System.in);
        Scanner lecturaCantidad = new Scanner(System.in);

        List<Double> moneda = new ArrayList<>();
        int opcion = 0;


        while (true) {

            String menu = """
                    **** ***************************************************************** ****
                    Bienvenidos al conversor de monedas:
                    1 - Dolar -> Peso Argentino
                    2 - Peso Argentino -> Dolar
                    3 - Dolar -> Real Brasileño
                    4 - Real Brasileño -> Dolar
                    5 - Dolar -> Peso Colombiano
                    6 - Peso Colombiano -> Dolar
                    7 - Salir
                                    
                    Elija una opcion valida
                    *****************************************************************
                    """;

            System.out.println(menu);
            opcion = respuesta.nextInt();
            var monedaCambio = "";
            String direccion = "https://v6.exchangerate-api.com/v6" +
                    "/23c14debc497b54abc1bd687/latest/" + monedaCambio;


            if (opcion == 7) {
                break;
            }
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double cantidadCambio1 = lecturaCantidad.nextDouble();
                    monedaCambio = "USD";

                    direccion = "https://v6.exchangerate-api.com/v6" +
                            "/23c14debc497b54abc1bd687/latest/" + monedaCambio;

                    try {
                        HttpClient client = HttpClient.newHttpClient();
                        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(direccion))
                                .build();
                        HttpResponse<String> response = client
                                .send(request, HttpResponse.BodyHandlers.ofString());

                        String json = response.body();


                        System.out.println(json);

                        Gson gson = new Gson();
                        CoinOmdb miCoinOmdb = gson.fromJson(json, CoinOmdb.class);
                        var tasaCambio = miCoinOmdb.conversion_rates().get("ARS");
                        System.out.println("Valor de la tasa de cambio: " + tasaCambio);

                        System.out.println("Selecciono: " + cantidadCambio1);

                        var resultadoCambio = cantidadCambio1 * tasaCambio;

                        System.out.println("Los " + cantidadCambio1 + " " + miCoinOmdb.base_code() +
                                " son iguales a " + resultadoCambio + " Pesos argentinos");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 2:
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double cantidadCambio2 = lecturaCantidad.nextDouble();
                    monedaCambio = "ARS";

                    direccion = "https://v6.exchangerate-api.com/v6" +
                            "/23c14debc497b54abc1bd687/latest/" + monedaCambio;

                    try {
                        HttpClient client = HttpClient.newHttpClient();
                        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(direccion))
                                .build();
                        HttpResponse<String> response = client
                                .send(request, HttpResponse.BodyHandlers.ofString());

                        String json = response.body();


                        System.out.println(json);

                        Gson gson = new Gson();
                        CoinOmdb miCoinOmdb = gson.fromJson(json, CoinOmdb.class);
                        var tasaCambio = miCoinOmdb.conversion_rates().get("USD");
                        System.out.println("Valor de la tasa de cambio: " + tasaCambio);

                        System.out.println("Selecciono: " + cantidadCambio2);

                        var resultadoCambio = cantidadCambio2 * tasaCambio;

                        System.out.println("Los " + cantidadCambio2 + " " + miCoinOmdb.base_code() +
                                " son iguales a " + resultadoCambio + " Dolares");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 3:
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double cantidadCambio3 = lecturaCantidad.nextDouble();
                    monedaCambio = "USD";

                    direccion = "https://v6.exchangerate-api.com/v6" +
                            "/23c14debc497b54abc1bd687/latest/" + monedaCambio;

                    try {
                        HttpClient client = HttpClient.newHttpClient();
                        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(direccion))
                                .build();
                        HttpResponse<String> response = client
                                .send(request, HttpResponse.BodyHandlers.ofString());

                        String json = response.body();


                        System.out.println(json);

                        Gson gson = new Gson();
                        CoinOmdb miCoinOmdb = gson.fromJson(json, CoinOmdb.class);
                        var tasaCambio = miCoinOmdb.conversion_rates().get("BRL");
                        System.out.println("Valor de la tasa de cambio: " + tasaCambio);

                        System.out.println("Selecciono: " + cantidadCambio3);

                        var resultadoCambio = cantidadCambio3 * tasaCambio;

                        System.out.println("Los " + cantidadCambio3 + " " + miCoinOmdb.base_code() +
                                " son iguales a " + resultadoCambio + " Reales Brasileños");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 4:
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double cantidadCambio4 = lecturaCantidad.nextDouble();
                    monedaCambio = "BRL";

                    direccion = "https://v6.exchangerate-api.com/v6" +
                            "/23c14debc497b54abc1bd687/latest/" + monedaCambio;

                    try {
                        HttpClient client = HttpClient.newHttpClient();
                        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(direccion))
                                .build();
                        HttpResponse<String> response = client
                                .send(request, HttpResponse.BodyHandlers.ofString());

                        String json = response.body();


                        System.out.println(json);

                        Gson gson = new Gson();
                        CoinOmdb miCoinOmdb = gson.fromJson(json, CoinOmdb.class);
                        var tasaCambio = miCoinOmdb.conversion_rates().get("USD");
                        System.out.println("Valor de la tasa de cambio: " + tasaCambio);

                        System.out.println("Selecciono: " + cantidadCambio4);

                        var resultadoCambio = cantidadCambio4 * tasaCambio;

                        System.out.println("Los " + cantidadCambio4 + " " + miCoinOmdb.base_code() +
                                " son iguales a " + resultadoCambio + " Dolares");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 5:
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double cantidadCambio5 = lecturaCantidad.nextDouble();
                    monedaCambio = "USD";

                    direccion = "https://v6.exchangerate-api.com/v6" +
                            "/23c14debc497b54abc1bd687/latest/" + monedaCambio;

                    try {
                        HttpClient client = HttpClient.newHttpClient();
                        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(direccion))
                                .build();
                        HttpResponse<String> response = client
                                .send(request, HttpResponse.BodyHandlers.ofString());

                        String json = response.body();


                        System.out.println(json);

                        Gson gson = new Gson();
                        CoinOmdb miCoinOmdb = gson.fromJson(json, CoinOmdb.class);
                        var tasaCambio = miCoinOmdb.conversion_rates().get("COP");
                        System.out.println("Valor de la tasa de cambio: " + tasaCambio);

                        System.out.println("Selecciono: " + cantidadCambio5);

                        var resultadoCambio = cantidadCambio5 * tasaCambio;

                        System.out.println("Los " + cantidadCambio5 + " " + miCoinOmdb.base_code() +
                                " son iguales a " + resultadoCambio + " Pesos Colombianos");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 6:
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double cantidadCambio6 = lecturaCantidad.nextDouble();
                    monedaCambio = "COP";

                    direccion = "https://v6.exchangerate-api.com/v6" +
                            "/23c14debc497b54abc1bd687/latest/" + monedaCambio;

                    try {
                        HttpClient client = HttpClient.newHttpClient();
                        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(direccion))
                                .build();
                        HttpResponse<String> response = client
                                .send(request, HttpResponse.BodyHandlers.ofString());

                        String json = response.body();


                        System.out.println(json);

                        Gson gson = new Gson();
                        CoinOmdb miCoinOmdb = gson.fromJson(json, CoinOmdb.class);
                        var tasaCambio = miCoinOmdb.conversion_rates().get("USD");
                        System.out.println("Valor de la tasa de cambio: " + tasaCambio);

                        System.out.println("Selecciono: " + cantidadCambio6);

                        var resultadoCambio = cantidadCambio6 * tasaCambio;

                        System.out.println("Los " + cantidadCambio6 + " " + miCoinOmdb.base_code() +
                                " son iguales a " + resultadoCambio + " Dolares");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                default:
                    System.out.println("Opcion NO valida \nPor favor seleccione una opcion valida.");
            }


        }

        System.out.println("Finalizo la ejecucion del programa");
    }
}
