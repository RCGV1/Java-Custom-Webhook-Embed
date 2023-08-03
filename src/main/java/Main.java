public class Main {
    public static void main(String[] args) {

        /*
        Replace the Values Bellow
         */

        String webhookURL = "URL";
        String mainText = "TEXT_HERE";
        String titleText = "TITLE_HERE";
        String imageUrl = "IMAGE_URL";
        WebHooks.sendWebHook(webhookURL,mainText,titleText,imageUrl);
    }
}
