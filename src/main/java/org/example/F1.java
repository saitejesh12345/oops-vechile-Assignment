package org.example;

public class F1 extends  Car{


//    public F1(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
//        super(name, 4, 2, 6, isManual, "F1-1", 2);
//    }
    public F1(String name,boolean isManual ) {
    super(name, 4, 2, 6, isManual, "F1-1", 2);
    }

    public void  accelerate(int rate){
          //set the value of new speed by using currentSpeed and rate
        int newSpeed = super.getCurrentSpeed() + rate;
      /**
        speed 0 :gear1
        speed 1-50 :gear1
        speed 51-100 :gear2
        speed 101=150 :gear3
        speed 151-200 :gear4
        speed 201-250 :gear5
        speed 251-300 :gear6
       **/
      if(newSpeed == 0){
          super.stop();
          super.changeGear(1);
          //stop the car set gear as 1
      } else if (newSpeed<=50) {
          super.changeGear(1);
          
      } else if (newSpeed<=100) {
          super.changeGear(2);
          
      } else if (newSpeed<=150) {
          super.changeGear(3);
          
      } else if (newSpeed<=200) {
          super.changeGear(4);
          
      } else if (newSpeed<=250) {
          super.changeGear(5);

      }
      else
          super.changeGear(6);

      if(newSpeed>0){
          changeSpeed(newSpeed,getCurrentDirection());
      }

    }

}
