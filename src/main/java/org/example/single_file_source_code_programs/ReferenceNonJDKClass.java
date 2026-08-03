package org.example.single_file_source_code_programs;

import org.apache.commons.lang3.RandomUtils;

public class ReferenceNonJDKClass {
    public static void main(String[] args) {
        IO.println(RandomUtils.insecure().randomInt());
    }
}
