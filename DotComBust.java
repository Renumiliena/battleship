import java.util.ArrayList;
public class DotComBust {
    //Объявляем переменные
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom obj1 = new DotCom();
        obj1.setName("pet.com");
        DotCom obj2 = new DotCom();
        obj2.setName("rust.eu");
        DotCom obj3 = new DotCom();
        obj3.setName("ssuwt.ru");
        ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
        dotComList.add(obj1);
        dotComList.add(obj2);
        dotComList.add(obj3);

        System.out.println("Ваша цель - потопить три сайта.");
        System.out.println("pet.com, rest.eu, ssuwt.ru");
        System.out.println("Попытайся потопить их за минимальное количество ходов");

        for (DotCom dotComToSet : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }
    private void startPlaying() {
        while(!dotComList.isEmpty()){
            String userGuess = helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "Мимо";
        for(DotCom dotComToTest : dotComList){
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Попал")){
                break
            }
            if (result.equals("Потопил")){
                dotComList.remove(dotComToTest);
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("Конец игры");
        if(numOfGuesses < 10){
            System.out.println("Вы молодец!");
        } else {
            System.out.println("Улучшайте свой результат");
        }
    }

    public static void main(String[] args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
