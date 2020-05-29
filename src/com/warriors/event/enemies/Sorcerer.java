package com.warriors.event.enemies;

import com.warriors.event.Event;
import com.warriors.characters.Hero;

public class Sorcerer extends Enemy implements Event {

    public Sorcerer(){
        super(9,2);
    }

    public String toString(){
        return "A Sorcerer !";
    }

    @Override
    public void interact(Hero h) {
        System.out.println("*** Hey sorcerer. Brint it on ! ***");
        System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                "MMMMMMMMMMMMds+:--------:+sdNMMMMMMMMMMM\n" +
                "MMMMMMMMms:-+sdNMMMMMMMMNdy+--omMMMMMMMM\n" +
                "MMMMMMh:` /mMMMMMMMMMMMMMMMMm+ `-yMMMMMM\n" +
                "MMMMd--hN``--sNMMMMMMMMMMNy:..`md:.hMMMM\n" +
                "MMM+`yMMMy hd+./hMMMMMMh/.+dd sMMMh`/MMM\n" +
                "MM:.mMMMMM:.NMMh/.+dd+./hMMM--MMMMMm--NM\n" +
                "M+`mMMMMMMN`+MMMMm-  .dMMMMo mMMMMMMN.:M\n" +
                "d yMMMMMMMMy dNy:.omNs--sNm oMMMMMMMMh h\n" +
                "/`MMMMMMMMMM.`.+dMMMMMMm+.``NMMMMMMMMM-:\n" +
                ".:MMMMMMMd+./`oMMMMMMMMMMs /.+dMMMMMMM/`\n" +
                ".:MMMMmo.:yNMs dMMMMMMMMm`oMNy:.omMMMM/`\n" +
                "/`MNy:.omMMMMM--MMMMMMMM:.MMMMMNs--sNM.:\n" +
                "d -` :++++++++: /++++++/ :++++++++:  : h\n" +
                "M+ yddddddddddd+ yddddy /dddddddddddy`/M\n" +
                "MM/.mMMMMMMMMMMM.-MMMM/.NMMMMMMMMMMm.:NM\n" +
                "MMMo`sMMMMMMMMMMd sMMy hMMMMMMMMMMy`+MMM\n" +
                "MMMMd--hMMMMMMMMM+`mN`/MMMMMMMMMh--hMMMM\n" +
                "MMMMMMh:.omMMMMMMN.:/`NMMMMMMms.:hMMMMMM\n" +
                "MMMMMMMMNs:./shmMMh  yMMNds/.:smMMMMMMMM\n" +
                "MMMMMMMMMMMMdy+/---``---:+sdMMMMMMMMMMMM\n" +
                "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n");
    }




}
