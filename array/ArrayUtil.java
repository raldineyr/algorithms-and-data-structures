public class ArrayUtil {
 
  public int findMissingNumber(int[] arr) {
    int n = (arr.length + 1);
    int number = n * (n + 1) / 2;
    for (int element : arr) {
      number = number - element;
    }
    return number;
  }

  public int[] resizeArray(int[] arr, int capacity) {
    int[] temp = new int[capacity];
    for (int i = 0; i < arr.length; i++) {
      temp[i] = arr[i];
    }
    arr = temp;
    return arr;
  }

  public int[] moveZerosElements(int[] arr) {
    int range = (arr.length);
    int j = 0;
    for (int i = 0; i < range; i++) {
      if (arr[i] != 0 && arr[j] == 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
      if (arr[j] != 0) {
        j++;
      }
    }
    return arr;
  }

  public int findMaximumValue(int[] arr) {
    int maxValue = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > maxValue) {
        maxValue = arr[i];
      }
    }
    return maxValue;
  }

  public int findMinimumValue(int[] arr) {
    int minValue = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < minValue) {
        minValue = arr[i];
      }
    }
    return minValue;
  }

  public int[] reverseElements(int[] arr) {
    int storage = (arr.length - 1);
    int temp;

    for (int i = 0; i < arr.length / 2; i++) {
      temp = arr[i];
      arr[i] = arr[storage - i];
      arr[storage - i] = temp;
    }
    return arr;
  }

  public int[] findEvenNumbers(int[] arr) {
    int evenCounter = 0;
    int newArrayCounter = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        evenCounter++;
    }
  }

    int[] array = new int[evenCounter];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        array[newArrayCounter] = arr[i];
        newArrayCounter++;
      }
    }
    return array;
  }

  public int[] removeValue(int[] arr, int number) {
    int sameNumberCounter = 0;
    for (int i = 0; i < arr.length; i++) {
      if (number == arr[i]) {
        sameNumberCounter++;
      }
    }
    
    int[] array = new int[arr.length - sameNumberCounter];
    for (int i = 0; i < array.length; i++) {
      if (arr[i] != number) {
        array[i] = arr[i];
      }
    }
    return array;
  }

  public void printValues(int[] arr) {
    for (int i = 0; i < (arr.length); i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public int findSecondMax(int[] arr) {
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        secondMax = max;
        max = arr[i];
      } else if (arr[i] > secondMax && arr[i] != max) {
        secondMax = arr[i];
      }
    }
    return secondMax;
  }
  
}
