package LEC8_String;

import java.util.*;

public class ex5_ParseDataFromURL {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap duong truyen URL: ");
        String url = s.nextLine();

        int protocolEndIndex = url.indexOf(":");
        String protocol = url.substring(0, protocolEndIndex);

        System.out.println("Protocol: " + protocol);

        String domainAndPath = url.substring(protocolEndIndex + 3);
        int domainEndIndex = domainAndPath.indexOf("//");// Tìm domain và path

        domainEndIndex = domainAndPath.indexOf("/");
        String domain;
        String path;
        if (domainEndIndex == -1) {
            domain = domainAndPath;
            path = "";
        } else {
            domain = domainAndPath.substring(0, domainEndIndex);
            path = domainAndPath.substring(domainEndIndex);
        }
        System.out.println("Domain: " + domain);
        System.out.println("Path: " + path);

    }
}
