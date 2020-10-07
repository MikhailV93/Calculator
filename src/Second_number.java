public class Second_number {
    int Search_second_number(String text){
        First_number i = new First_number();
        int Num = i.Number_of_first_space(text) + 3;
        int b = 0;
        while ((Num <= (text.length() - 1)) &&  (text.charAt(Num) != ' ')){
            if ((text.charAt(Num) >= '0') && (text.charAt(Num) <= '9'))
                b = b * 10 + (text.charAt(Num) - '0');
            else
                return 0;
            Num++;
        }
        if (b <= 10)
            return b;
        else
            return 0;
        }
    }
