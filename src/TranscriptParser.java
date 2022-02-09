import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TranscriptParser {
    public static void main(String[] args) {
        String transcript = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                                
                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46
                """;
        String regex = """
                Student\\sNumber:\\s(?<studentNumber>\\d{10}).* # Grab student number
                Grade:\\s+(?<grade>\\d{1,2}).* # Grab grade
                Birthdate:\\s+(?<birthMonth>\\d{1,2})/(?<birthDay>\\d{1,2})/(?<birthYear>\\d{4}).* # Grab birthdate
                Gender:\\s+(?<gender>\\w+)\\b.* # Grab gender
                State\\sID:\\s+(?<stateID>\\d{10}).* # Grab State ID
                \\s+\\b.*
                Weighted\\)\\s+(?<weightedGPA>[\\d\\.]+).* # Grab the weighted GPA
                Unweighted\\)\\s+(?<unweightedGPA>[\\d\\.]+).* # Grab the unweighted GPA
                """;
        Pattern pat = Pattern.compile(regex, Pattern.DOTALL | Pattern.COMMENTS);
        Matcher mat = pat.matcher(transcript);
        if(mat.matches()) {
            System.out.format("Student Number: %s\n", mat.group("studentNumber"));
            System.out.format("Grade: %s\n", mat.group("grade"));
            System.out.format("Birthdate: %s/", mat.group("birthMonth"));
            System.out.format("%s/", mat.group("birthDay"));
            System.out.format("%s\n", mat.group("birthYear"));
            System.out.format("Gender: %s\n", mat.group("gender"));
            System.out.format("State ID: %s\n", mat.group("stateID"));
            System.out.format("Cumulative GPA (Weighted): %s\n", mat.group("weightedGPA"));
            System.out.format("Cumulative GPA (Unweighted): %s\n", mat.group("unweightedGPA"));
        }
    }
}