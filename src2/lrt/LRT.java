package src2.lrt;
public class LRT {
    public static void main(String[] args) {
        //initialize
        lrtClass method=new lrtClass(); 
        //print the list
        method.stationList();
        //determine the journey
        int[] journey=method.journey();
        //calculate and print the fare
        int fare=method.fareCalc(journey);
        System.out.println("\nYour single journey ticket fare is: "+fare);
    }}