/*
Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.

Метод getCallerClassAndMethodName() должен возвращать имя класса и метода, откуда вызван метод, вызвавший данный
утилитный метод. Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший getCallerClassAndMethodName()
является точкой входа в программу, т.е. его никто не вызывал.

Это актуально, например, в библиотеках логирования, где для каждого сообщения в логе надо выводить класс и метод,
откуда сообщение было залогировано.
 */
public class TaskThirteen {
    public static String getCallerClassAndMethodName(){
        StackTraceElement[] methods;
        methods = new Throwable().getStackTrace();
        if (methods.length>2) {
            return methods[2].getClassName()+"#"+methods[2].getMethodName();
        }
        else return null;
    }
}
