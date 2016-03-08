/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytreelab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author it.student
 */
public class ReadFile {
     private Scanner input;
    public void openFile()
    {
        try
        {
            input = new Scanner(new File("data.txt"));
        } // end try
        catch(FileNotFoundException FNFE)
        {
            System.err.println("Error opening file.");
            System.exit(1);
        }// end catch
        
        
    }
    
}
