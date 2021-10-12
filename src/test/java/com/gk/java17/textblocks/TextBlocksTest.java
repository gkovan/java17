package com.gk.java17.textblocks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TextBlocksTest {

    private static String html =
              """
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
              """;

    private static String query =
              """
              SELECT "EMP_ID", "LAST_NAME" FROM "EMPLOYEE_TB"
              WHERE "CITY" = 'INDIANAPOLIS'
              ORDER BY "EMP_ID", "LAST_NAME";
              """;

    private static String json =
              """
              {
                "firstName": "Gerry",
                "lastName": "Kovan"
              }
              """;
    
    private static String myOldJsonString = "{ \n"
    		+ "\"firstName\": \"gerry\",\n"
    		+ "\"lastName\": \"kovan\"\n"
    		+ "}";

    @Test
    public void testStrings() {
        assertNotNull(html);
        assertNotNull(query);
        assertEquals(66, html.length());
        assertEquals(110, query.length());
        assertEquals(50, json.length());
    }

}
