class Main {
  public static void main(String[] args) {
    String message = "everyone loves java";
    char[] charArray = message.toCharArray();
    boolean foundSpace = true;

    for(int i = 0; i < charArray.length; i++) {

      if(Character.isLetter(charArray[i])) {

      }

      else {
        foundSpace = true;
      }
    }

    message = String.valueOf(charArray);
    
      System.out.println(message.replaceAll(" ", ""));
  }
}
