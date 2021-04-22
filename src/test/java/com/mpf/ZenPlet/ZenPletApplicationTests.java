package com.mpf.ZenPlet;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

@SpringBootTest
class ZenPletApplicationTests {

        @Autowired
        MockMvc mock;

        @Test
        @Order(0)
        void contextLoads() throws Exception {
                mock.perform(MockMvcRequestBuilders.post("/api/save-owner").contentType(MediaType.APPLICATION_JSON)
                                .content("{\"owner_name\":\"lucho\",\"owner_email\":\"juan@gmail.com\",\"owner_password\":\"114321\",\"owner_phone_number\":\"1231213\"}"))
                                .andDo(MockMvcResultHandlers.print());
        }

        @Test
        @Order(1)
        void testCreacion() throws Exception {
                mock.perform(MockMvcRequestBuilders.post("/crear").contentType(MediaType.APPLICATION_JSON)
                                // .content("{\"userId\":2,\"username\":\"lucho\",\"contrasena\":\"123\",\"nombreCompleto\":\"Luis
                                // Perez\"}"))
                                .content("{\"username\":\"lucho\",\"contrasena\":\"123\",\"nombreCompleto\":\"Luis Perez\"}"))
                                .andDo(MockMvcResultHandlers.print());
        }

        @Test
        @Order(2)
        void testListar() throws Exception {
                mock.perform(MockMvcRequestBuilders.get("/listar-usuarios")).andDo(MockMvcResultHandlers.print());
        }

}