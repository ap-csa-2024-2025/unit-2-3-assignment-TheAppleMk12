public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println(firstLastN("dictionary" , 1));
    System.out.println(firstLastN("apple" , 2));
    System.out.println(delEnd("library", 5));
    System.out.println(compareLower("Sterling", "Matierial"));
  }

  public static String firstLastN(String word, int n)
  {
    String firstN = word.substring(0, n);
    int indexOfNToLast = word.length() - n;
    String lastN = word.substring(indexOfNToLast);

    String output = firstN + lastN;
    return output;
  }

  public static String delEnd(String word, int n)
  {
    int finalLength = word.length() - n;
    String finalWord = word.substring(0, finalLength);

    String output = finalWord;
    return output;
  }
  public static String compareLower(String A, String B)
  {
    String lowerA = A.toLowerCase();
    String lowerB = B.toLowerCase();
    int difference = A.compareTo(B);

    String output = A + "\n" + B + "\n" + "Result : " + difference;
    return output;
  }
  // write solutions to problems below

}
