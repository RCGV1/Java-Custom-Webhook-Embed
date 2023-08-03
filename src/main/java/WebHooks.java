import club.minnced.discord.webhook.WebhookClient;
import club.minnced.discord.webhook.WebhookClientBuilder;
import club.minnced.discord.webhook.send.WebhookEmbed;
import club.minnced.discord.webhook.send.WebhookEmbedBuilder;

import java.awt.*;

public class WebHooks {

    public static void sendWebHook(String url, String messageContent,String titleText,String imageUrl) {
        try {
            WebhookClient client = WebhookClient.withUrl(url);
            WebhookEmbed.EmbedTitle title = new WebhookEmbed.EmbedTitle(titleText, null);


            WebhookEmbed embed = new WebhookEmbedBuilder()
                    .setTitle(title)
                    .setColor(0x800080) // Change color here
                    .setDescription(messageContent)
                    .setImageUrl(imageUrl)
                    .build();

            client.send(embed);
            client.close();


        } catch (Exception e) {
            System.err.println("Failed to send webhook: " + e.getMessage());
        }
    }


}
