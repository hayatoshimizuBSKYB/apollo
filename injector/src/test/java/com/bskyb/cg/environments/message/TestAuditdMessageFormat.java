/*
Copyright 2012 BSkyB Ltd.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/


package com.bskyb.cg.environments.message;

import java.io.BufferedInputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAuditdMessageFormat {

	private MessageFormat auditdMessageFormat ;
	
	private final static String testMessageFile = "logMessages/syslog1.txt";
	
	public final static int MAX_MESSAGE_SIZE =  64*1024;
	private final static String audtdDelimiter = "||";
	private final static String auditdDatePattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
	byte[]b = new byte[MAX_MESSAGE_SIZE];
	
	
	
	@Test
	public void testParse() {

//		try {
			Message parsedMessage = null;
			AuditdMessageFormat auditdMessageFormat = new AuditdMessageFormat(audtdDelimiter, auditdDatePattern);
			
			try {
				parsedMessage = auditdMessageFormat.parse(b);
			} catch (Exception e) {
				e.printStackTrace();
			}


			
			//resultQueue.remove();
			//assertEquals(resultQueue.size(),messageQueue.size() - 1);
//		} catch (IOException e) {
	//		e.printStackTrace();
		//}
	}

	@Before
	public  void setUp() throws Exception {

    	BufferedInputStream	bis = new BufferedInputStream(getClass().getClassLoader().getResourceAsStream(testMessageFile));


    	while (bis.read(b) != -1) {}
 


	}
	
	@After
	public void tearDown() throws Exception {
		b=null;

	}

}
