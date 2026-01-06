package hello.core2.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CrawlDto {
    private String url;
    private String selector;
    private String siteName; // 선택, 로그 확인용 사이트 이름
}
