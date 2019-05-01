final class test_java{

public static int flagToInt(boolean flag){

      if (flag){
        return 1;
      }
      else{
        return 0;
      }

    }

public static void main(String args[]) {
      System.out.println("Test Case 1 for (Q3 solvecode) score:" + flagToInt(battery(0.3, 4.0, 12.0) == 10.8));
      System.out.println("Test Case 2 for (Q3 solvecode) score:" + flagToInt(angmom(4.0, 2.0, 3.0) == 24.0));
      System.out.println("Test Case 3 for (Q3 solvecode) score:" + flagToInt(lens(6.0, 9.0) == 3.0));
      System.out.println("Test Case 4 for (Q3 solvecode) score:" + flagToInt(lift(700.0, 8.0, 10.0) == 560.0));
   }
}