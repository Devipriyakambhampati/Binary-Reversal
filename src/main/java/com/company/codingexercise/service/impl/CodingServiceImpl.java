package com.company.codingexercise.service.impl;

import com.company.codingexercise.service.CodingService;
import org.springframework.stereotype.Service;
import java.text.DecimalFormat;

@Service
public class CodingServiceImpl implements CodingService {

    @Override
    public String binaryReversal(String ipString) {

        int intString = Integer.parseInt(ipString);
        String bites = Integer.toBinaryString(intString);
        int intBites = Integer.parseInt(bites);
        DecimalFormat df = new DecimalFormat("00000000");
        String newString = df.format(intBites);
        String reversedString = reverse(newString);
        int decimal = Integer.parseInt(reversedString, 2);
        //System.out.println(decimal);
        String binaryResult = Integer.toString(decimal);

        return binaryResult;
    }

    private String reverse(String input) {
        char[] in = input.toCharArray();
        int begin = 0;
        int end = in.length - 1;
        char temp;
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }
}
