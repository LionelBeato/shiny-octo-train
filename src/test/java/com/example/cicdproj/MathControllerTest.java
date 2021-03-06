package com.example.cicdproj;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment =
SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MathControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Value("${app.monkey}")
    String myPort;

//    @Value("${app.test}")
//    String myString;
//
    @Test
    public void portTest(){
        System.out.println(myPort);
    }

//    @Test
//    public void myTest(){
//        System.out.println(myString);
//    }

//    @Test
//    public void test() throws Exception {
//
//        Integer expected = 7;
//        Integer actual = this.restTemplate.getForObject("http://localhost:" + port + "/add/4/3", Integer.class);
//        System.out.println(actual);
//        System.out.println("issue fixed!");
//        System.out.println(System.getProperties());
//        assertEquals(expected, actual);
//    }


    @Test
    public void otherTest(){
        assertTrue(true);
    }


}
