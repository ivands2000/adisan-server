package net.adisan.helper;

import org.apache.log4j.Logger;

public class Log4jHelper {

    public static void infoLog(String strMessage) {
        Logger log = Logger.getLogger("adisan");
        log.info(strMessage);
    }

    public static void errorLog(String strMessage) {
        Logger log = Logger.getLogger("adisan");
        log.error(strMessage);
    }

    public static void errorLog(String strMessage, Throwable ex) {
        Logger log = Logger.getLogger("adisan");
        log.error(strMessage, ex);
        TraceHelper.trace(strMessage + " " + ex.getMessage());
    }

    public static void fatalLog(String strMessage) {
        Logger log = Logger.getLogger("adisan");
        log.fatal(strMessage);
    }

    public static void debugLog(String strMessage) {
        Logger log = Logger.getLogger("adisan");
        log.debug(strMessage);
    }

    public static void warnLog(String strMessage) {
        Logger log = Logger.getLogger("adisan");
        log.warn(strMessage);
    }

}
