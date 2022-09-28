/*
В этой задаче вам нужно реализовать метод, настраивающий параметры логирования. Конфигурирование в коде позволяет
выполнить более тонкую и хитрую настройку, чем при помощи properties-файла.

Требуется выставить такие настройки, чтобы:

Логгер с именем "org.stepic.java.logging.ClassA" принимал сообщения всех уровней.
Логгер с именем "org.stepic.java.logging.ClassB" принимал только сообщения уровня WARNING и серьезнее.
Все сообщения, пришедшие от нижестоящих логгеров на уровень "org.stepic.java", независимо от серьезности
сообщения печатались в консоль в формате XML (*) и не передавались вышестоящим обработчикам на уровнях
"org.stepic", "org" и "".
Не упомянутые здесь настройки изменяться не должны.

(*) В реальных программах мы бы конечно печатали XML не в консоль, а в файл. Но проверяющая система не разрешает
создавать файлы на диске, поэтому придется так.
 */
public class TaskFourteen {
    private static void configureLogging() {
        Logger LOGGER1 = Logger.getLogger("org.stepic.java.logging.ClassA");
        LOGGER1.setLevel(Level.ALL);

        Logger LOGGER2 = Logger.getLogger("org.stepic.java.logging.ClassB");
        LOGGER2.setLevel(Level.WARNING);

        Logger LOGGER3 = Logger.getLogger("org.stepic.java");
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new XMLFormatter());
        LOGGER3.addHandler(handler);
        LOGGER3.setUseParentHandlers(false);
    }
}
