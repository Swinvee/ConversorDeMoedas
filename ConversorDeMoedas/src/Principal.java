import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

        int opcao;
        Gson gson = new Gson();
        Scanner leitura = new Scanner(System.in);

        String apiKey = "400bb38190782edd6b69e1c2";

        do {
            System.out.println("\n=== Conversor Monetário ===");
            System.out.println("1. Real para Dólar");
            System.out.println("2. Dólar para Euro");
            System.out.println("3. Real para Iene japonês");
            System.out.println("4. Yuan chinês para Real");
            System.out.println("5. Real para Euro");
            System.out.println("6. Euro para Iene japonês");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitura.nextInt();

            if (opcao == 7) {
                System.out.println("Encerrendo o programa...");
                break;
            }

            System.out.println("Digite o valor a ser convertido: ");
            double valor = leitura.nextDouble();

            String de = "";
            String para = "";

            switch (opcao) {
                case 1 -> {
                    de = "BRL";
                    para = "USD";
                }
                case 2 -> {
                    de = "USD";
                    para = "EUR";
                }
                case 3 -> {
                    de = "BRL";
                    para = "JPY";
                }
                case 4 -> {
                    de = "CNY";
                    para = "BRL";
                }
                case 5 -> {
                    de = "BRL";
                    para = "EUR";
                }
                case 6 -> {
                    de = "EUR";
                    para = "JPY";
                }
                default -> {
                    System.out.println("Opção inválida.");
                    continue;
                }
            }

            String endereco = "https://v6.exchangerate-api.com/v6/"
                    + apiKey + "/pair/" + de + "/" + para;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco)).build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            //conversão para json
            Conversao resultado = gson.fromJson(response.body(), Conversao.class);

            double convertido = valor * resultado.conversion_rate;
            System.out.printf("Valor convertido: %.2f %s%n", convertido, para);

        } while (true);
        leitura.close();
    }
    }

