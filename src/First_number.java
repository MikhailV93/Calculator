public class First_number {
    int Search_first_number(String text){
        int i = 0;
        int a = 0;
        if ((text.charAt(i) >= '1') && (text.charAt(i) <= '9')) {
            while (text.charAt(i) != ' ') {
                if ((text.charAt(i) >= '0') && (text.charAt(i) <= '9'))
                    a = a * 10 + (text.charAt(i) - '0');
                else
                    return 0;
                i++;
            }
            if (a <= 10)
                return a;
            else
                return 0;
        }
        else
            return 0;
    }
    int Number_of_first_space(String text){
        int i = 0;
        while (text.charAt(i) != ' '){
            i++;
        }
        return i;
    }
}
