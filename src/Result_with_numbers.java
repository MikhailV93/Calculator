public class Result_with_numbers {
    int Result_of_operations(int a, int b, String text){
        First_number i = new First_number();
        char t = text.charAt(i.Number_of_first_space(text) + 1);
        if (t == '+') {
            return (a + b);
        }
        if (t == '-') {
            return (a - b);
        }
        if (t == '*') {
            return (a * b);
        }
        if (t == '/') {
            return (a / b);
        }
        return 0;
    }
}
