/*
Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые).
Во всех остальных случаях метод должен возвращать false.

Воспользуйтесь шаблоном кода, который предлагает система. Ввод-вывод будет сделан за вас.
Вам надо только проанализировать переданные в метод booleanExpression значения (a, b, c, d)
и вернуть результат. Попробуйте составить формулу с использованием булевых операторов. Если
не получается, вернитесь к этому заданию после просмотра степов про условные операторы и циклы.
 */

public class taskOne {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a & b & !(c) & !(d))^(a & !(b) & c & !(d)) ^ (a & !(b) & !(c) & d) ^ (!(a) & b & c & !(d)) ^ (!(a) & b & !(c) & d) ^ (!(a) & !(b) & c & d);
    }

}
