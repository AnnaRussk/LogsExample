import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogsExample {

  private static final Logger logger = LogManager.getLogger(LogsExample.class);

  public static void main(String[] args) {
    logger.info("Программа запущена");

    int[] numbers = {1, 2, 3, 4, 5};

    try {
      logger.debug("Начинаем обход массива длиной {}", numbers.length);

      // Цикл с ошибкой: пытаемся выйти за пределы массива
      for (int i = 0; i <= numbers.length; i++) { // Ошибка: условие <= вместо <
        logger.info("Элемент [{}]: {}", i, numbers[i]);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      logger.error("Ошибка доступа к массиву: {}", e.getMessage(), e);
    }

    logger.info("Программа завершена");
  }

}
