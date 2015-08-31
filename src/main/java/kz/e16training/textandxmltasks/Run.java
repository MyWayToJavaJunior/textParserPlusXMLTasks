package kz.e16training.textandxmltasks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author DK
 * @version 1.0.0
 *
 */
public class Run {
    static Logger log = LogManager.getLogger(Run.class.getName());
    public static void main(String[] args) {
        log.debug("program started");
        StartupParameters param = StartupParameters.getParameters(args);
        System.out.println(param);
        if (!param.equals(StartupParameters.NO_PARAMETERS)) {
            if (param.equals(StartupParameters.SQL)) {
            } else {
            }
        }
        log.debug("program ended");
    }
}
