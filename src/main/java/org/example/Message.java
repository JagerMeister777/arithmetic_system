package org.example;

public class Message {

  //計算結果を返す
  public static String outPutMessage(int firstNumber, String operator, int secondNumber,
      int result) {
    return "計算結果: " + firstNumber + " " + operator + " " + secondNumber + " = " + result;
  }

  //計算結果を返す（割り算は小数点第２位で切り上げ）
  public static String outPutMessage(int firstNumber, String operator, int secondNumber,
      double result) {
    if (firstNumber % secondNumber == 0){
      return "計算結果: " + firstNumber + " " + operator + " " + secondNumber + " = " + (int)result;
    }else{
      return "計算結果: " + firstNumber + " " + operator + " " + secondNumber + " = " + Math.ceil(result * 10) / 10;
    }
  }

}
