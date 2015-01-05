package fr.inria.diversify.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marodrig on 21/12/2014.
 */
/// <summary>
/// This class implements String comparison algorithm
/// based on character pair similarity
/// Source: http://www.catalysoft.com/articles/StrikeAMatch.html
/// </summary>
public class StringSimilarity {
    /// <summary>
    /// Compares the two strings based on letter pair matches
    /// </summary>
    /// <param name="str1"></param>
    /// <param name="str2"></param>
    /// <returns>The percentage match from 0.0 to 1.0 where 1.0 is 100%</returns>
    public static double CompareStrings(String str1, String str2) {
        List<String> pairs1 = WordLetterPairs(str1.toUpperCase());
        List<String> pairs2 = WordLetterPairs(str2.toUpperCase());

        double intersection = 0;
        double union = pairs1.size() + pairs2.size();

        for (int i = 0; i < pairs1.size(); i++) {
            for (int j = 0; j < pairs2.size(); j++) {
                if (pairs1.get(i).equals(pairs2.get(j))) {
                    intersection++;
                    pairs2.remove(j);//Must remove the match to prevent "GGGG" from appearing to match "GG" with 100% success
                    break;
                }
            }
        }

        return (2.0 * intersection) / union;
    }

    /// <summary>
    /// Gets all letter pairs for each
    /// individual word in the String
    /// </summary>
    /// <param name="str"></param>
    /// <returns></returns>
    private static List<String> WordLetterPairs(String str) {
        List<String> AllPairs = new ArrayList<String>();

        // Tokenize the String and put the tokens/words into an array
        String[] Words = str.split("\\s");

        // For each word
        for (int w = 0; w < Words.length; w++) {
            if (!(Words[w] == null || Words[w].equals(""))) {
                // Find the pairs of characters
                String[] PairsInWord = LetterPairs(Words[w]);
                for (int p = 0; p < PairsInWord.length; p++) {
                    AllPairs.add(PairsInWord[p]);
                }
            }
        }

        return AllPairs;
    }

    /// <summary>
    /// Generates an array containing every 
    /// two consecutive letters in the input String
    /// </summary>
    /// <param name="str"></param>
    /// <returns></returns>
    private static String[] LetterPairs(String str) {

        int numPairs = str.length() - 1;

        if ( numPairs == 0 ) return new String[]{str + "€"};

        String[] pairs = new String[numPairs];

        for (int i = 0; i < numPairs; i++) {
            pairs[i] = str.substring(i, i + 2);
        }

        return pairs;
    }
}
