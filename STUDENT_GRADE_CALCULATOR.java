// import java.util.Scanner;

// public class subjects{
//     int sum=0;
    
//     public static void inputs(int no){   
//         for(int i=1;i<=no;i++) {
//             System.out.println("MARKS OF SUBJECT "+i);
//             int s=sc.
//         }
        
//     }
// }
// public class Grade{
//          Grade(int sum){
//             switch (sum) {
//                 case :
                    
//                     break;
            
//                 default:
//                     break;
//             }
//         }
// }
import java.util.*;
public class STUDENT_GRADE_CALCULATOR {
    public static void main(String[] args) {
        int sum=0;
        int avg=0;
        System.out.println("ENTER THE NUMBER OF SUBJECTS");
        Scanner sc=new Scanner(System.in);
        int no_sub=sc.nextInt();
        for(int i=1;i<=no_sub;i++) {
            System.out.println("MARKS OF SUBJECT "+i);
            int s=sc.nextInt();
            if(s >100){
                System.out.println("Please enter a valid marks");
                i--;
                continue;
            }
            sum+=s;
            // count++;
        }
        avg=sum/no_sub;
        System.out.println("TOTAL MARKS = "+sum);
        System.out.println("AVERAGE MARKS ="+avg);
        if(avg>90){
            System.out.println("Grade : A");
        }
        else if(avg>80 && avg<=90){
            System.out.println("Grade : B");
        }
        else if(avg>=65 && avg<=80){
            System.out.println("Grade : C");
        }
        else if(avg>=45 && avg<65){
            System.out.println("Grade : D");
        }          
        else{
            System.out.println("Grade : F");
        }

    }

    
}
