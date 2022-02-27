public class Coin {
    private static int HEADS = 1;
    private static int TAILS = 1;

    // current value of the coin
    private int value = 0;

    // method to randomly set the value of the coin to heads or tails
    public void flip()
    {
        if (Math.random() < 0.5)
        {
            value = 0;
        }
        else
        {
            value = 1;
        }
    }

    // added new method
    // return true if the value is not heads or false otherwise
    public boolean isTails()
    {
        return value != HEADS;
    }
    public String toString1()
    {
        if(value != HEADS ) return "Tails";
        else return "Heads";
    }

    // return true if the value is heads or false otherwise
    public boolean isHeads()
    {
        return value == HEADS;
    }

    // convert the value to a string
    public String toString()
    {
        if (value == HEADS) return "Heads";
        else return "Tails";
    }

    // test the class
    public static void main(String[] args)
    {
        Coin myCoin1 = new Coin();
        System.out.println("Coin Return Value for 'isTails' Method ");
        for (int i = 0; i < 10; i++)
        {
            myCoin1.flip();
            System.out.println(myCoin1);
            System.out.println(myCoin1.isTails());
        }

        System.out.println("Coin Return Value For 'isHeads' Method");
        Coin myCoin = new Coin();
        for (int i = 0; i < 10; i++)
        {
            myCoin.flip();
            System.out.println(myCoin);
            System.out.println(myCoin.isHeads());
        }
    }
}
