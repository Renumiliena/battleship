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


    }
}
