package com.javacertification.logback;

import com.javacertification.logback.chapters.ChapaterThree;
import com.javacertification.logback.chapters.Chapter;
import com.javacertification.logback.chapters.ChapterOne;
import com.javacertification.logback.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChapterFactory {
    static final Logger LOGGER = LoggerFactory.getLogger(Utils.getClassName());
    static Chapter createChapter(String chNum) {
        LOGGER.info("Creating chapter '{}'", chNum);
        switch (chNum) {
            case Chapter.ONE: return new ChapterOne();
            case Chapter.TWO: return null;
            case Chapter.THREE: return new ChapaterThree();
            case Chapter.FOURE: return null;
        }
        throw new IllegalArgumentException("Unreachable statement");
    }
}
