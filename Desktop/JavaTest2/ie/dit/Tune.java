package ie.dit;

import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Tune
{
	ArrayList<String> TuneList = new ArrayList<String>();
	
	private int x;
	private String title;
	private String altTitle;
	private String notation;
	
	public TuneList()
    {
        loadTuneBook();
    }
	
	public void Accessor(int num, String name, String name2, String notes)
	{
		public static void main(String args[])
		{
			int x = num;
			String title = name;
			String altTitle = name2;
			String notation = notes;	
		}
		
	}
	
	public String toString()
	{
		return String.format("%d, %s, %s", num, title, altTitle);
	}
}

public class loadTuneBook(ArrayList tunes)
{
	BufferedReader inputStream = null;

    try {
         inputStream = new BufferedReader(new FileReader("abcFile.txt"));
            
         String l;
         while ((l = inputStream.readLine()) != null) {
            TuneList.add(l);
         }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (inputStream != null) {
                try
                {
                    inputStream.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}