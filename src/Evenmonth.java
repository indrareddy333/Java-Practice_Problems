public class Evenmonth {
    //Kunal is allowed to go out with his friends only on the even days of a given month.
    // Write a program to count the number of days he can go out in the month of August.
    public static void main(String[] args){
        System.out.println("Kunal went out no. of days is "+"\""+monthOut(31)+"\"");
    }
    public static int monthOut(int MonthDays){
        int count = 0;
        for(int i = 1; i<=MonthDays;i++){
            if(i%2==0){
                count++;
            }
        }
        return count;
    }
}
