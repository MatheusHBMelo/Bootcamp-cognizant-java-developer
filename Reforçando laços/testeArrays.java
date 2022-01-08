public class testeArrays {
    public static void main(String[] args){
        int[] idades = new int[3];

        idades[0] = 15;
        idades[1] = 14;
        idades[2] = 20;

        for (int i : idades) {
            System.out.println(i);
        }

        int[][] num = new int[2][2];

        num[0][0] = 1;
        num[0][1] = 2;
        num[1][0] = 3;
        num[1][1] = 4;

        for(int i = 0; i < num.length; i++){
            int[] id = num[i];
            for(int j = 0; j < id.length; j++){
                System.out.print(num[i][j]);
            }
        }
    }
}
