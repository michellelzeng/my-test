package com;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.server.ExportException;

/**
 * Created by michelle on 9/12/15.
 */
public class IssueContentHandler extends DefaultHandler {

    private boolean isKey;
    private boolean isDescription;
    private boolean isSummary;
    private String key;
    private String summary;
    private String description;
    private FileWriter fileWriter;

    @Override
    public void startDocument() throws SAXException {
        File file = new File("target/data/ham");
        if(!file.exists()) {
            file.mkdirs();
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if ("key".equals(qName)) {
            isKey = true;
        }

        if ("description".equals(qName)) {
            isDescription = true;
        }
        if ("summary".equals(qName)) {
            isSummary = true;
        }

    }

    //when do you create a file, after you get the key.
    //write at the end of each issue
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if ("item".equals(qName)) {
            writeToFile();
        }
    }

    private void writeToFile() {
        try {
            fileWriter = new FileWriter("target/data/ham/" + key + ".txt");
            fileWriter.write(summary);
            fileWriter.write("\n");
            fileWriter.write(description);
            fileWriter.close();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (isKey) {
            key = new String(ch, start, length);
            isKey = false;
        }

        if (isSummary) {
            summary = new String(ch, start, length);
            isSummary = false;
        }

        if (isDescription) {
            description = new String(ch, start, length);
            isDescription = false;
        }

    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        if(fileWriter != null) {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
