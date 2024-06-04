package org.hit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;

public class WordsTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("测试开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }


    @Test
    public void calcShortestPath() {
        System.out.println("测试ING");
        String filename = "test.txt";
        try{
            String data = "Hello I am a guy with I am a guy happy every day";
            File file = new File(filename);
            if(!file.exists()){
                file.createNewFile();
                FileWriter fileWritter = new FileWriter(file.getName(),true);
                fileWritter.write(data);
                fileWritter.close();
                System.out.println("new file Done");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        Words root = new Words(filename);
        String word1 = "a";
        String word2 = "a";
        String res = root.calcShortestPath(word1,word2);
        System.out.println(res);
        assertEquals("a",res);
    }
}