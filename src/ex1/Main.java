package ex1;

public class Main {
   public static void main(String[] args) {
      Employee A = new Employee("ADAMS", 35, 5);
      Employee B = new Employee("BAKER", 40, 5);
      Employee C = new Employee("CAIRNS", 44, 5);
      Employee D = new Employee("DONALD", 20, 6);
      A.calculatePay();
      B.calculatePay();
      C.calculatePay();
      D.calculatePay();
   }

}
