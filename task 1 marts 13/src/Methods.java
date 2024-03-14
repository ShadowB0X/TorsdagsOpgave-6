import java.util.ArrayList;

public class Methods {

    public void methodA(String input) {
        System.out.println("J");
        input = "kast";
        if (input.equals("kast")) {
            System.out.println("a");
            methodB();
        }
    }

    public void methodB() {
        System.out.println("v");

    }

    public void methodC(int number) {
        number = 2;
        if (number == 2) {
            System.out.println("a");
            System.out.println("");
            System.out.println("e");
            System.out.println("r");
        }

    }

    public void methodD(char k){
        ArrayList<String> sjovt = new ArrayList<>();
       sjovt.add("");
        sjovt.add("S");
        sjovt.add("j");
        sjovt.add("o");
        sjovt.add("v");
        sjovt.add("t");
        for (String s : sjovt){
            System.out.println(s);
        }
    }

}