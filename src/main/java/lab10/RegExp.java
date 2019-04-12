package lab10;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RegExp {
    public static void main(String[] args) {
        String s1 = "this\\is\\a\\book";
        String s2 = "this/is//a////book";
        String s4 = "this is  a    book";

        System.out.println(Arrays.toString(s1.split("\\\\")));
        System.out.println(Arrays.toString(s2.split("/")));

        String[] s3 = Arrays.asList(s2.split("/")).stream()
                .filter(p -> p.length() > 1)
                .collect(Collectors.toList())
                .toArray(new String[0]);

        System.out.println(Arrays.toString(s3));

        Pattern p1 = Pattern.compile("[^\\w]+");
        Pattern p2 = Pattern.compile("[^\\S]+");
        System.out.println("Test1 "+Arrays.toString(s1.split(p1.pattern())));
        System.out.println("Test2 "+Arrays.toString(s4.split(p2.pattern())));

        Matcher m1 = p1.matcher(s1);
        while (m1.find())
            System.out.println(m1.group());

        final String ss1 = "Mark:A123456788:0912-555-999, John:B123456789:02-236577894";
        Pattern pp1 = Pattern.compile("[A-Z]\\d+");
        Pattern pp3 = Pattern.compile("[A-Z]+\\:|:\\d+");
        System.out.println(Arrays.toString(ss1.split(pp3.pattern())));
        Matcher mm1 = pp1.matcher(ss1);

        while(mm1.find()) System.out.println(mm1.group());

        String s01 = "+886-911-222-333";
        Pattern p01 = Pattern.compile("\\+(\\d{3})-(\\d{3})-(\\d{3})-(\\d{3})");
        Matcher m01 = p01.matcher(s01);
        String conver1 = m01.replaceAll("0$2-$3$4");
        System.out.println(conver1);
    }
}
