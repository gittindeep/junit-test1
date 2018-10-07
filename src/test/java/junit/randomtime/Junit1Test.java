package junit.randomtime;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import com.random.one.Randomtime;
import java.time.LocalTime;

public class Junit1Test {
	
	//test the generated time for the remaining time of that day
	@Test
	public void mastertest1() {
		
		LocalTime lt = LocalTime.now();
		LocalTime rt = Randomtime.printrandomtime(lt);
		LocalTime mt = LocalTime.of(23,59);
		assertTrue( rt.isAfter(lt) &&  rt.isBefore(mt));
	}
}

		
	

