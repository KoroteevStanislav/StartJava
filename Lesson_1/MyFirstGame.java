public class MyFirstGame {
    public static void main(String[] args) {
        int numComp = 57;
        int numPlayer = 40;

        if(numComp != numPlayer) {
            if(numComp >= 0 && numComp < 100) {
                while(numComp != numPlayer) {
                    if(numPlayer > 99) {
                        numPlayer = 0;
                    } else if(numComp > numPlayer) {
                        System.out.println("число: " + numPlayer + 
                                " меньше того, что загадал компьютер");
                    } else if(numComp < numPlayer) {
                        System.out.println("число: " + numPlayer + 
                                " больше того, что загадал компьютер");
                    }
                    numPlayer++;
                }
                System.out.println("Вы победили!");
            } else {
                System.out.println("Вышли за полуинтервал");
            }
        } else {
            System.out.println("Вы победили!");
        }
    }
}