package com.company;

public class BoxingMatch {

    Fighter fighter1;
    Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String fight(){
        if(fighter1.getHealth() <=0 || fighter2.getHealth() <=0 ){
            String winner = (fighter1.getHealth() >= fighter2.getHealth()? fighter1.getName():fighter2.getName());
            return winner;
        }else{
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
        }
        return fight();
    }

    void letThemAttack(){

    }

}
