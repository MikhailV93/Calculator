public class First_number_roman {
    int Search_first_number_roman(String text) {
        int i = 0;
        String str = "";
        if ((text.charAt(i) == 'I') || (text.charAt(i) == 'V') || (text.charAt(i) == 'X')) {
            while (text.charAt(i) != ' ') {
                if ((text.charAt(i) == 'I') || (text.charAt(i) == 'V') || (text.charAt(i) == 'X'))
                    str = str + Character.toString(text.charAt(i));
                else
                    return 0;
                i++;
            }
            switch (str) {
                case "I":
                    return 1;
                case "II":
                    return 2;
                case "III":
                    return 3;
                case "IV":
                    return 4;
                case "V":
                    return 5;
                case "VI":
                    return 6;
                case "VII":
                    return 7;
                case "VIII":
                    return 8;
                case "IX":
                    return 9;
                case "X":
                    return 10;
            }
            return  0;
        }
        return 0;
    }
    int Number_of_first_space_roman(String text){
        int i = 0;
        while (text.charAt(i) != ' '){
            i++;
        }
        return i;
    }
}

