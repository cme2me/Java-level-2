package Lesson2;

public class Array{
    public static void main(String[] args) {
        int [][] array = new int[][]{{1,2,3,4}, {1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        try{
            try {
                int result = method(array);
                System.out.println(result);
            }catch (MyArraySizeException e){
                System.out.println("Размер превышен");
            }
        }catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "n" + e.j);
        }
    }

    private static int method(int[][] array) throws MyArraySizeException, MyArrayDataException{
        int count = 0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    count = count + (array[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}
