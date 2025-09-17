/**
 * MIT 6.092: Introduction to Programming in Java
 * Demonstrates basic Java concepts including:
 * - Variables and data types
 * - Methods
 * - Control structures (if/else, loops)
 * - Arrays
 */
public class JavaBasics {
    
    public static void main(String[] args) {
        System.out.println("=== MIT 6.092 Java Basics Demo ===\n");
        
        // Demonstrate variables and data types
        demonstrateVariables();
        
        // Demonstrate methods
        System.out.println("Method example:");
        int result = addNumbers(5, 3);
        System.out.println("5 + 3 = " + result + "\n");
        
        // Demonstrate control structures
        demonstrateControlStructures();
        
        // Demonstrate arrays
        demonstrateArrays();
    }
    
    /**
     * Demonstrates basic variable types and operations
     */
    public static void demonstrateVariables() {
        System.out.println("Variable types:");
        
        // Primitive types
        int age = 20;
        double gpa = 3.75;
        boolean isStudent = true;
        char grade = 'A';
        String name = "MIT Student";
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Grade: " + grade + "\n");
    }
    
    /**
     * Simple method that adds two numbers
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public static int addNumbers(int a, int b) {
        return a + b;
    }
    
    /**
     * Demonstrates if/else statements and loops
     */
    public static void demonstrateControlStructures() {
        System.out.println("Control structures:");
        
        // If/else example
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        
        // For loop example
        System.out.print("Counting: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
    
    /**
     * Demonstrates array creation and manipulation
     */
    public static void demonstrateArrays() {
        System.out.println("Array example:");
        
        // Create and initialize array
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.print("Array contents: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Calculate sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array: " + sum);
        System.out.println("Average: " + (double)sum / numbers.length);
    }
}