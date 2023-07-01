import java.util.ArrayList;

/*
    @author Kakaye
 */
public class Driver {
    
    public static void main (String[] args) {

		int hashTableSize = 20;
        double threshold = 8;
        String inputFile = "data.txt";
//        String inputFile = "dataSample.txt";
        String noiseWordsFile = "noisewords.txt";
        
        RUMDbSearchEngine rudb = new RUMDbSearchEngine(hashTableSize, threshold, noiseWordsFile);
		rudb.insertMoviesIntoHashTable(inputFile);
//        rudb.print();


        String word1 = "two";
//        String word2 = "man";
        String word2 = "men";

        ArrayList<MovieSearchResult> als = rudb.topTenSearch(word1, word2);
	
        if ( als != null && als.size() > 0 ) {
            
//            StdOut.println("The shortest distance between " + word1 + " and " + word2 + " is located at:");
            StdOut.println("Search Results");

            int counter = 1;
            for ( MovieSearchResult s : als ) {
//                System.out.println(s.getTitle()+"\t["+s.getMinDistance()+"]");
                System.out.println(counter + ". " + s.getTitle());
                counter++;
            }
        } else {
            StdOut.println("There are no movies with the words " + word1 + " and " + word2 + " at their description.");
        }
	}
}
