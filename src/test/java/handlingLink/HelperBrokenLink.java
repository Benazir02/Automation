package handlingLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HelperBrokenLink {
	
	public static int brokenLinkCheck(String str)
	{
		int count=0;
		try {
			
			HttpURLConnection httpurl=null;
			URL url =new URL(str);
			httpurl=(HttpURLConnection) url.openConnection();
			
			httpurl.connect();
			int status=httpurl.getResponseCode();
			{
				if(status>=400)
				{
					System.out.println("The link is broken:" +str);
					count++; //count=count+1
					
				}
				else
				{
					System.out.println("The link is valid:" +str);
				}
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		}
		return count;
		
		
	}
	

}
