package com.javacertification.logback.chapters;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChapterOne implements Chapter {
    @Override
    public void execute() {
        //print internal state
        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(context);
        ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("europe");
        logger.info("europe logger effective level: {}", logger.getEffectiveLevel());
        logger.info("europe logger level: {}", logger.getLevel());
        logger.info("Set europe logger INFO level");
        logger.setLevel(Level.INFO);
        logger.info("europe logger effective level: {}", logger.getEffectiveLevel());
        logger.debug("europe logger level: {}", logger.getLevel());


        Logger logger1 = LoggerFactory.getLogger("us");
        Logger logger2 = LoggerFactory.getLogger("us");
        logger.debug("Is two loggers with the same name are equals? {}", logger1.equals(logger2));
    }
}
