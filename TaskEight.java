/*
На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y.
Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)

В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит:
вверх, вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.

Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):
 */
public class TaskEight {
    public static void moveRobot(Robot robot, int toX, int toY) {
        int i = toX - robot.getX();
        int j =  robot.getX() - toX;
        int k = toY - robot.getY();
        int l = robot.getY() - toY;

        if (robot.getX() < toX){
            while (robot.getDirection()!=Direction.RIGHT){
                robot.turnRight();
            }
            for (int a = 0; a<i ; a++) {
                robot.stepForward();
            }
        }

        if (robot.getX() > toX){
            while (robot.getDirection()!=Direction.LEFT){
                robot.turnRight();
            }

            for (int a = 0; a<j ; a++) {
                robot.stepForward();
            }
        }

        if (robot.getY() < toY){
            while (robot.getDirection()!=Direction.UP){
                robot.turnRight();
            }

            for (int a = 0; a<k ; a++) {
                robot.stepForward();
            }
        }
        if (robot.getY() > toY){
            while (robot.getDirection()!=Direction.DOWN){
                robot.turnRight();
            }

            for (int a = 0; a<l ; a++) {
                robot.stepForward();
            }
        }
    }

}
