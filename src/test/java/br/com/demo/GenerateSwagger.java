package br.com.demo;

import br.com.demo.util.Utils;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GenerateSwagger {

    @Autowired
    WebApplicationContext context;

    @Test
    public void generateSwagger() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/v2/api-docs").accept(MediaType.APPLICATION_JSON))
                .andDo((result) -> {
                    String jsonContent = result.getResponse().getContentAsString();

                    Path pathJson = Paths.get(System.getProperty("user.dir") + "/src/main/resources/swaggerJson.json");
                    Path pathYaml = Paths.get(System.getProperty("user.dir") + "/src/main/resources/swaggerYaml.yaml");

                    File fileJson = pathJson.toFile();
                    File fileYaml = pathYaml.toFile();

                    FileUtils.writeStringToFile(fileJson,
                            jsonContent, StandardCharsets.UTF_8);

                    FileUtils.writeStringToFile(fileYaml,
                            Utils.asYaml(jsonContent), StandardCharsets.UTF_8);
                });
    }
}