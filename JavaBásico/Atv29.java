public class Atv29 {
    public static void main(String[] args) {
        int i=1;
        for (int j = 7; j >=5 ; j--) {
            if (i>=9 && j<=5) {
            System.out.println("I = "+i+" J="+j);
            break;
           }
           if (j<=5) {
            System.out.println("I = "+i+" J="+j);
            i=i*3;
            j=7;
            }
            System.out.println("I = "+i+" J="+j);
        }
    }
}
