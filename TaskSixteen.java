/*
Напишите метод, читающий входной поток и вычисляющий контрольную сумму прочитанных данных.

 */
public class TaskSixteen {
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int c = 0;
        int b;
        try {
            while ((b=inputStream.read())!=-1){
                c = Integer.rotateLeft(c,1)^b;
            }
        } catch (IOException e) {
            throw new IOException();
        }
        return c;
    }

}
