class Main {
  public static void main(String[] args) {
    
    ArrayUtil arrayUtil = new ArrayUtil();
    StringUtil stringUtil = new StringUtil();
    
    int[] array = { 1, 2, 3, 0, 5, 6, 7, 8};
    
    arrayUtil.printValues(array);
    arrayUtil.printValues(arrayUtil.removeValue(array, 0));
    arrayUtil.printValues(arrayUtil.findEvenNumbers(array));
    arrayUtil.printValues(arrayUtil.reverseElements(array));
    arrayUtil.printValues(arrayUtil.moveZerosElements(array));
    arrayUtil.printValues(arrayUtil.resizeArray(array, 15));
    
    System.out.println(arrayUtil.findMaximumValue(array));
    System.out.println(arrayUtil.findMinimumValue(array));
    System.out.println(arrayUtil.findSecondMax(array));
    System.out.println(arrayUtil.findMissingNumber(array));
    System.out.println(stringUtil.isStringPalindrome("MADAM"));
  }
}
