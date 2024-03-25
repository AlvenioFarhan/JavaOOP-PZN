package programmer.zaman.now.util;

public class MathUtil {

    public static Integer sum(Integer... values){
        Integer total = 0;
        for ( Integer value : values){
            total += value;
        }
        return total;
    }
}
