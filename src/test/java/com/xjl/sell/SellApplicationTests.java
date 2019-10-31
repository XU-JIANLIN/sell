package com.xjl.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SellApplicationTests {

    @Test
    void contextLoads() {

        log.debug("debug");
        log.info("info");
        log.error("error");
    }

}
