package kg.geektech;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger LOGGER = LogManager.getLogger(App.class.getName());

    public static void main(String[] args) {
        LOGGER.warn("Warn");
        LOGGER.debug("Debug сообщение !!!");
        LOGGER.info("Info сообщение !!!");
        LOGGER.info("Info сообщение !!!");
        LOGGER.error("Error сообщение !!!", new NullPointerException("NullError"));
    }
}
