/*
Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же
порядке массив. Массивы могут быть любой длины, в том числе нулевой.

Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум исходным
массивам и сразу формировать отсортированный результирующий массив. Так, чтобы сортировка полученного массива
при помощи Arrays.sort() уже не требовалась.
 */
public class TaskSeven {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int [] result = new int[a1.length + a2.length];
        int pos1 = 0;
        int pos2 = 0;
        while(pos1<a1.length || pos2<a2.length) {
            result[pos1+pos2] = (pos1<a1.length && (pos2 == a2.length || a1[pos1]<a2[pos2]) ?
                    a1[pos1++] : a2[pos2++]);
        }
        return result;
    }
}
