package Practice_java;

public class How_to_reverse_sentence_word_by_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to BeginnersBook";
		//String[] words = str.split(" ");
		String[] words = str.split(" ");

		
		String outputString ="";

		//Step 5 : Starting from last word of words array, append each word to outputString.

		for (int i = words.length-1;i>=0;i--)
		{
		        outputString = outputString + words[i] +" ";
		}
		System.out.println(outputString);
	   }
		
	}


