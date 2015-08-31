package kz.e16training.textandxmltasks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Parameters setting on start program.
 *
 */
public enum StartupParameters {
    SQL(" - \"sql\" parameters loaded"),
    XML(" - \"xml\" parameters loaded"),
    NO_PARAMETERS(" - start program with \"sql\" or \"xml\" parameter");

    static Logger log = LogManager.getLogger(StartupParameters.class.getName());

    private String tips;
    StartupParameters(String tips) {
        this.tips = tips;
    }

    public static StartupParameters getParameters(String[] args) {
        StartupParameters result = NO_PARAMETERS;
        if (isValid(args)) {
            if ("sql".equalsIgnoreCase(args[0])) result = SQL;
            else if ("xml".equalsIgnoreCase(args[0])) result = XML;
        } else result = NO_PARAMETERS;
        log.debug("StartupParameters setting is " + result.tips);
        return result;
    }

    private static boolean isValid(String[] args) {
        return args.length > 0;
    }

    @Override
    public String toString() {
        return this.tips;
    }
}
