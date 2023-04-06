/*Create an interface called ""Playable"" with a method called ""play"". 
Create two classes called ""Song"" and ""Video"" that implement the Playable interface and 
implement the ""play"" method. Create objects of both the Song and Video classes and call 
their respective ""play"" methods. */
package Strings;

interface Playable       //creating interface
{
	public void play();   //abstract method
}

class Song implements Playable   //class video implements the interface with abstract method
{
	public void play()        //body of abstract method play
	{
		System.out.println("This is play method of class Song");
	}
}

class Video implements Playable       //class implementing the interface
{
	public void play()     //body of play method
	{
		System.out.println("This is play method of class Video");
	}
}

public class ObjectEx {

	public static void main(String[] args) {
		Song s1= new Song();   //object of class song
		s1.play();             //calling play method of Song class 
		Video v1= new Video();    //object of class video
		v1.play();             //calling its respective play method

	}

}
