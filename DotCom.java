import java.util.ArrayList;

public class DotCom {
        private ArrayList<String> locationCells;
        //int numOfHits = 0;
        public void setLocationCells(ArrayList<String> loc){
            locationCells = loc;
        }
    public String checkYourself(String userInput) {
        String result = "Мимо";

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
            result = "Потопил";
        } */
        System.out.println(result);
            return result;
    }
}
