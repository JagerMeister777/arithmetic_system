package org.example;

import java.util.List;

public class CheckData {

  //数字かどうかチェックする
  public static boolean checkNumber(String number) {
    try {
      //文字列を整数に変換して例外が起こればcatchへ
      Integer.parseInt(number);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  //演算子かどうかチェックする
  public static boolean checkOperator(String operator) {
    List<String> operators = List.of("+", "-", "*", "/", "＋", "ー", "＊", "／");

    boolean isOperator = false;

    for (String op : operators) {
      if (op.equals(operator)) {
        isOperator = true;
        break;
      }
    }
    return isOperator;
  }
}

