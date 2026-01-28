package hello.coreStock.Service;

import hello.coreStock.StockApiResponseDto;
import hello.coreStock.StockPrice;
import hello.coreStock.stockInterface.StockPriceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDate;
import java.net.URI;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class StockService {

    private final StockPriceRepository stockPriceRepository;
    private final RestTemplate restTemplate;

    @Value("${stock.api.key_in}") // application stock.api.key 값을 주입
    private String apiKey_in;

    @Value("${stock.api.key_de}") // application stock.api.key 값을 주입
    private String apiKey_de;

    @Value("${stock.api.url}")
    private String apiUrl;

    //공공데이터 api 호출하여 data 가져옴
    public StockApiResponseDto StockDataGetApi(String basDt, String srtnCd){

//        String url = UriComponentsBuilder.fromHttpUrl(apiUrl)
//                .queryParam("ServiceKey", apiKey_de)
//                .queryParam("basDt", basDt) // YYYYMMDD 형식
//                .queryParam("numOfRows", "10")
//                .queryParam("pageNo", "1")
//                .queryParam("resultType", "json")
//                .build() //인코딩 방지
//                .toUriString(); // 401 로 잠시 주석

        URI uri = UriComponentsBuilder
                .fromHttpUrl(apiUrl)
                .queryParam("ServiceKey", apiKey_in)
                .queryParam("basDt", basDt)
                .queryParam("numOfRows", 10)
                .queryParam("pageNo", 1)
                .queryParam("resultType", "json")
                .build(true)   // ⭐ 이미 인코딩된 값임을 명시
                .toUri();

        log.error("ServiceKey 값 = [{}]", apiKey_de);

        System.out.println("테스트 URL: " + uri);

        try{
            StockApiResponseDto response = restTemplate.getForObject(uri, StockApiResponseDto.class);
            log.info("API 응답 : {}", response);
            return response;
        }catch (Exception e){
            log.error("API 호출 실패 ", e);
            log.error("API 호출 error url : " + uri);
            throw new RuntimeException("주식 데이터 조회 실패", e);
        }

    }

    //특정종목 조회
    public List<StockPrice> getStockPriceByCode(String strnCd){
        return  stockPriceRepository.findBySrtnCdOrderByBasDtDesc(strnCd);
    }

    //특정날짜 조회
    public List<StockPrice> getStockPriceByDate(LocalDate basDt){
        return  stockPriceRepository.findByBasDt(basDt);
    }
}
