package com.my.Lab4;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.my.Lab4.model.University;

import java.io.File;
import java.io.IOException;

public class JsonWriterReader {
    private static ObjectMapper mapper;

    public static void writeInstitution(University institution) {
        if (mapper == null) mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File("institution.json"), institution);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static University readInstitution() {
        if (mapper == null) mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File("institution.json"), University.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
