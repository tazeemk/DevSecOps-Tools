package nit.nt.service;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
public class AppTest 
{
	
private static final Logger login = Logger.getLogger("com.nt.service.AppTest");
  public int sum(int x, int y)
  {
	login.info("AppTest.sum()");
	return x+y;
   }

public int processList() {
	login.info("AppTest.processList()");
	List<Integer> list =null;
	
	list = new ArrayList<>();
	list.add(5);
	list.add(56);
	list.add(66);
	
	return list.size();
}
	
public static void main(String[] args) 
{
        login.info("AppTest.main(): (Starts :)");
	AppTest test = new AppTest();
	login.log(java.util.logging.Level.FINE,"Sum of :{0}",test.sum(500,40));
	login.log(java.util.logging.Level.FINE,"List is :{0}",test.processList());
	   login.info("AppTest.main() :(End)");
}
	
}
