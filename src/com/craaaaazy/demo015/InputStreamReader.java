package com.craaaaazy.demo015;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamReader {
    private InputStream in;
    public InputStreamReader(InputStream in) {
        this.in = in;
    }
    public int read(char[] chars) throws IOException {
        int len = 0;
        for(int i = 0; i < chars.length; i++) {
            int result = in.read();
            if (result != -1) {
                chars[i] = (char) result;
            } else {
                break;
            }
            len = i;
        }
        return len;
    }

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        char[] chars = new char[10];
        try {
            int len = isr.read(chars);
            System.out.println("read length " + len);
            System.out.println("read result " + new String(chars, 0, chars.length));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
