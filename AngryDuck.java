public class AngryDuck extends WaterFowl{

 //constructor
protected AngryDuck(String name, String color){

  super(name, color);
 }


 //peck method

 protected void peck(){
  if (health>0){
   System.out.println(name+" is pecking");
  }

  else
   {System.out.println(name + " is dead");
 }
 }
 
 //protected String toString()
 //{
//return super.toString();
 //}
 }
