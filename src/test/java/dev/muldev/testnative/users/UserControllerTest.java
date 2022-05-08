package dev.muldev.testnative.users;

import dev.muldev.testnative.BaseControllerTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.UUID;

import static dev.muldev.testnative.TestUtils.asJsonString;
import static dev.muldev.testnative.TestUtils.mapFromJson;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
public class UserControllerTest extends BaseControllerTest {

    @Test
    void should_create_user() throws Exception {
        var request = new User(UUID.randomUUID(), "muldev", "contact@muldev.dev");

        final var result = this.mvc.perform(put(getBasePath())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(request)))
                .andExpect(status().isCreated());


        var userResult = mapFromJson(result.andReturn().getResponse().getContentAsString(), User.class);
        assertEquals("contact@muldev.dev",userResult.email);

    }

    @Override
    protected String getBasePath() {
        return UserController.USER_URL;
    }
}
