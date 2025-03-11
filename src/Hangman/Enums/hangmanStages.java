package Hangman.Enums;

public enum hangmanStages {
    DEFAULT("""
               _____________
               | \\_______  |
               |        \\| |
                         | |
                         | |
                         | |
                         | |
                         | |
            _____________|_|
            |///////////////|
            |///////////////|
            """),
    HEAD("""
               _____________
               | \\_______  |
               |        \\| |
               O         | |
                         | |
                         | |
                         | |
                         | |
            _____________|_|
            |///////////////|
            |///////////////|
            """),
    BODY("""
               _____________
               | \\_______  |
               |        \\| |
               O         | |
               8         | |
                         | |
                         | |
                         | |
            _____________|_|
            |///////////////|
            |///////////////|
            """),
    LEFT_HAND("""
               _____________
               | \\_______  |
               |        \\| |
               O         | |
              /8         | |
                         | |
                         | |
                         | |
            _____________|_|
            |///////////////|
            |///////////////|
            """),
    RIGHT_HAND("""
               _____________
               | \\_______  |
               |        \\| |
               O         | |
              /8\\        | |
                         | |
                         | |
                         | |
            _____________|_|
            |///////////////|
            |///////////////|
            """),
    LEFT_LEG("""
               _____________
               | \\_______  |
               |        \\| |
               O         | |
              /8\\        | |
              /          | |
                         | |
                         | |
            _____________|_|
            |///////////////|
            |///////////////|
            """),
    RIGHT_LEG("""
               _____________
               | \\_______  |
               |        \\| |
               O         | |
              /8\\        | |
              / \\        | |
                         | |
                         | |
            _____________|_|
            |///////////////|
            |///////////////|
            """);
    private final String state;

    hangmanStages(String state) {
        this.state = state;
    }

    public void printStage(int errors) {
        switch (errors) {
            case 1:
                System.out.println(HEAD.state);
            case 2:
                System.out.println(BODY.state);
            case 3:
                System.out.println(LEFT_HAND.state);
            case 4:
                System.out.println(RIGHT_HAND.state);
            case 5:
                System.out.println(RIGHT_LEG.state);
            case 6:
                System.out.println(LEFT_LEG.state);
            default:
                System.out.println(DEFAULT.state);
        }
    }

    private String getState() {
        return state;
    }
}
