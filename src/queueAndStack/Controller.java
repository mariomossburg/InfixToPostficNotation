package queueAndStack;

public class Controller {
    public static void main(String[] args) {
        //sample inputs and expected output:
        //(2+3)*(4+5) = 23+45+*
        //2+3*4+5 = 234*+5+
        InfixNotationToPostfix convert = new InfixNotationToPostfix();
        convert.userInput();
        convert.userInput();
    }//end main
}//end class
