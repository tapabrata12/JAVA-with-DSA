
/*

Data Type	Size	Description
byte	1 byte	Stores whole numbers from -128 to 127
short	2 bytes	Stores whole numbers from -32,768 to 32,767
int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	1 bit	Stores true or false values
char	2 bytes	Stores a single character/letter or ASCII values

Reference: https://www.w3schools.com/java/java_data_types.asp
 */

package com.Basic_Concepts;

public class Primitive {
   public static void main(String[] args){
        // Primitive data types
       int a = 6;
       System.out.println(a);
       // float b = 4.5; (In Java, by default, 4.5 is of type “double” (64 bits), not “float” (32 bits). Therefore, “float f = 4.5”, if allowed, would result in a loss of precision due to half of the bits being removed. Hence Java forces you to indicate that you really do want that loss of precision, to ensure that you aren’t just being absent-minded about it.)
       float b = 4.5f;
       System.out.println(b);
       char c = 'T';
       System.out.println(c);
       double d = 5465.65465654;
       System.out.println(d);
       long e = 5616565546565L; // In default all integers are set to int, With L (or l) you tell Java that this literal is a long and not an int in the first place. Which also gets rid of the unnecessary conversion
       System.out.println(e);
       boolean f = true; // Only returns true or false
       System.out.println(f);
       boolean g = false;
       System.out.println(g);
       byte h = 127; // saving memory in large arrays, where the memory savings actually matters.
       System.out.println(h);
       short i = 10000;
       System.out.println(i);

       // We will also discuss literals and identifier
       int j = 10; // In the primitive data type the reference variable is called identifier and the value assigned is called literal. Identifier can also be the name of class, method, packages.
       // Reference: https://www.javatpoint.com/identifiers-in-java
       // Reference: https://www.geeksforgeeks.org/literals-in-java/
       // We will also write big numbers in a different method
//       int k = 250,000,233; ( Wrong approach )
       int k = 250_000_233;  // Correct approach
       System.out.println(k);
   }
}
