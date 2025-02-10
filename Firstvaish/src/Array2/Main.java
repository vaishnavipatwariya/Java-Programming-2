package Array2;
class Array_Example {
    void multiArrays() {
        int[][] arr = {{4, 7, 8}, {5, 0}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}

    public class Main {
        public static void main(String[] args) {
            Array_Example obj = new Array_Example();
            obj.multiArrays();
        }

    }

