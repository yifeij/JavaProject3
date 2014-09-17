/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package functiont;

/**
 *
 * @author Yifei
 */
public class iterative {
    public int IterativeFunction(int n){
        int t_n = 0;
        int t_n_2 = 3;
        int t_n_1 = 5;
        
        if (n==0){
                t_n=t_n_2;  
            }
            else if (n==1){
                t_n=t_n_1;
            }
            else if (n>=2){
                for (int i=2; i<=n; i++) {
                    t_n = t_n_1 + 5*t_n_2 + (i+3);
                    t_n_2=t_n_1;
                    t_n_1=t_n;
                }
            }
        return t_n;
    }
}
