import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                try {
                    Scanner in = new Scanner(System.in);
                    String text = in.nextLine();
                    in.close();
                    if (text.charAt(0) == ' ')
                        throw new Exception("You must start the line with a number!");
                    if ((text.charAt(0) == 'I') || (text.charAt(0) == 'V') || (text.charAt(0) == 'X')) {
                        Result_with_numbers_roman y = new Result_with_numbers_roman();
                        First_number_roman a = new First_number_roman();
                        Second_number_roman b = new Second_number_roman();
                        if ((a.Search_first_number_roman(text) == 0) || (b.Search_second_number_roman(text) == 0))
                            throw new Exception("Invalid input!");
                        char t = text.charAt(a.Number_of_first_space_roman(text) + 1);
                        if ((a.Search_first_number_roman(text) <= b.Search_second_number_roman(text)) && (t == '-'))
                            throw new Exception("Zero or negative number!");
                        if ((a.Search_first_number_roman(text) < b.Search_second_number_roman(text)) && (t == '/'))
                            throw new Exception("Zero!");
                        if ((t == '+') || (t == '-') || (t == '*') || (t == '/'))
                            System.out.println(y.Result_of_operations(a.Search_first_number_roman(text), b.Search_second_number_roman(text), text));
                        else
                            throw new Exception("Invalid input!");
                    }
                    if ((text.charAt(0) >= '1') && (text.charAt(0) <= '9')) {
                        First_number a = new First_number();
                        Second_number b = new Second_number();
                        Result_with_numbers y = new Result_with_numbers();
                        if ((a.Search_first_number(text) == 0) || (b.Search_second_number(text) == 0))
                            throw new Exception("Invalid input!");
                        char t = text.charAt(a.Number_of_first_space(text) + 1);
                        if ((t == '+') || (t == '-') || (t == '*') || (t == '/'))
                            System.out.println(y.Result_of_operations(a.Search_first_number(text), b.Search_second_number(text), text));
                        else
                            throw new Exception("Invalid input!");
                    }
                }
                catch (Exception ex){
                    System.out.println(ex.getMessage());
                }
        }
}