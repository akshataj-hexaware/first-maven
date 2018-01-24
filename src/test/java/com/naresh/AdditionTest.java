import com.naresh.Addition;
import org.junit.Test;
public class AdditionTest{
    @Test
    public void testAdd(){
        int a=10;
        int b=20;
        Addition additionObj=new Addition();
        int c =  additionObj.add(a,b);
        System.out.println(c);

    }
}