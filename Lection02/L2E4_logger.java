// Логирование, основы:

//  Использование:
//      Logger logger = Logger.getLogger()
//  Уровни важности:
//      INFO, DEBUG, ERROR, WARNING и др.
//  Вывод:
//      ConcoleHandler info = new ConsoleHandler();
//      log.addHandler(info);
//  Формат вывода (структурированный, простой):
//      XMLFormatter, SimpleFormatter

import java.io.IOException;
import java.util.logging.*;

public class L2E4_logger {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(L2E4_logger.class.getName());
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("D:/GeekBrainsLessons/JavaProjects/Lection02/L2_files/log.txt");
        //logger.addHandler(ch);
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        //XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        //fh.setFormatter(xml);
        
        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Test logging 1");
        logger.info("Test logging 2");
    }
}