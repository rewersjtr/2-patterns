public class Main {
    public static void main(String[] args) {
        ChatMediator chat = new ChatRoom();

        User alice = new ChatUser("Alice", chat);
        User cat = new ChatUser("Cat", chat);

        chat.addUser(alice);
        chat.addUser(cat);

        alice.send("Stupid Cat");
        cat.send("meow :(");
    }
}
