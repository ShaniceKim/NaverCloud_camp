package myapp;

// 코드 본문에서 사용할 클래스가 어떤 패키지인지 지정한다.
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
      System.out.println("나의 목록 관리 시스템");
      System.out.println("-----------------------------------"); 

     // 키보드 스캐너 준비
      Scanner scanner = new Scanner(System.in);

      System.out.print("번호? : ");
      int no1 =scanner.nextInt();

      System.out.print("이름? : ");
      String name1 = scanner.next();

      System.out.print("나이? : ");
      int age1 = scanner.nextInt();

      System.out.print("재직 여부? : ");
      boolean working1 = scanner.nextBoolean();

      System.out.print("성별? : ");
      String str = scanner.next();
      char gender1 = str.charAt(0);

      System.out.print("좌우시력? : ");
      float leftEye1 = scanner.nextFloat();
      float rightEye1 = scanner.nextFloat();
  
//

      System.out.print("번호? : ");
      int no2 =scanner.nextInt();
  
      System.out.print("이름? : ");
      String name2 = scanner.next();
  
      System.out.print("나이? : ");
      int age2 = scanner.nextInt();
  
      System.out.print("재직 여부? : ");
      boolean working2 = scanner.nextBoolean();
  
      System.out.print("성별? : ");
      str = scanner.next();
      char gender2 = str.charAt(0);
  
      System.out.print("좌우시력? : ");
      float leftEye2 = scanner.nextFloat();
      float rightEye2 = scanner.nextFloat();
    
//

      System.out.print("번호? : ");
      int no3 =scanner.nextInt();

      System.out.print("이름? : ");
      String name3 = scanner.next();

      System.out.print("나이? : ");
      int age3 = scanner.nextInt();

      System.out.print("재직 여부? : ");
      boolean working3 = scanner.nextBoolean();

      System.out.print("성별? : ");
      str = scanner.next();
      char gender3 = str.charAt(0);

      System.out.print("좌우시력? : ");
      float leftEye3 = scanner.nextFloat();
      float rightEye3 = scanner.nextFloat();
  

      System.out.println("---------------------------------");

      System.out.printf("번호 : %d\n", no1);
      System.out.printf("이름: %s\n", name1);            //s : 문자열
      System.out.printf("나이:\n" , age1);
      System.out.printf("재직자: %b\n", working1);            //출력후 줄바꿈, \n : escape character
      System.out.printf("성벌(남자(M), 여자(W)): %c\n", gender1);          // c: 문자(문자열이랑 다름)
      System.out.printf("좌우시력: %f,%f\n", leftEye1, rightEye1);          
//
System.out.printf("번호 : %d\n", no2);
      System.out.printf("이름: %s\n", name2);            //s : 문자열
      System.out.printf("나이:\n" , age2);
      System.out.printf("재직자: %b\n", working2);            //출력후 줄바꿈, \n : escape character
      System.out.printf("성벌(남자(M), 여자(W)): %c\n", gender2);          // c: 문자(문자열이랑 다름)
      System.out.printf("좌우시력: %f,%f\n", leftEye2, rightEye2);          
//
System.out.printf("번호 : %d\n", no3);
      System.out.printf("이름: %s\n", name3);            //s : 문자열
      System.out.printf("나이:\n" , age3);
      System.out.printf("재직자: %b\n", working3);            //출력후 줄바꿈, \n : escape character
      System.out.printf("성벌(남자(M), 여자(W)): %c\n", gender3);          // c: 문자(문자열이랑 다름)
      System.out.printf("좌우시력: %f,%f\n", leftEye3, rightEye3);          

      scanner.close();
    }
  }