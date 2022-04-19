package strrev;
public class StringReverse{
    public static void main(String[] args) {
        String name ="Java";
        StringBuilder sb = new StringBuilder(name);
        System.out.println(sb.reverse());
    }
}