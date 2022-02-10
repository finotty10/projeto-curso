package executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		
		String text = "hugo,curso java,80,90,100,70";
		
		String[] valoresArray = text.split(",");
		
		//for(int i=0; i < valoresArray.length; i++)
		//System.out.println(valoresArray[i]);
		
		//convertendo um array pra uma lista
		
		List<String> list = Arrays.asList(valoresArray);
		
		for (String valorString : list) {
			System.out.println(valorString);
		}
		
		//converter lista para array
		
		String[] conversaoArray = list.toArray(new String[6]);
		for(int pos=0; pos < conversaoArray.length; pos++)
		System.out.println(conversaoArray[pos]);
	}
}
