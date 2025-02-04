// This file is part of DiverCity
// DiverCity is based on MicropolisJ
// Copyright (C) 2014 Arne Roland, Benjamin Kretz, Estela Gretenkord i Berenguer, Fabian Mett, Marvin Becker, Tom Brewe, Tony Schwedek, Ullika Scholz, Vanessa Schreck for DiverCity
//
// DiverCity is free software; you can redistribute it and/or modify
// it under the terms of the GNU GPLv3, with additional terms.
// See the README file, included in this distribution, for details.

package divercity.engine.techno;

import divercity.engine.DiverCity;
import divercity.engine.DiverCityMessage;

public class PoliceUpgradeTech extends GeneralTechnology {
    public PoliceUpgradeTech(DiverCity engine_,double pointsNeeded_, String description_, String name_,DiverCityMessage m){
        super(engine_,pointsNeeded_, description_, name_,m);
    }

    public boolean tryToApply(){
        if(super.tryToApply() == true){

            engine.policesccount +=1;// do some fancy street Upgrade stuff
            System.out.println("police upgrade");
            return true;
        }
        return false;
    }
}
