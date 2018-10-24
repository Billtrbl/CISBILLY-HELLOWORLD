package Chapter6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class HMList {

	public loadHangman()
	{
		List<HMUser> words = new ArrayList<HMUser>();
		File f = new File("hmwords.text");
		System.out.println("Does the file exist?" + f.exists());
		
		if(f.exists())
		{
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String st;
			while((st = br.readLine()) != null)
			{
				int HMWords = st.length();
				HMUser u = new HMUser();
			}
		}
	}
}
