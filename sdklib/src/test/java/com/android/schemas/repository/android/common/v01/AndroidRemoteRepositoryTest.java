/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.android.schemas.repository.android.common.v01;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author benoit
 */
public class AndroidRemoteRepositoryTest {
    
    public AndroidRemoteRepositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testRemoteRepository() throws JAXBException, MalformedURLException{
        URL url = new URL("https://dl.google.com/android/repository/repository2-1.xml");
        //URL url = new URL("http://dl-ssl.google.com/android/repository/repository-11.xml");
        try {
            URLConnection conn = url.openConnection();
            
            JAXBContext ctxt = JAXBContext.newInstance("com.android.schemas.repository.android.common.v01");
            Unmarshaller um = ctxt.createUnmarshaller();
            
            Object obj = um.unmarshal(conn.getInputStream());
            if (!(obj instanceof JAXBElement) && !(obj instanceof RepositoryType)) throw new JAXBException("Invalid type");
            
            
        } catch (IOException ex) {
            Logger.getLogger(AndroidRemoteRepositoryTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JAXBException ex) {
            Logger.getLogger(AndroidRemoteRepositoryTest.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
    }
}
