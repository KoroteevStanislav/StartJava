public class MyFirstGame {
    public static void main(String[] args) {
        int secretNum = 57;
        int playerNum = 40;

        if(secretNum > 0 && secretNum <= 100) {
            while(secretNum != playerNum) {
                if(secretNum > playerNum) {
                    System.out.println("число: " + playerNum + 
                            " меньше того, что загадал компьютер");
                    playerNum++;
                } else if(secretNum < playerNum) {
                    System.out.println("число: " + playerNum + 
                            " больше того, что загадал компьютер");
                    playerNum--;
                }
            }
            System.out.println("Вы победили!");
        } else {
            System.out.println("Нужно использовать целое число из полуинтервала (0, 100]");
        }
    }
}