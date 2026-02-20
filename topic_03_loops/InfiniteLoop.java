/*
 * Syntax of infinite loops (this code won't run because the first loop is an
 * infinite loop. That's why the rest of the code is unreachable. so I commented
 * out the whole code.)
 * 
 * public class InfiniteLoop {
 * public static void main(String[] args) {
 * // infinite for loop
 * System.out.println("infinite for loop:");
 * // only hello world
 * for ( ; ; ) {
 * System.out.println("Hello World");
 * }
 * // hello world with numbers
 * for (int i = 1; ;i++) {
 * System.out.println(i + ". Hello World");
 * }
 * 
 * // infinite while loop
 * System.out.println("infinite while loop:");
 * // only hello world
 * while (true) {
 * System.out.println("Hello World");
 * }
 * // hello world with numbers
 * int i = 1;
 * while (true) {
 * System.out.println(i + ". Hello World");
 * i++;
 * }
 * 
 * // infinite do while loop
 * System.out.println("infinite do while loop:");
 * // only hello world
 * do {
 * System.out.println("Hello World");
 * } while (true);
 * // hello world with numbers
 * int j = 1;
 * do {
 * System.out.println(j + ". Hello World");
 * j++;
 * } while (true);
 * 
 * // another way (it works because the starting condition is (at initial state)
 * greater than the stopping condition)
 * 
 * // for loop
 * for (int i = 7; i > 0; i++) {
 * System.out.println("Hello World");
 * }
 * 
 * // whole loop
 * int i = 6;
 * while (i > 5) {
 * System.out.print("Jarin ");
 * i++;
 * }
 * 
 * // do while loop
 * int j = 9;
 * do {
 * System.out.print("Jarin ");
 * j++;
 * } while (j > 6);
 * }
 * }
 */
