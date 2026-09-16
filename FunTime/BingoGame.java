import java.util.*;

/**
 * Console-Based Bingo Game
 *
 * Rules:
 * 1. One human player.
 * 2. Random 5x5 Bingo card.
 * 3. Numbers are from 1 to 25.
 * 4. No FREE center.
 * 5. User enters numbers to mark.
 * 6. A row, column, or diagonal completely marked = 1 BINGO.
 * 7. Player needs 5 completed lines to win.
 * 8. Same line is counted only once.
 */
public class BingoGame {

    private static final int SIZE = 5;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 25;
    private static final int REQUIRED_BINGOS = 5;
    private static final String GREEN = "\u001B[92m";
    private static final String RESET = "\u001B[0m";

    private final Scanner scanner = new Scanner(System.in);
    private final BingoCard card = new BingoCard();

    public static void main(String[] args) {
        BingoGame game = new BingoGame();
        game.startGame();
    }

    /**
     * Starts the Bingo game.
     */
    private void startGame() {

        printWelcomeMessage();

        card.generate();

        System.out.println("\nYour Bingo Card:");
        card.display();

//        System.out.println("\nPress ENTER to start the game...");
//        scanner.nextLine();

        System.out.print("\nType Y to start the game: ");

        String input = scanner.nextLine().trim();

        while (!input.equalsIgnoreCase("Y")) {
            System.out.print("Invalid input. Please type Y to start: ");
            input = scanner.nextLine().trim();
        }

        System.out.println("\nGame Started!");

        playGame();
    }

    /**
     * Main game loop.
     */
    private void playGame() {

        int round = 1;

        while (true) {

            System.out.println("\n========================================");
            System.out.println("              ROUND " + round);
            System.out.println("========================================");

            System.out.println("\nCurrent Bingo Card:");
            card.display();

            System.out.println("\nBingos completed: "
                    + card.getCompletedBingoCount()
                    + " / "
                    + REQUIRED_BINGOS);

            System.out.print("\nEnter a number to mark (1-25): ");

            String input = scanner.nextLine().trim();

            // Validate input.
            if (!isValidNumber(input)) {
                System.out.println("\n❌ Invalid input.");
                System.out.println("Please enter a number between 1 and 25.");
                continue;
            }

            int number = Integer.parseInt(input);

            // Mark the number.
            MarkResult result = card.markNumber(number);

            if (result == MarkResult.NOT_FOUND) {

                System.out.println("\n⚠️ Number " + number
                        + " is not present on your card.");

                continue;
            }

            if (result == MarkResult.ALREADY_MARKED) {

                System.out.println("\n⚠️ Number " + number
                        + " has already been marked.");

                continue;
            }

            System.out.println("\n✅ Number " + number + " marked successfully.");

            // Check newly completed Bingo lines.
            int previousBingos = card.getCompletedBingoCount();

            card.updateCompletedLines();

            int currentBingos = card.getCompletedBingoCount();

            if (currentBingos > previousBingos) {

                int newlyCompleted = currentBingos - previousBingos;

                System.out.println("\n🎉 BINGO!");

                if (newlyCompleted == 1) {
                    System.out.println("You completed 1 line!");
                } else {
                    System.out.println("You completed "
                            + newlyCompleted
                            + " lines!");
                }
            }

            // Display updated card.
            System.out.println("\nUpdated Bingo Card:");
            card.display();

            System.out.println("\nBINGO Progress: "
                    + currentBingos
                    + " / "
                    + REQUIRED_BINGOS);

            // Check whether player has completed 5 lines.
            if (currentBingos >= REQUIRED_BINGOS) {

                System.out.println("\n========================================");
                System.out.println("             🎉 BINGO! 🎉");
                System.out.println("========================================");

                System.out.println("\n🏆 Congratulations!");
                System.out.println("You completed "
                        + currentBingos
                        + " Bingo lines.");

                System.out.println("\nYou WIN the game!");

                break;
            }

//            System.out.println("\nPress ENTER to continue...");
//            scanner.nextLine();

            round++;
        }

        System.out.println("\n========================================");
        System.out.println("              GAME OVER");
        System.out.println("========================================");

        System.out.println("\nFinal Bingo Card:");
        card.display();

        System.out.println("\nTotal Bingo lines completed: "
                + card.getCompletedBingoCount());

        scanner.close();
    }

    /**
     * Validates the user's input.
     */
    private boolean isValidNumber(String input) {

        try {

            int number = Integer.parseInt(input);

            return number >= MIN_NUMBER
                    && number <= MAX_NUMBER;

        } catch (NumberFormatException e) {

            return false;
        }
    }

    /**
     * Prints game information.
     */
    private void printWelcomeMessage() {

        System.out.println("========================================");
        System.out.println("           🎱 BINGO GAME 🎱");
        System.out.println("========================================");

        System.out.println("\nRules:");
        System.out.println("• 1 player");
        System.out.println("• Random 5x5 Bingo card");
        System.out.println("• Numbers from 1 to 25");
        System.out.println("• No FREE center");
        System.out.println("• Enter numbers manually");
        System.out.println("• Complete row = 1 Bingo");
        System.out.println("• Complete column = 1 Bingo");
        System.out.println("• Complete diagonal = 1 Bingo");
        System.out.println("• Same line cannot be counted twice");
        System.out.println("• Complete 5 lines to WIN");
    }

