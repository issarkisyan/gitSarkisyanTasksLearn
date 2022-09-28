/*
Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.
 */
public class TaskEighteen {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }
        return new String(result.toByteArray(), charset);
    }
}
