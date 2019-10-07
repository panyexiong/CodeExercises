package com.pan.spring.demo02.soundSystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/7 13:00
 */
@Configuration
public class CDPlayerConfig {
    @Bean
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }
}
