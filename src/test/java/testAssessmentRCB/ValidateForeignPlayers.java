package testAssessmentRCB;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Assessment.genericUtility.IConstants;
import com.Assessment.pojo.Pojorcb;
import com.Assessment.pojo.playerDetails;
/*
 * This test will validation for Foreign players 
 */

public class ValidateForeignPlayers {
	@Test
	public void ValidateForeignPlayersTest() throws JsonParseException, JsonMappingException, IOException
	
	// creation of object for deserialization 
	{
		ObjectMapper obj=new ObjectMapper();
		
		// reading data from Data1 file
		Pojorcb rcb = obj.readValue(new File(IConstants.RCBTeam), Pojorcb.class);
	
		
		playerDetails[] players = rcb.getPlayer();
	 
		
		ArrayList<String> list=new ArrayList<>();
		String str=IConstants.CountryName;
		for (int i = 0; i < players.length; i++) {
			
			String contry = players[i].getCountry();
			list.add(contry);
		
			
		}
		int count=0;
		for (String string : list) {
			if (!string.equals(str)) {
				count++;
			}
		}
		
		//Assertion of four foreign players
		Assert.assertEquals(count, 4);
		
	}
	

}
