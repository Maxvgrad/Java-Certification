package com.javacertification.logback;

import com.javacertification.logback.chapters.Chapter;
import static com.javacertification.logback.utils.Utils.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(getClassName());
    public static void main(String[] args) {
        LOGGER.info("Test logger");
        Chapter ch = ChapterFactory.createChapter(Chapter.THREE);
        ch.execute();

    }
}
