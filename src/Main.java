import java.util.*;

public class Main {

    public static void info(){
        Scanner input= new Scanner(System.in).useLocale(Locale.US);
        double sum=0;
        double average=0;
        System.out.println("Please enter the name of student : ");
        String name= input.nextLine();
        System.out.println("Please enter how many grades you want add : ");
        int column= input.nextInt();
    double[][] array= new double [1][column];
    for (int i=0; i<array.length; i++){
        for (int j = 0; j < array[i].length; j++) {
            int c=j+1;
            System.out.println("Please enter student "+name+" grades of column "+c+" :");
           array[0][j]=input.nextDouble();
           sum+=array[0][j];
        }

    }
        average=sum/column;
        System.out.println("The sum for all grades is : "+sum);
        System.out.println("And the average of "+name+" is : "+average);
    }



    public static void main(String[] args) {
        Scanner input= new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Please enter how many students you want to add: ");
        int students=input.nextInt();
        for (int i = 0; i < students; i++) {
            info();
        }

    }


}
