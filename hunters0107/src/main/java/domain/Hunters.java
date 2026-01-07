package domain;

import java.util.ArrayList;
import java.util.List;

public class Hunters {

    private final List<Hunter> hunters;


    public Hunters(List<Hunter> hunters) {
        this.hunters = hunters;
    }

    public List<String> huntersGo(int num){
        List<String> huntersState = new ArrayList<>();
        for(Hunter hunter : hunters){
            if(hunter.isAlive()) {
                huntersState.add(hunter.go(num));
            }
        }
        return huntersState;
    }

    public int huntersTotalGold(){
        int total = 0 ;
        for(Hunter hunter : hunters){
            if(hunter.isAlive()){
                total+=hunter.getGold();
            }
        }
        return total;
    }

    public List<String> hunterIndividualGold(){
        List<String> individualGold = new ArrayList<>();
        for(Hunter hunter : hunters){
            if(hunter.isAlive()){
                individualGold.add(hunter.totalGold());
            }
        }
        return individualGold;
    }

    public List<String> deadHunters(){
        List<String> dead = new ArrayList<>();
        for(Hunter hunter:hunters){
            if(!hunter.isAlive()){
                dead.add(hunter.getName());
            }
        }
        return dead;
    }
}
