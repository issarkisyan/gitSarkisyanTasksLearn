/*
Факториал NN вычисляется как 1 \cdot 2 \cdot ... \cdot N1⋅2⋅...⋅N.

Поскольку это очень быстро растущая функция, то даже для небольших NN вместимости типов int и long очень
скоро не хватит. Поэтому будем использовать BigInteger.
 */
public class TaskSix {
    public static BigInteger factorial(int value) {
        BigInteger rez = new BigInteger("1");
        for (int n = 1;n<=value;n++){
            rez = rez.multiply(BigInteger.valueOf(n));
        }
        return rez;
    }
}
