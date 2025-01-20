package JavaLeetCode;

public class LowerCase_709 {
    public static void main(String[] args) {
        String s="Hello";
        System.out.println(toLowerCase(s));
    }
    public static String toLowerCase(String s) {
        char c[]=s.toCharArray();
        int v;
        String st="";
        for(int i=0; i<c.length;i++){
            v=(int)c[i];
            if(v>=65 && v<91){
                v=v+32;

            }
            char ch=(char)v;
            st=st+Character.toString(ch);
        }
        return st;
    }
}
