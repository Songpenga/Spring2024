package hello.coreStock;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

public class coreStock {

    @Nested
    @SpringBootTest
    class DatabaseConnectionTest {
        @Autowired
        private DataSource dataSource;

        @Test
        void testConnection() {
            // DataSource에서 Connection 가져오기
            // 연결 성공/실패 확인
        }
    }
}
