/*
  * To build a divider by using subtraction 
*/

class IntDivider {
  public int divide(int dividend, int divisor) {

    // checks for boundaries numbers 
    if (dividend >= Integer.MAX_VALUE) {
      return Integer.MIN_VALUE / divisor;
    }

    if (dividend <= Integer.MIN_VALUE) {
      return Integer.MIN_VALUE / divisor;
    }

    boolean neg = false;
    // iterator
    int i = 1;

    // simulates division by subtraction without using multipliers or dividing on its own
    if (dividend < 0 && divisor > 0) {
      dividend *= -1;
      neg = true;
    } else if (dividend > 0 && divisor < 0) {
      divisor *= -1;
      neg = true;
    } else if (dividend < 0 && divisor < 0) {
      dividend *= -1;
      divisor *= -1;
    }

    if (dividend < divisor)
      return 0;

    while (dividend > 0 && dividend - divisor > divisor) {
      dividend -= divisor;
      ++i;
    }

    // handles the negative values
    if (neg) {
      return i * -1;
    } else
      return i;
  }

  public static void main(String[] args) {
    System.out.println(divide(2147483648, 1));
    System.out.println(divide(10, -3));
  }
}