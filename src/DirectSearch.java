import java.util.Arrays;

public class DirectSearch {

    public static int search(String subString, String string){
        char[] subStringCharArr = subString.toCharArray();
        char[] stringCharArr = string.toCharArray();
        char[][] table = new char[stringCharArr.length+1][stringCharArr.length];
        for (int a = 0; a < stringCharArr.length+1;a++){
            for (int b = 0; b < stringCharArr.length;b++)
                table[a][b] = '-';
        }

        for (int i = 0 ; i < stringCharArr.length ; i++)
            table[0][i] = stringCharArr[i];


        for(int i = 0; i < stringCharArr.length; i++){
            for (int j = 0; j < subStringCharArr.length; j++){
                table[i+1][j+i] = subStringCharArr[j];
                if (stringCharArr[i+j] != subStringCharArr[j]) break;
                if (j == subStringCharArr.length - 1) {
                    for (int a = 0; a < i+2 ;a++){
                        for (int b = 0; b < stringCharArr.length;b++){
                            System.out.print(table[a][b]);
                        }
                        System.out.println();
                    }
                    return i;
                }
            }
        }
        return -1;
    }
}
