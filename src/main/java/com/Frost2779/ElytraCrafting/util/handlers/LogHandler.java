package com.Frost2779.ElytraCrafting.util.handlers;

import com.Frost2779.ElytraCrafting.util.Reference;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

public class LogHandler {
    private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(Reference.MOD_ID);

    public static void log(Level level, String msg)
    {
        logger.log(level, msg);
    }

    public static void logInfo(String msg)
    {
        logger.info(msg);
    }

    public static void logWarn(String msg)
    {
        logger.warn(msg);
    }

    public static void logFatal(String msg)
    {
        logger.fatal(msg);
    }

    public static void log(Level level, String msg, Object... args)
    {
        logger.log(level, String.format(msg, args));
    }

    public static void logInfo(String msg, Object... args)
    {
        logger.info(String.format(msg, args));
    }

    public static void logWarn(String msg, Object... args)
    {
        logger.warn(String.format(msg, args));
    }

    public static void logFatal(String msg, Object... args)
    {
        logger.fatal(String.format(msg, args));
    }
}
