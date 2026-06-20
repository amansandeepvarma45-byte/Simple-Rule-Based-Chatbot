 import java.util.*;

public class RuleBasedChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();

        System.out.println("=== Simple Rule-Based Chatbot ===");
        System.out.println("Type 'exit' to quit.\n");

        while (true) {

            System.out.print("You: ");
            String input = sc.nextLine().trim().toLowerCase();

            history.add("User: " + input);

            if (input.equals("exit")) {
                System.out.println("Bot: Goodbye!");
                history.add("Bot: Goodbye!");
                break;
            }

            String response;

            
            if (input.contains("what is cyber security")) {

                response = "Cyber Security is the practice of protecting systems, networks, and data from attacks.";

            } else if (input.contains("what is phishing")) {

                response = "Phishing is a cyber attack where attackers trick users into revealing sensitive information.";

            } else if (input.contains("what is firewall")) {

                response = "A firewall monitors and controls incoming and outgoing network traffic.";

            } else if (input.contains("what is kali linux")) {

                response = "Kali Linux is a Linux distribution used for penetration testing and ethical hacking.";

            }

            
            else if (input.equals("hello") ||
                     input.equals("hi") ||
                     input.equals("hey")) {

                response = "Hello! How can I help you today?";
            }

           
            else if (input.contains("help")) {

                response = "I can answer greetings, small talk, and cybersecurity questions.";
            }

            else if (input.contains("how are you")) {

                response = "I am doing great. Thanks for asking!";
            }

            else if (input.contains("your name")) {

                response = "I am a Rule-Based Chatbot.";
            }

           
            else {

                response = "Sorry, I don't understand that question.";
            }

            System.out.println("Bot: " + response);
            history.add("Bot: " + response);
        }

        System.out.println("\n=== Conversation History ===");

        for (String msg : history) {
            System.out.println(msg);
        }

        sc.close();
    }
}