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
        double result = (double) firstNumber / secondNumber;
        System.out.println(Message.outPutMessage(firstNumber, operator, secondNumber, result));
      }

      default -> {
        System.out.println("演算子が正しくありません。");
        System.out.println("+,-,*,/で入力してください。");
      }
    }
  }
}
