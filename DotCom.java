import java.util.ArrayList;

public class DotCom {
    private String name;
    private ArrayList<String> locationCells;
    public void setLocationCells(ArrayList<String> loc){locationCells = loc;}

    public void setName(String n){
        name = n;
    }
    public String checkYourself(String userInput) {
        String result = "Мимо";
        System.out.println(123);

        int index = locationCells.indexOf(userInput);
        if (index >= 0){
            locationCells.remove(index);

            if(locationCells.isEmpty()){
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }
        /* if(numOfHits == locationCells.length){
            result qweqwewqewqe= "Потопил";
        } */
        System.out.println(result);
            return result;
    }
}
