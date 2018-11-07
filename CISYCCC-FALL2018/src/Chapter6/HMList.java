package Chapter6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HMList {

	public void loadHangman()
	{
		List<HMUser> words = new ArrayList<HMUser>();
		File f = new File("hmwords.text");
		System.out.println("Does the file exist?" + f.exists());
		
		if(f.exists())
		{
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String st;
			try {
				while((st = br.readLine()) != null)
				{
					int HMWords = st.length();
					HMUser u = new HMUser();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
