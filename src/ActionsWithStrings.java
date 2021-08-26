import java.util.Arrays;

public class ActionsWithStrings {

    private final String [] array;

    public ActionsWithStrings(String[] array) {
        this.array = array;
    }

    public void findingIdenticalSetsOfEls(){
        for (int out = 0; out < array.length; out++) {
            for (int in = array.length-1; in > out; in--) {
                if(equalsStrings(array[out], array[in])){
                    System.out.printf("%s = %d, %d%n", array[out], out, in);
                }
            }
        }
    }

    private boolean equalsStrings(String firstString, String secondString){
        return Arrays.equals(sortStrings(firstString), sortStrings(secondString));
    }

    private char[] sortStrings(String string){
        char[] charsArray = string.toCharArray();
        Arrays.sort(charsArray);
        return charsArray;
    }

}
