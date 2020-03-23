package tddjunitdemo;

public class RemovingFirst2As {

	public String removeFirst2Charcters(String s) {
		// TODO Auto-generated method stub
		String result="";
			if(s.charAt(0)=='A' && s.charAt(1)=='A')
				result=result+s.substring(2);
			else if(s.charAt(0)=='A' || s.charAt(1)=='A'){
				if(s.charAt(0)=='A')
					result=result+s.substring(1);
				if(s.charAt(1)=='A')
					result=result+s.substring(0,1)+s.substring(2);
			}
			else
				result=result+s;
		return result;
	}

}
