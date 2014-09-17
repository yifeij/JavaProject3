/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package functiont;

import java.util.Scanner;

/**
 *
 * @author Yifei
 */
public class FunctionT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Input n:");
        int n = input.nextInt();
        recursive Newrecursive = new recursive();
        System.out.println(Newrecursive.RecursiveFunction(n));
        iterative Newiterative = new iterative();
        System.out.println(Newiterative.IterativeFunction(n));
    }
    
}
