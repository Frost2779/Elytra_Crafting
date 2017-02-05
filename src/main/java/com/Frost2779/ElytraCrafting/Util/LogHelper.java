package com.Frost2779.ElytraCrafting.Util;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import com.Frost2779.ElytraCrafting.Refrence;

public class LogHelper {

	private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(Refrence.MOD_ID);

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
