import java.util.Locale;

public class Autoservice {

    public void modify(Car car){
        String mark = car.getMark();
        mark = mark.replace('a','o');
        mark = mark.replace('i','e');
        mark = mark.toUpperCase();
        car.setMark(mark);
    }
}
