package calculator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
class Calculator {
    String calculate(String[] expression) {
        //System.out.println("Length : " + expression.length);
        //System.out.println(expression[0]);
        //System.out.println(expression[1]);
       // System.out.println(expression[2]);
     /*
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
            */
     /*
     * //1+3-5-8...
        double res = Double.parseDouble(expression[0]);
        // kazdij vtoroj iz massiva
        for(int i = 1; i<expression.length; i+=2){
            System.out.println(expression[i]);
            String opr = expression[i];
            double a = Double.parseDouble(expression[i-1]);
            double b = Double.parseDouble(expression[i+1]);
            //expression.
            switch (expression[i]) {
                case "+":                res   += b;                break;
                case "-":                res   -= b;                break;
                case "*":                res   *= b;                break;
                case "/":                res   /= b;                break;
                //default:                 res = 0;
            }
            System.out.println("Rezult : " +res);
      }*/
        List<String> tmp = new ArrayList<>();
        double a = Double.parseDouble(expression[0]);

        for(int i = 1; i<expression.length; i+=2){
            System.out.println(expression[i]);
            String opr = expression[i];
            double b = Double.parseDouble(expression[i+1]);
            //expression.
            switch (expression[i]) {
                case "+":
                case "-":
                    tmp.add(String.valueOf(a));
                    tmp.add(opr);
                    a=b;
                    break;
                case "*":    a*= b;                break;
                case "/":    a/= b;                break;
                //default:                 res = 0;
            }
            //System.out.println("Rezult : " +res);
      }
        tmp.add(String.valueOf(a));
        System.out.println(tmp);
        double res =Double.parseDouble(tmp.get(0));
        for(int i = 1; i<tmp.size(); i+=2){
            System.out.println(expression[i]);
            String op = tmp.get(i);
            double b = Double.parseDouble(tmp.get(i+1));
            //expression.
            switch (op) {
                case "+":                res   += b;                break;
                case "-":                res   -= b;                break;
                default:                 res = 0;
            }
            //System.out.println("Rezult : " +res);
        }
       return String.valueOf(res);
    }

}
