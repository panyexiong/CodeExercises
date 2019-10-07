package com.pan.spring.demo02.soundSystem;


import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/10/7 14:35
 */
public class CDPlayer {

    private CompactDisc compactDisc;

    @Autowired
    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void play() {
        compactDisc.play();
    }

}
