package platform;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import com.google.gson.Gson;



public class Test {
	
	public static void main(String[] args) {
		
		Gson gson = new Gson();
		String fileName = "file/test.json";
		ClassLoader classLoader = new Test().getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		String jsonInString = null;
		try {
			jsonInString = new String(Files.readAllBytes(file.toPath()));
			Analytics[] aList = gson.fromJson(jsonInString, Analytics[].class);
			
		   calculateNumbers(aList,0,0);
		   
		 

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(jsonInString);
	}

	public static void calculateNumbers(Analytics[] aList,int i, int count) {
		
		if (i < aList.length) {
			
			Analytics obj = aList[i];
			
            String key = obj.key;
			List<String> numbers = obj.getNumber();
			
			
			for (String curVal : numbers) {
				
					count= count+ Integer.parseInt(curVal);	
					
					System.out.println("count "+count);
				}
			}	
		else {
			
			System.out.println("Final Total =====>> "+count);
			
			return ;
			
		}
		
		
		
		calculateNumbers(aList,++i,count);
		

		
	}
		

}
