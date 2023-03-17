import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class GamingMashin {
    private List<Toy> toyList;
//    private static List<Toy> DEFAULT = new ArrayList<>(Arrays.asList(new Mishka(4, "MihailoPotapich", 1, 10)));
    public GamingMashin(List<Toy> toyList){
        this.toyList = toyList;
    }


    public String toString() {
        StringBuilder result = new StringBuilder();
        toyList.forEach(i -> result.append(i.toString() + "\n"));

        return result.toString();
    }

}
