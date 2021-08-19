package Learn;

public class staticKeyword {
    public static void main(String[] args) {
        Friend f1 = new Friend("fr1");
        Friend f2 = new Friend("fr2");
        Friend f3 = new Friend("fr3");
        Friend.displayFriends();
    }
}

class Friend {
    String name;
    static int numberOfFriends; // can be shared with others objects
    Friend(String name){
        this.name = name;
        ++numberOfFriends;
        displayFriends();
    }
    static void displayFriends(){
        System.out.println("You have " + numberOfFriends + " friends");
    }
};

