public class Second_number_roman {
    int Search_second_number_roman(String text){
        First_number_roman i = new First_number_roman();
        int Num = i.Number_of_first_space_roman(text) + 3;
        String str = "";
        if ((text.charAt(Num) == 'I') || (text.charAt(Num) == 'V') || (text.charAt(Num) == 'X')) {
            while ((Num <= (text.length() - 1)) &&  (text.charAt(Num) != ' ')) {
                if ((text.charAt(Num) == 'I') || (text.charAt(Num) == 'V') || (text.charAt(Num) == 'X'))
                    str = str + Character.toString(text.charAt(Num));
                else
                    return 0;
                Num++;
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
            return 0;
        }
        return 0;
    }
}
