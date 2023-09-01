package src2.lrt;
public class LRT {
    public static void main(String[] args) {
        lrtClass method=new lrtClass(); 
        method.stationList();
        int[] journey=method.journey();
        int fare=method.fareCalc(journey);
        System.out.println("\nYour single journey ticket fare is: "+fare);
    }}