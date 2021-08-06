public class Main {

    public static void main(String[] args) {

        char princess = '2';
        char prince = '1';
        char collum = '0';
        char dot = '.';

        char[][] thirdFloor = new char[3][3];
        thirdFloor[0][0] = '1';
        thirdFloor[0][1] = '.';
        thirdFloor[0][2] = '.';
        thirdFloor[1][0] = 'o';
        thirdFloor[1][1] = 'o';
        thirdFloor[1][2] = '.';
        thirdFloor[2][0] = '.';
        thirdFloor[2][1] = '.';
        thirdFloor[2][2] = '.';

        char[][] secondFloor = new char[3][3];
        secondFloor[0][0] = 'o';
        secondFloor[0][1] = 'o';
        secondFloor[0][2] = 'o';
        secondFloor[1][0] = '.';
        secondFloor[1][1] = '.';
        secondFloor[1][2] = 'o';
        secondFloor[2][0] = '.';
        secondFloor[2][1] = 'o';
        secondFloor[2][2] = 'o';

        char[][] firstFloor = new char[3][3];
        firstFloor[0][0] = 'o';
        firstFloor[0][1] = 'o';
        firstFloor[0][2] = 'o';
        firstFloor[1][0] = 'o';
        firstFloor[1][1] = '.';
        firstFloor[1][2] = '.';
        firstFloor[2][0] = 'o';
        firstFloor[2][1] = '.';
        firstFloor[2][2] = '2';


        //вообще где-то тут нужно запустить цикл

        for (int i = 0; i < thirdFloor.length; i++) { // проверять нужно на каждом этаже
            for (int j = 0; j < thirdFloor[i].length; j++) {
                if(thirdFloor[i][j] == princess){
                    System.out.println("You found her!");
                    break;
                }
            }
        }

        char exit;
        char entrence;
        for (int i = 0; i < thirdFloor.length; i++) {  //пытаюсь сравнить два этажа шоб найти одну точку общую
            for (int j = 0; j < thirdFloor[i].length; j++) {
                for (int s = 0; i < secondFloor.length; i++) {
                    for (int c = 0; j < secondFloor[s].length; j++) {
                        if(firstFloor[i][j] == secondFloor[s][c] && firstFloor[i][j]== '.') {
                        exit = thirdFloor[i][j]; // эту точку обозначить конечной для волнового алгоритма
                        entrence = secondFloor[s][c]; //точка входа на следующем этаже
                        }
                    }
                }
            }
        }

        //тут по идее волновой алгоритм, потом нужно этаж--, затем заходим снова на цикл
    }
}
