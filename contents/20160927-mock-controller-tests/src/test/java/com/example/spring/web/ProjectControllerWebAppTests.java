package com.example.spring.web;

import com.example.spring.App;
import com.example.spring.domain.Project;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * This test uses WebAppConfiguration and webAppContextSetup().
 */
@SpringApplicationConfiguration(classes = App.class)
// To insert test fixture data:
@Sql("/data-project.sql")
// To disable inserting default data-{platform}.sql:
@TestPropertySource(properties = "spring.datasource.data: /data-empty.sql")
@WebAppConfiguration
public class ProjectControllerWebAppTests extends AbstractControllerTests {
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    @SuppressWarnings("unchecked")
    public void list() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/projects"))
            .andExpect(status().isOk())
            .andExpect(model().attributeExists("list"))
            .andExpect(view().name("projects/list"))
            .andReturn();
        ModelMap modelMap = mvcResult.getModelAndView().getModelMap();
        Object listObj = modelMap.get("list");
        assertThat(listObj, is(notNullValue()));
        assertThat(listObj, is(instanceOf(Page.class)));
        Page<Project> page = (Page<Project>) listObj;
        assertThat(page.getContent().size(), is(3));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void list2() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/projects"))
            .andExpect(status().isOk())
            .andExpect(model().attributeExists("list"))
            .andExpect(view().name("projects/list"))
            .andReturn();
        ModelMap modelMap = mvcResult.getModelAndView().getModelMap();
        Object listObj = modelMap.get("list");
        assertThat(listObj, is(notNullValue()));
        assertThat(listObj, is(instanceOf(Page.class)));
        Page<Project> page = (Page<Project>) listObj;
        assertThat(page.getContent().size(), is(3));
    }
}
