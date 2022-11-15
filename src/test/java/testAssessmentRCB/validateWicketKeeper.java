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
 * this test do the validation for wicket-keeper
 */


public class validateWicketKeeper {
	@Test
	public void validateWicketKeeperTest() throws JsonParseException, JsonMappingException, IOException {
		
		// creation of object for deserialization 
		ObjectMapper obj=new ObjectMapper();
		
		// reading data from Data1 file
		Pojorcb rcb = obj.readValue(new File(IConstants.RCBTeam), Pojorcb.class);
		
		// writing the object array into played Details pojo class
		playerDetails[] players = rcb.getPlayer();
		ArrayList<String> listrole=new ArrayList<>();
		String str=IConstants.role;
		
		// Assertion of wicket-keeper
		for (int i = 0; i < players.length; i++) {

			String role=players[i].getRole();
			listrole.add(role);

		}
		int count=0;
		for (String string : listrole) {
			if (string.equals(str)) {
				count++;
			}
		}
		if (!(count>=1)) {
			Assert.fail();
		}

	}


}
