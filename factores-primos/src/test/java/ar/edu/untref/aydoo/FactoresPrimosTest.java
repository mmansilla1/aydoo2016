package ar.edu.untref.aydoo;

import org.junit.Test;
import org.junit.Assert;


public class FactoresPrimosTest 
{
    @Test
    public void factoresPrimos()
    {
        FactoresPrimos fp1 = new FactoresPrimos();
        int result = fp1.factores();
        Assert.assertEquals("factores primos", result);
    }
}
