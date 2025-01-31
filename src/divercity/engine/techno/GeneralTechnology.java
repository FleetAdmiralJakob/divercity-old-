// This file is part of DiverCity
// DiverCity is based on MicropolisJ
// Copyright (C) 2014 Arne Roland, Benjamin Kretz, Estela Gretenkord i Berenguer, Fabian Mett, Marvin Becker, Tom Brewe, Tony Schwedek, Ullika Scholz, Vanessa Schreck for DiverCity
//
// DiverCity is free software; you can redistribute it and/or modify
// it under the terms of the GNU GPLv3, with additional terms.
// See the README file, included in this distribution, for details.

package divercity.engine.techno;
import divercity.engine.*;
import divercity.gui.MessagesPane;
import divercity.gui.NotificationPane;


public class GeneralTechnology implements Technology {
    double pointsNeeded;
    double pointsUsed;
    String name;
    String description;
    DiverCityTool buildingNumber;
    public boolean isResearched;
    DiverCityMessage message;
    DiverCity engine;
   

    public GeneralTechnology(DiverCity engine_, double pointsNeeded_, String description_, String name_, DiverCityMessage m){
        pointsNeeded = pointsNeeded_;
        name = name_;
        description = description_;
        message = m;
        engine = engine_;

        pointsUsed = 0;
        isResearched = false;
    }

    public boolean isSame(GeneralTechnology t){
        if(t.getName().equals(this.getName())) return true;
        return false;
    }


    public boolean tryToApply(){
        if(pointsUsed >= pointsNeeded && isResearched == false){

            resetResearchPoints();
            
            if (message != null) {
            	//engine.sendMessage(message);
            	engine.sendMessageAt(message,engine.centerMassX,engine.centerMassY);
            }
            return true;
        }

        // already applied
        return false;
    }

    public double getPointsNeeded(){
        return pointsNeeded;
    }

    public void addResearchPoints(double points){
        this.pointsUsed += points;
    }

    public void resetResearchPoints(){
        this.pointsUsed = 0;

    }


    public String getName(){
        return name;
    }


    public String getDescription(){
        return description;
    }

    public DiverCityTool getTool(){
        return buildingNumber;
    }

    public boolean getIsResearched(){
        this.tryToApply();
        return isResearched;
    }

    public double getPointsUsed(){
        return pointsUsed;
    }



}
