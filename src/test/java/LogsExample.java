import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogsExample {

  private static final Logger logger = LogManager.getLogger(LogsExample.class);

  public static void main(String[] args) {
    logger.info("Запуск логгера");
    logger.error("Пример ошибки");
    logger.debug("Отладка");

    logger.warn("Какое-нибудь предупреждение");
  }

}
