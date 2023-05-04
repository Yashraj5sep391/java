import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PlagiarismChecker {

    public static void main(String[] args) throws IOException {

        // Replace "YOUR_API_KEY" with your actual API key
        String apiKey = "YOUR_API_KEY";

        // Replace "YOUR_TEXT" with the text you want to check for plagiarism
        String text = "YOUR_TEXT";

        // Replace "YOUR_URL" with the URL of the plagiarism checking API
        String apiUrl = "YOUR_URL" + "?apiKey=" + apiKey + "&text=" + text;

        URL url = new URL(apiUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // Print the plagiarism checking API response
        System.out.println(response.toString());
    }
}