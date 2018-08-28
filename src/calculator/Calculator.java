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
        if (expression.length<4) {
            return String.valueOf(res);
        } // if expression.length
            double c = Double.parseDouble(expression[4]);
            String op1 = expression[1];
            String op2 = expression[3];
            switch (op1 +op2) {
                case "++":                  res = a + b + c;                    break;
                case "--":                  res = a - b - c;                    break;
                case "**":                  res = a * b * c;                    break;
                case "//":                  res = a / b / c;                    break;
                case "+*":                  res = a + (b * c);                    break;
                case "-*":                  res = a - (b * c);                    break;
                case "*+":                  res = (a * b) + c;                    break;
                case "*-":                  res = (a * b) - c;                    break;
                case "+/":                  res = a + (b / c);                    break;
                case "-/":                  res = a - (b / c);                    break;
                case "/+":                  res = (a / b) + c;                    break;
                case "/-":                  res = (a / b) - c;                    break;

                // default:                 res = 0;
            }
        return String.valueOf(res);
    }

}
