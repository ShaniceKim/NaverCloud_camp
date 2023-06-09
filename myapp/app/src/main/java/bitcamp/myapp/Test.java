package bitcamp.myapp;

import bitcamp.util.Calculator;

public class Test {
  
  public static void main(String[] args) {
    // 2 * 3 + 7 - 2 / 2 = ?
    // 3 - 1 * 7 + 15 / 3 = ?
    // => 연산자 우선 순위를 고려하지 않고 앞에서부터 뒤로 순차적으로 계산한다.

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    c1.init(2);
    c2.divide(3);
    c1.multiple(3);
    c2.plus(7);
    c2.multiple(1);
    c2.init(3);
    c2.minus(15);
    c1.plus(7);
    c1.minus(2);
    c1.divide(2);
    
    System.out.println(c1.getResult());
    System.out.println(c2.getResult());
  }
}


// 2. package bitcamp.myapp;

// import bitcamp.util.Calculator;

// public class Test {
  
//   public static void main(String[] args) {
//     // 2 * 3 + 7 - 2 / 2 = ?
//     // 3 - 1 * 7 + 15 / 3 = ?
//     // => 연산자 우선 순위를 고려하지 않고 앞에서부터 뒤로 순차적으로 계산한다.

//     Calculator c1 = new Calculator();
//     Calculator c2 = new Calculator();

//     bitcamp.util.Calculator.init(c1, 2);
//     bitcamp.util.Calculator.divide(c2, 3);
//     bitcamp.util.Calculator.multiple(c1, 3);
//     bitcamp.util.Calculator.plus(c2, 7);
//     bitcamp.util.Calculator.multiple(c2, 1);
//     bitcamp.util.Calculator.init(c2, 3);
//     bitcamp.util.Calculator.minus(c2, 15);
//     bitcamp.util.Calculator.plus(c1, 7);
//     bitcamp.util.Calculator.minus(c1, 2);
//     bitcamp.util.Calculator.divide(c1, 2);
    
//     System.out.println(bitcamp.util.Calculator.getResult(c1));
//     System.out.println(bitcamp.util.Calculator.getResult(c2));
//   }
// }

////////

// // 1. package bitcamp.myapp;

// // // 소스 코드에서 Calculator 클래스는 bitcamp.util 패키지에 소속된 클래스를 가리킨다.


// // public class Test {
  
// //   public static void main(String[] args) {
// //     // 2 * 3 + 7 - 2 / 2 = ?
// //     // => 연산자 우선 순위를 고려하지 않고 앞에서부터 뒤로 순차적으로 계산한다.

// //       init(2);
// //       plus(3);
// //       multiple(3);
// //       plus(7);
// //       minus(2);
// //       divide(2);
      
// //       System.out.println(result);
// //      }

// //      static int result = 0;

// //      static void init(int a) {
// //       result = a;
// //      }

// //      static void plus(int a) {
// //       result+=a;
// //      }
// //      static void minus(int a) {
// //       result -= a;
// //      }
// //      static void multiple(int a) {
// //       result *= a;
// //      }
// //      static void divide(int a) {
// //       result /= a;
// //      }

// //   }

  

