public class SectionExercises {

   public static void main(String[] args) {

      // create a byte variable. Set it to any valid byte number
      byte byteNum = 127;

      // create a short variable, and set it to any valid short number
      short shortNum = 3000;

      // create an int variable; set it to any valid int number
      int intNum = 2_000_000;

      // create a variable of type long,
      // make it equal to 5,000 + 10 times the sum of the byte
      // plus the short, plus the integer

      // you don't need to cast [(byte) or (short)] when using long
      // because the values will be converted, without error, to integers
      // type long accepts integers
      short shortTotal = (short) (1000 + 10 * (byteNum + shortNum+ intNum));
      System.out.println("shortTotal = " + shortTotal);

      long longTotal = 50_000L + 10L * (byteNum + shortNum + intNum);
      System.out.println("longTotal = " + longTotal);
   }
}
