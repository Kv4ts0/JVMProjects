import java.util.Arrays;
import java.util.List;

public class typeOfInteger {
    protected int x = 24;


    public typeOfInteger() {

    }

    public typeOfInteger(int x) {
        this.x = x;//initialize
    }

    void even(){


        Integer[] myArray = new Integer[]{5,24};

        List<Integer> list = Arrays.asList(myArray);

        if(list.contains(x)){
            System.out.println("My array includes the number " + x);
        }

    }


}

