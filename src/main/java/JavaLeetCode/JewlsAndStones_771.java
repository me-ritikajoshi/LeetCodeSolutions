package JavaLeetCode;

public class JewlsAndStones_771 {
    public static void main(String[] args) {
        String jewels="z";
        String stones="ZZ";
        System.out.println(numJewelsInStones(jewels,stones));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int count=0;
        char[] jewlsChar=jewels.toCharArray();
        char[] stonesChar=stones.toCharArray();

        for (int i = 0; i < stonesChar.length; i++) {
            for (int j = 0; j < jewlsChar.length; j++) {
                if(jewlsChar[j]==stonesChar[i]){
                    count++;
                }
            }
            
        }

        return count;
    }
}