    // ============================================================
    // ENUM
    // ============================================================

    enum MarkResult {
        MARKED,
        NOT_FOUND,
        ALREADY_MARKED
    }

    // ============================================================
    // BINGO CARD
    // ============================================================

    static class BingoCard {

        private final int[][] numbers = new int[SIZE][SIZE];

        private final boolean[][] marked = new boolean[SIZE][SIZE];

        /*
         * Stores whether each possible Bingo line
         * has already been counted.
         *
         * Rows:
         * 0 - 4
         *
         * Columns:
         * 5 - 9
         *
         * Main diagonal:
         * 10
         *
         * Secondary diagonal:
         * 11
         */
        private final boolean[] completedLines = new boolean[12];

        private final Random random = new Random();

        /**
         * Generates a random 5x5 card using
         * numbers 1 to 25 exactly once.
         */
        public void generate() {

            List<Integer> availableNumbers = new ArrayList<>();

            for (int number = MIN_NUMBER;
                 number <= MAX_NUMBER;
                 number++) {

                availableNumbers.add(number);
            }

            // Randomize 1-25.
            Collections.shuffle(availableNumbers, random);

            int index = 0;

            for (int row = 0; row < SIZE; row++) {

                for (int column = 0; column < SIZE; column++) {

                    numbers[row][column] =
                            availableNumbers.get(index++);

                    marked[row][column] = false;
                }
            }
        }

        /**
         * Marks a number on the Bingo card.
         */
        public MarkResult markNumber(int number) {

            for (int row = 0; row < SIZE; row++) {

                for (int column = 0; column < SIZE; column++) {

                    if (numbers[row][column] == number) {

                        if (marked[row][column]) {
                            return MarkResult.ALREADY_MARKED;
                        }

                        marked[row][column] = true;

                        return MarkResult.MARKED;
                    }
                }
            }

            return MarkResult.NOT_FOUND;
        }

        /**
         * Finds newly completed Bingo lines.
         *
         * Each line is counted only once.
         */
        public void updateCompletedLines() {

            // ==========================================
            // CHECK ROWS
            // ==========================================

            for (int row = 0; row < SIZE; row++) {

                // Row line indexes: 0-4
                if (!completedLines[row]
                        && isRowComplete(row)) {

                    completedLines[row] = true;
                }
            }

            // ==========================================
            // CHECK COLUMNS
            // ==========================================

            for (int column = 0; column < SIZE; column++) {

                // Column line indexes: 5-9
                int lineIndex = SIZE + column;

                if (!completedLines[lineIndex]
                        && isColumnComplete(column)) {

                    completedLines[lineIndex] = true;
                }
            }

            // ==========================================
            // MAIN DIAGONAL
            // ==========================================

            // Line index = 10
            if (!completedLines[10]
                    && isMainDiagonalComplete()) {

                completedLines[10] = true;
            }

            // ==========================================
            // SECONDARY DIAGONAL
            // ==========================================

            // Line index = 11
            if (!completedLines[11]
                    && isSecondaryDiagonalComplete()) {

                completedLines[11] = true;
            }
        }

        /**
         * Checks whether a row is completely marked.
         */
        private boolean isRowComplete(int row) {

            for (int column = 0; column < SIZE; column++) {

                if (!marked[row][column]) {
                    return false;
                }
            }

            return true;
        }

        /**
         * Checks whether a column is completely marked.
         */
        private boolean isColumnComplete(int column) {

            for (int row = 0; row < SIZE; row++) {

                if (!marked[row][column]) {
                    return false;
                }
            }

            return true;
        }

        /**
         * Checks top-left to bottom-right diagonal.
         */
        private boolean isMainDiagonalComplete() {

            for (int i = 0; i < SIZE; i++) {

                if (!marked[i][i]) {
                    return false;
                }
            }

            return true;
        }

        /**
         * Checks top-right to bottom-left diagonal.
         */
        private boolean isSecondaryDiagonalComplete() {

            for (int i = 0; i < SIZE; i++) {

                if (!marked[i][SIZE - 1 - i]) {
                    return false;
                }
            }

            return true;
        }

        /**
         * Returns total number of completed Bingo lines.
         */
        public int getCompletedBingoCount() {

            int count = 0;

            for (boolean completed : completedLines) {

                if (completed) {
                    count++;
                }
            }

            return count;
        }

        /**
         * Displays the Bingo card.
         */
        public void display() {

            System.out.println("+------+------+------+------+------+");
            System.out.println("|  B   |  I   |  N   |  G   |  O   |");
            System.out.println("+------+------+------+------+------+");

            for (int row = 0; row < SIZE; row++) {

                for (int column = 0;
                     column < SIZE;
                     column++) {

                    System.out.print("|");

                    if (marked[row][column]) {

                        System.out.printf(
                                GREEN + "  X%-3d" + RESET,
                                numbers[row][column]
                        );

                    } else {

                        System.out.printf(
                                "   %-3d",
                                numbers[row][column]
                        );
                    }
                }

                System.out.println("|");
                System.out.println("+------+------+------+------+------+");
            }

            System.out.println("X = Marked");
        }
    }
}

