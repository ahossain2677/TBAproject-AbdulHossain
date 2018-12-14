
public class Adventure1 {

        public static void main( String[] args ){

            System.out.println (" Welcome to my tiny adventure ");
            System.out.println (" ");
            System.out.println ("You have 4 different stats that will come into play for certain scenarios, they are Speed,Intelligence,Health and Strength");
            System.out.println (" ");
            System.out.println ("Based on certain choices you can lose or gain certain stat points");

            System.out.println ("ADVENTURE START");
            System.out.println (" you are inside a house with the lights turned off , you feel for the light switch and find it");
            if {findKeyword(statement, "turn on") > 0)}
                then
		{
                System.out.println("the light is now on, you can see the entrance of the bathroom 2 steps East, and the entrance to the kitchen 4 steps north);";
		}
                else 
                {
                System.out.println("You can't see in the dark");
                }
                }
                
      if {
      {BarBones.getxLoc()=0 && BareBones.getyLoc()=4}
                 then{
       System.out.println("you are at the entrance of the kitchen, you here scuffling sound from within");
       }
      if {findKeyword(statement, "enter") > 0)}
                then
		{
                System.out.println("turns out there were burgulars in the kitchen(that are armed) in the kitchen and met the bad end of a shotgun, and so you died");
        gameOn = false;
              }
                else 
                {
                System.out.println("");
                }
                }  
                                   
     if {
      {BarBones.getxLoc()=2 && BareBones.getyLoc()=0}
                 then{
       System.out.println("you are at the entrance of the bathroom, there is water coming from underneath the door ");
       }
      if {findKeyword(statement, "enter") > 0)}
                then
		{
                System.out.println("it seems someone left the water running)
                                   }                   
                    
                System.out.println(" there is a window on the farside of the wall parallel to he toilet");
                      
 if {{findKeyword(statement, "through") > 0)}
     then{
             System.out.println ("Congrats you won, because crawling through a window counts as winning here")
                gameOn = false;      
     }}
     }
    }
