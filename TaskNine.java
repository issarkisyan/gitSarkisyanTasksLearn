/*
Дан класс ComplexNumber. Переопределите в нем методы equals() и hashCode() так, чтобы equals() сравнивал экземпляры
ComplexNumber по содержимому полей re и im, а hashCode() был бы согласованным с реализацией equals().

Реализация hashCode(), возвращающая константу или не учитывающая дробную часть re и im, засчитана не будет
 */
public class TaskNine {
    public final class ComplexNumber {
        private final double re;
        private final double im;

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }
        public double getRe() {
            return re;
        }
        public double getIm() {
            return im;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || obj.getClass() != this.getClass())
                return false;
            if (obj.getClass() == this.getClass()) {
                ComplexNumber other = (ComplexNumber) obj;
                if (other.re == this.re && other.im == this.im)
                    return true;
            }
            return false;
        }
        @Override
        public int hashCode() {
            final int prime = 505;
            int reint = Double.hashCode(re);
            int imint =Double.hashCode(im);
            int result = 1;
            result = prime * result + reint;
            result = prime * result + imint;
            return result;
        }

    }
}
