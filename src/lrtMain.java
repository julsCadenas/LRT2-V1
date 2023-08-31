import java.util.Scanner;
public class lrtMain {    

    Scanner in=new Scanner(System.in);
    String stationArray[]={"Recto","Legarda","Pureza","V. Mapa","J. Ruiz","Gilmore","Betty Go","Cubao","Anonas","Katipunan","Santolan","Marikina","Antipolo"};
    int origin=0,destination=0;
            
    void stationList(){
        for(int x=0;x<13;x++){
            System.out.println("["+(x+1)+"] "+stationArray[x]);
        }
    }
    
    int[]  originANDdesintation(){
        int[] journey=new int[2];

        System.out.print("\nEnter your station of origin: ");
        origin=in.nextInt();
        journey[0]=origin;
        System.out.println("You are in "+stationArray[origin]+" Station");
        
        System.out.print("\nEnter your destination: ");
        destination=in.nextInt();
        journey[1]=destination;
        System.out.println("You are going to "+stationArray[destination-1]+" Station");
        
        return journey;
    }
    
    int fareCalc(int[] journey){
        int distance=(journey[1]-journey[0]);
        int realDistance=Math.abs(distance);
        if(realDistance>=1 && realDistance<=3){
            return 15;
        }else if(realDistance>=4 && realDistance<=7){
            return 20;
        }else if(realDistance>=8 && realDistance<=10){
            return 25;
        }else{
            return 30;
        }
    }
    public static void main(String[] args) throws Exception {

        lrtMain method=new lrtMain();
        //stations list
        method.stationList();
        
        //choose station
        int[] journey=method.originANDdesintation();
        
        //calculate and print fare
        int fare=method.fareCalc(journey);
        System.out.println("\nPlease pay: "+fare);
    }
}
