package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //四則演算のプログラム
    //ユーザーから入力を受け取り計算結果を出力
    Scanner scanner = new Scanner(System.in);

    System.out.print("1番目の数字を入力してください: ");
    String firstNumber = scanner.nextLine();

    System.out.print("演算子を入力してください。(+,-,*,/): ");
    String operator = scanner.nextLine();

    System.out.print("2番目の数字を入力してください: ");
    String secondNumber = scanner.nextLine();

    //入力された数値と演算子のチェック
    boolean isNumber = CheckData.checkNumber(firstNumber);
    boolean isNumber2 = CheckData.checkNumber(secondNumber);
    boolean isOperator = CheckData.checkOperator(operator);

    //全てTrueなら正常に実行
    if (isNumber && isNumber2 && isOperator){
      //firstNumberとsecondNumberはString型のためInteger.parseIntでint型に変換
      Arithmetic.arithmeticResult(Integer.parseInt(firstNumber),operator, Integer.parseInt(secondNumber));
    }else{
      System.out.println("入力が正しくありません。");
    }

  }
}