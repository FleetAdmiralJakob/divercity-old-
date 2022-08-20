package divercity.engine.techno;
import divercity.engine.*;

public class BuildingTechnology extends GeneralTechnology {
    DiverCityTool tool_;

     public BuildingTechnology(DiverCity engine_, double pointsNeeded_, String description_, String name_, DiverCityTool tool_, DiverCityMessage m){
        super(engine_, pointsNeeded_, description_, name_,m);
        this.tool_ = tool_;
    }
    @Override
    public boolean tryToApply(){
        if(super.tryToApply() == true){
            // reset building tech. can't be researched again
            this.isResearched = true;
            if(engine.selectedInfraTech.isSame(this)){
                engine.selectedInfraTech = null;
            } else {
               engine.selectedEETech = null;
            }
            return true;
        }
        return false;
    }


    public DiverCityTool getTool(){
        return tool_;
    }






}
