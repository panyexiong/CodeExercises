package com.pan.spring.demo02.soundSystem;

import org.springframework.stereotype.Component;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/7 12:57
 */
@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt.Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("playing " + title + " by " + artist);
    }
}
