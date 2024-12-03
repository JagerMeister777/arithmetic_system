package org.example;

import java.text.Normalizer;

public class Arithmetic {

  public static void arithmeticResult(int firstNumber, String operator, int secondNumber){
    //演算子を半角に統一（UNICODE正規化）
    operator = Normalizer.normalize(operator, Normalizer.Form.NFKC);

    switch (operator){
      case "+" -> {
        int result = firstNumber + secondNumber;
        System.out.println(Message.outPutMessage(firstNumber, operator, secondNumber, result));
      }

      case "-" -> {
        int result = firstNumber - secondNumber;
        System.out.println(Message.outPutMessage(firstNumber, operator, secondNumber, result));
      }

      case "*" -> {
        int result = firstNumber * secondNumber;
        System.out.println(Message.outPutMessage(firstNumber, operator, secondNumber, result));
      }

      case "/" -> {
        //ゼロ割り算を考慮
        try {
          double result = (double) firstNumber / secondNumber;
          System.out.println(Message.outPutMessage(firstNumber, operator, secondNumber, result));
        }catch (ArithmeticException e) {
          System.out.println(Message.outPutMessage(firstNumber, operator, secondNumber, 0));
        }

//        double result = (double) firstNumber / secondNumber;
//
//        //ゼロ割り算を考慮
//        if (Double.isInfinite(result)){
//          System.out.println(Message.outPutMessage(firstNumber, operator, secondNumber, 0));
//        }else{
//          System.out.println(Message.outPutMessage(firstNumber, operator, secondNumber, result));
//        }
      }

      default -> {
        System.out.println("演算子が正しくありません。");
        System.out.println("+,-,*,/で入力してください。");
      }
    }
  }
}
