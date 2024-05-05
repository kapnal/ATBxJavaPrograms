package src.practiceoops;

public class Lab011 {
    public static void main(String[] args) {

        temp("Kapil");
        temp(123);
        temp(true);

        Integer result = max(2,7);
        System.out.println(result);

    }
        public static <T> void temp (T x) {
            System.out.println(x);
        }

            public static Integer max(Integer a,Integer b){
                if(a > b)
                    return a;
                else
                    return b;
            }

    }

