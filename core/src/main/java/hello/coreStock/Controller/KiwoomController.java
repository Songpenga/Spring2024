package hello.coreStock.Controller;
import org.springframework.beans.factory.annotation.Value;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.Arrays;

// 접근토큰 발급
public class KiwoomController {

    @Value("${kiwoom.host}")
    private static String mockhost;

    @Value("${kiwoon.appkwy}")
    private static String mockkey;

    @Value("${kiwoon.mykey}")
    private static String mockmykey;

    public static void fn_au10001(String jsonData) {

        try {
            // 1. 요청할 API URL
             String host = "https://mockapi.kiwoom.com"; // 모의투자
            // String host = "https://api.kiwoom.com"; // 실전투자
            String endpoint = "/oauth2/token";
            String urlString = host + endpoint;

            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // 2. Header 데이터 설정
            connection.setRequestMethod("POST"); // 메서드 타입
            connection.setRequestProperty("Content-Type", "application/json;charset=UTF-8"); // 컨텐츠타입
            connection.setDoOutput(true);

            // 3. JSON 데이터 전송
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonData.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // 4. 응답 헤더 출력
            System.out.println("Code: "+ connection.getResponseCode());
            System.out.println("Header:");
            String[] headerKeys = {"cont-yn","next-key","api-id"};
            connection.getHeaderFields().forEach((key, value) -> {
                if(Arrays.asList(headerKeys).contains(key)){
                    System.out.println("    " + key + ": " + value.get(0));
                }
            });

            // 5. 응답 본문 출력
            System.out.println("Body:");
            try (Scanner scanner = new Scanner(connection.getInputStream(), "utf-8")) {
                String responseBody = scanner.useDelimiter("\\A").next();
                System.out.println("    " + responseBody);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 1. 요청 데이터 JSON 문자열 생성
        String jsonData = "{\"grant_type\" : \"client_credentials\"," +
                "\"appkey\" : mockkey," +
                "\"secretkey\" : mockmykey}"; // JSON 형식의 문자열 데이터

        // 2. API 실행
        fn_au10001(jsonData);
    }
}