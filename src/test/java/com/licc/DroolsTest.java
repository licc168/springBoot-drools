package com.licc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;

import com.licc.drools.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


/**
 *
 * @author lichangchao
 * @version 1.0.0
 * @date 2017/8/16 9:42
 * @see
 */
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class DroolsTest {

  @Autowired
  private MockMvc mockMvc;
  @Test
  public  void test() throws Exception {
  mockMvc.perform(get("/droolsTest").accept(MediaType.APPLICATION_JSON));
  }

}
