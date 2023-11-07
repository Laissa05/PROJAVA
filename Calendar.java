 public class Calendar {
    public static void main( String args[]){
        //This program prints the of November 2023
        System.out.println("\nCalendar of 2023");
        System.out.println("\nMonth: November\n***************");//The month of the year
        System.out.println( "Mon\tTue\tWed\tThur\tFrid\tSat\tSun");//The seven days of the month
        for(int i=1;i<=30;i++){
            if(i==1){
                System.out.print("\t\t" + i +"\t");
            }
            else{
                System.out.print(i + "\t");
            }
            if(i == 5 || i == 12 || i == 19 || i == 26){
                System.out.println(" ");
            }
        }
        System.out.println("\n");

    }



    
}
