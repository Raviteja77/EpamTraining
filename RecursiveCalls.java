class FactorialExample
{
    static int i;
    public int factorial(int value)
    {
        if(value == 0 || value == 1)
            return 1;
        return value * factorial(value - 1);
    }

    public void changeValue(int value)
    {
        i = value;
        changeValue(i - 1);
        
    }
}

public class RecursiveCalls {
    
}
