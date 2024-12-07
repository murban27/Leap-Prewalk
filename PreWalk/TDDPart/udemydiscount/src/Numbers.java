import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private Number number;

    public Numbers() {
        number = new Number();
    }

    ;

    public int getNumbers(String romanian) {
        int totalnumbers = 0;
        char next_char;
        int counter = 0;
        char[] word = romanian.toCharArray();

        for (char s : word) {
            int multiplier = 1;
            if ((s == 'I' || s == 'X' || s == 'C')&&(word.length>(counter+1))) {

                multiplier = PossibleDecrease(s, word[counter + 1]);

            }
            totalnumbers += (number.retunValue(s) * multiplier);
            counter++;
        }
        return totalnumbers;

    }

    public int PossibleDecrease(char first, char second) {
        if (first == 'I' && (second == 'V' || second == 'X')) {
            return -1;
        } else if (first == 'X' && (second == 'L' || second == 'C')) {
            return -1;
        } else if (first == 'C' && (second == 'D' || second == 'M')) {
            return -1;
        }
        return 1;

        }


    }




