package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
class Calculator {

    String calculate(String[] expression) {
        System.out.println(expression[0]);
        System.out.println(expression[1]);
        System.out.println(expression[2]);
        double a = Double.parseDouble(expression[0]);
        //int b = Integer.parseInt(expression[1]);
        double b = Double.parseDouble(expression[2]);

        double res = 0;
        switch (expression[1]) {
            case "+":                res = a + b;                break;
            case "-":                res = a - b;                break;
            case "*":                res = a * b;                break;
            case "/":                res = a / b;                break;
            //default:                 res = 0;
        }
        System.out.println("Length : " + expression.length);
        if (expression.length>3) {
            double c = Double.parseDouble(expression[4]);
            switch (expression[3]) {
                case "+":                    res = res + c;                    break;
                case "-":                    res = res - c;                    break;
                case "*":                    res = res * c;                    break;
                case "/":                    res = res / c;                    break;
                // default:                 res = 0;
            }
        } // if expression.length
        return String.valueOf(res);
    }

}
