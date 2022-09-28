/*
Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 */
public class taskThree {
    public static char charExpression(int a) {
        int s = '\\';
        int sum = s + a;
        char unicode = (char) sum;
        return (char) unicode;
    }
}
