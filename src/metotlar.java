public class metotlar {
    static int koray(int a, int b) {
        return a * b;
    }

        static void koray () {
            System.out.println("koray");
        }
        static void koray ( int a){
            System.out.println(a * 23);
        }
        public static void main (String[]args){
            System.out.println(koray(4, 12));
            koray();
            koray(3);
        }
    }

