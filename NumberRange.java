
package number.range;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.*;
import java.nio.file.Paths;


public class NumberRange {
    
    
    
    public static void main(String[] args) throws IOException {
        
     
        Scanner sc = new Scanner(Paths.get("lab1b_input.txt"),"UTF-8");
        while (sc.hasNext()){


     
        int i;
        int scoreOne = 0, scoreTwo = 0, scoreThree = 0, scoreFour = 0, scoreFive = 0, scoreSix = 0, scoreSeven = 0, scoreEight = 0;

                
        for (int num = sc.nextInt(); sc.hasNext(); num = sc.nextInt()) 
        {  
        if (num <= 24) {
            scoreOne++;
            }
        
        else if (num >= 25 && num <= 49) {
                scoreTwo++;
            }
        
        else if (num >= 50 && num <= 74) {
                scoreThree++;
            }
        
        else if (num >= 75 && num <= 99) {
                scoreFour++;
            }
       
        else if (num >= 100 && num <= 124) {
                scoreFive++;
            }
        
        else if (num >= 125 && num <= 149) {
                scoreSix++;
            }
        
        else if (num >= 150 && num <= 174) {
                scoreSeven++;
            }
        
        else if (num >= 175 && num <=200) {
                scoreEight++;
                }
        } 
        
    System.out.print("Results: " + ('\n')); 
    System.out.print(('\n'));
    System.out.print("[0 - 24]: " + scoreOne + ('\n'));
    System.out.print("[25 - 49]: " + scoreTwo + ('\n'));
    System.out.print("[50 - 74]: " + scoreThree + ('\n'));
    System.out.print("[75 - 99]: " + scoreFour + ('\n'));
    System.out.print("[100 - 124]: " + scoreFive + ('\n'));
    System.out.print("[125 - 149]: " + scoreSix + ('\n'));
    System.out.print("[150 - 174]: " + scoreSeven + ('\n'));
    System.out.print("[175 - 200]: " + scoreEight + ('\n'));
    System.out.print(('\n'));
     
        }
    }

       
    }
  
        



