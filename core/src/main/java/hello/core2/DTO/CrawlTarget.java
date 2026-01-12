package hello.core2.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;


// 1. 크롤링 지시서
public record CrawlTarget(String url, String selector, String siteName) { }

// 3. 전체 결과 리포트
@Getter
@AllArgsConstructor
@ToString
public class CrawlResult {
    private String siteName;
    private List<ContentSection> sections;
}


//@Getter
//@AllArgsConstructor
//public class CrawlDto {
//    private String url;
//    private String selector;
//    private String siteName; // 선택, 로그 확인용 사이트 이름
//}
//
//// 2. 태그별 내용 저장(순서 유지용)
//@Getter
//@AllArgsConstructor
//@ToString
//public class ContentSection {
//    private String type;
//    private String content;
//}
//
//// 3. 한페이지의 전체 결과
//@Getter
//@AllArgsConstructor
//@ToString
//class Crawlresult{
//    private String siteName;
//    private List<ContentSection> contents;
//}