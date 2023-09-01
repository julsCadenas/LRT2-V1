package src2.lrt;
import java.util.HashMap;
import java.util.Scanner;
public class lrtClass {
    Scanner in=new Scanner(System.in);
    String[] lrtStations={"Recto","Legarda","Pureza","V. Mapa","J. Ruiz","Gilmore","Betty Go","Cubao","Anonas","Katipunan","Santolan","Marikina","Antipolo"};
    int[] journey=new int[2];
    int origin=0,destination=0;
    
    //PRINTS THE STATIONS
    void stationList(){
        System.out.println("LRT 2 STATIONS:");
        for(int x=0;x<13;x++){
            System.out.println("["+(x+1)+"] "+lrtStations[x]);
        }
    }
    
    //CALCULATES WHERE YOU ARE AND WHERE YOU ARE GOING
    int[] journey(){
        System.out.print("\nWhich station are you in right now: ");
        origin=in.nextInt();
        origin-=1;
        journey[0]=origin;
        System.out.println("You are in "+(lrtStations[origin])+"\n");
        System.out.print("\nChoose your destination: ");
        destination=in.nextInt();
        destination-=1;
        journey[1]=destination;
        System.out.println("You are going to "+(lrtStations[destination])+"\n");
        return journey;
    }
        
        //CALCULATES YOUR FARE
        int fareCalc(int[] journey) {
            
            HashMap<String, Integer>fareTable=new HashMap<>();
                //RECTO COMBINATIONS
                fareTable.put("Recto-Legarda", 15);
                fareTable.put("Recto-Pureza", 20);
                fareTable.put("Recto-V. Mapa", 20);
                fareTable.put("Recto-J. Ruiz", 20);
                fareTable.put("Recto-Gilmore", 25);
                fareTable.put("Recto-Betty Go", 25);
                fareTable.put("Recto-Cubao", 25);
                fareTable.put("Recto-Anonas", 25);
                fareTable.put("Recto-Katipunan", 30);
                fareTable.put("Recto-Santolan", 30);
                fareTable.put("Recto-Marikina", 35);
                fareTable.put("Recto-Antipolo", 35);
                //LEGARDA COMBINATIONS
                fareTable.put("Legarda-Recto", 15);
                fareTable.put("Legarda-Purzeza", 15);
                fareTable.put("Legarda-V. Mapa", 20);
                fareTable.put("Legarda-J. Ruiz", 20);
                fareTable.put("Legarda-Gilmore", 20);
                fareTable.put("Legarda-Betty Go", 25);
                fareTable.put("Legarda-Cubao", 25);
                fareTable.put("Legarda-Anonas", 25);
                fareTable.put("Legarda-Katipunan", 25);
                fareTable.put("Legarda-Santolan", 30);
                fareTable.put("Legarda-Marikina", 30);
                fareTable.put("Legarda-Antipolo", 35);
                //PUREZA COMBINATIONS
                fareTable.put("Pureza-Recto", 20);
                fareTable.put("Pureza-Legarda", 15);
                fareTable.put("Pureza-V. Mapa", 15);
                fareTable.put("Pureza-J .Ruiz", 20);
                fareTable.put("Pureza-Gilmore", 20);
                fareTable.put("Pureza-Betty Go", 20);
                fareTable.put("Pureza-Cubao", 20);
                fareTable.put("Pureza-Anonas", 25);
                fareTable.put("Pureza-Katipunan", 25);
                fareTable.put("Pureza-Santolan", 30);
                fareTable.put("Pureza-Marikina", 30);
                fareTable.put("Pureza-Antipolo", 30);
                //V. MAPA COMBINATIONS
                fareTable.put("V. Mapa-Recto", 20);
                fareTable.put("V. Mapa-Legarda", 20);
                fareTable.put("V. Mapa-Pureza", 15);
                fareTable.put("V. Mapa-J. Ruiz", 15);
                fareTable.put("V. Mapa-Gilmore", 20);
                fareTable.put("V. Mapa-Betty Go", 20);
                fareTable.put("V. Mapa-Cubao", 20);
                fareTable.put("V. Mapa-Anonas", 20);
                fareTable.put("V. Mapa-Katipunan", 25);
                fareTable.put("V. Mapa-Santolan", 25);
                fareTable.put("V. Mapa-Marikina", 30);
                fareTable.put("V. Mapa-Antipolo", 30);
                //J. RUIZ COMBINATIONS
                fareTable.put("J. Ruiz-Recto", 20);                
                fareTable.put("J. Ruiz-Legarda", 20);                
                fareTable.put("J. Ruiz-Pureza", 20);                
                fareTable.put("J. Ruiz-V. Mapa", 15);                
                fareTable.put("J. Ruiz-Gilmore", 15);                
                fareTable.put("J. Ruiz-Betty Go", 20);                
                fareTable.put("J. Ruiz-Cubao", 20);                
                fareTable.put("J. Ruiz-Anonas", 20);                
                fareTable.put("J. Ruiz-Katipunan", 20);                
                fareTable.put("J. Ruiz-Santolan", 25);                
                fareTable.put("J. Ruiz-Marikina", 25);                
                fareTable.put("J. Ruiz-Antipolo", 30);                
                //GILMORE COMBINATIONS
                fareTable.put("Gilmore-Recto", 25);                  
                fareTable.put("Gilmore-Legarda", 20);                  
                fareTable.put("Gilmore-Pureza", 20);                  
                fareTable.put("Gilmore-V. Mapa", 20);                  
                fareTable.put("Gilmore-J. Ruiz", 15);                  
                fareTable.put("Gilmore-Betty Go", 15);                  
                fareTable.put("Gilmore-Cubao", 20);                  
                fareTable.put("Gilmore-Anonas", 20);                  
                fareTable.put("Gilmore-Katipunan", 20);                  
                fareTable.put("Gilmore-Santolan", 25);                  
                fareTable.put("Gilmore-Marikina", 25);                  
                fareTable.put("Gilmore-Antipolo", 30); 
                //BETTY GO COMBINATIONS
                fareTable.put("Betty Go-Recto", 25); 
                fareTable.put("Betty Go-Legarda", 25); 
                fareTable.put("Betty Go-Pureza", 20); 
                fareTable.put("Betty Go-V Mapa", 20); 
                fareTable.put("Betty Go-J. Ruiz", 20); 
                fareTable.put("Betty Go-Gilmore", 15); 
                fareTable.put("Betty Go-Cubao", 15); 
                fareTable.put("Betty Go-Anonas", 20); 
                fareTable.put("Betty Go-Katipunan", 20); 
                fareTable.put("Betty Go-Santolan", 20); 
                fareTable.put("Betty Go-Marikina", 25); 
                fareTable.put("Betty Go-Antipolo", 25);
                //CUBAO COMBINATIONS
                fareTable.put("Cubao-Recto", 25); 
                fareTable.put("Cubao-Legarda", 25); 
                fareTable.put("Cubao-Pureza", 20); 
                fareTable.put("Cubao-V. Mapa", 20); 
                fareTable.put("Cubao-J. Ruiz", 20); 
                fareTable.put("Cubao-Gilmore", 20); 
                fareTable.put("Cubao-Betty Go", 15); 
                fareTable.put("Cubao-Anonas", 15); 
                fareTable.put("Cubao-Katipunan", 20); 
                fareTable.put("Cubao-Santolan", 20); 
                fareTable.put("Cubao-Marikina", 25); 
                fareTable.put("Cubao-Antipolo", 25);
                //ANONAS COMBINATIONS
                fareTable.put("Anonas-Recto", 25); 
                fareTable.put("Anonas-Legarda", 25); 
                fareTable.put("Anonas-Pureza", 25); 
                fareTable.put("Anonas-V. Mapa", 20); 
                fareTable.put("Anonas-J. Ruiz", 20); 
                fareTable.put("Anonas-Gilmore", 20); 
                fareTable.put("Anonas-Betty Go", 20); 
                fareTable.put("Anonas-Cubao", 15); 
                fareTable.put("Anonas-Katipunan", 15); 
                fareTable.put("Anonas-Santolan", 20); 
                fareTable.put("Anonas-Marikina", 20); 
                fareTable.put("Anonas-Antipolo", 25); 
                //KATIPUNAN COMBINATIONS
                fareTable.put("Katipunan-Recto", 30); 
                fareTable.put("Katipunan-Legarda", 25); 
                fareTable.put("Katipunan-Pureza", 25); 
                fareTable.put("Katipunan-V. Mapa", 25); 
                fareTable.put("Katipunan-J. Ruiz", 20); 
                fareTable.put("Katipunan-Gilmore", 20); 
                fareTable.put("Katipunan-Betty Go", 20); 
                fareTable.put("Katipunan-Cubao", 20); 
                fareTable.put("Katipunan-Anonas", 15); 
                fareTable.put("Katipunan-Santolan", 20); 
                fareTable.put("Katipunan-Marikina", 20); 
                fareTable.put("Katipunan-Antipolo", 25); 
                //SANTOLAN COMBINATIONS
                fareTable.put("Santolan-Recto", 30); 
                fareTable.put("Santolan-Legarda", 30); 
                fareTable.put("Santolan-Pureza", 30); 
                fareTable.put("Santolan-V. Mapa", 25); 
                fareTable.put("Santolan-J. Ruiz", 25); 
                fareTable.put("Santolan-Gilmore", 25); 
                fareTable.put("Santolan-Betty Go", 20); 
                fareTable.put("Santolan-Cubao", 20); 
                fareTable.put("Santolan-Anonas", 20); 
                fareTable.put("Santolan-Katipunan", 20); 
                fareTable.put("Santolan-Marikina", 15); 
                fareTable.put("Santolan-Antipolo", 20); 
                //MARIKINA COMBINATIONS
                fareTable.put("Marikina-Recto", 35); 
                fareTable.put("Marikina-Legarda", 30); 
                fareTable.put("Marikina-Pureza", 30); 
                fareTable.put("Marikina-V. Mapa", 30); 
                fareTable.put("Marikina-J. Ruiz", 25); 
                fareTable.put("Marikina-Gilmore", 25); 
                fareTable.put("Marikina-Betty Go", 25); 
                fareTable.put("Marikina-Cubao", 25); 
                fareTable.put("Marikina-Anonas", 20); 
                fareTable.put("Marikina-Katipunan", 20); 
                fareTable.put("Marikina-Santolan", 15); 
                fareTable.put("Marikina-Antipolo", 20); 
                //ANTIPOLO COMBINATIOSN
                fareTable.put("Antipolo-Recto", 35); 
                fareTable.put("Antipolo-Legarda", 35); 
                fareTable.put("Antipolo-Pureza", 30); 
                fareTable.put("Antipolo-V. Mapa", 30); 
                fareTable.put("Antipolo-J. Ruiz", 30); 
                fareTable.put("Antipolo-Gilmore", 30); 
                fareTable.put("Antipolo-Betty Go", 25); 
                fareTable.put("Antipolo-Cubao", 25); 
                fareTable.put("Antipolo-Anonas", 25); 
                fareTable.put("Antipolo-Katipunan", 25); 
                fareTable.put("Antipolo-Santolan", 20); 
                fareTable.put("Antipolo-Marikina", 20);
                //DEFAULT
                fareTable.put("other", -1); 
            
            //DETERMINES REVERSE COMBINATIOSN (EX: ANTIPOLO-MARIKINA && MARIKINA-ANTIPOLO
            String stationPair=lrtStations[origin]+"-"+lrtStations[destination];
            String reverseStationPair=lrtStations[destination]+"-"+lrtStations[origin];
            if(fareTable.containsKey(stationPair)){
                return fareTable.get(stationPair);
            }else if(fareTable.containsKey(reverseStationPair)){
                return fareTable.get(reverseStationPair);
            }else{
                return fareTable.get("other");
            }
            
    }
    
}

