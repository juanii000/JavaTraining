package com.juani.exercises.db;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class XMLReader {
    public static void main(String[] args) {
        try {
            File inputFile = new File("JuniorAdv/src/main/java/com/juani/exercises/db/input.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            Map<String, String> elementMap = new HashMap<>();
            extractElements(doc.getDocumentElement(), elementMap);

            for (Map.Entry<String, String> entry : elementMap.entrySet()) {
                System.out.println("Tag: " + entry.getKey() + ", Content: " + entry.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void extractElements(Element element, Map<String, String> elementMap) {
        //TODO We can make it to collect whatever we want using tags name, at this moment is retrieving all elements

        NodeList nodeList = element.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element childElement = (Element) node;
                String tagName = childElement.getTagName();
                String textContent = childElement.getTextContent().trim();

                elementMap.put(tagName, textContent);

                extractElements(childElement, elementMap);
            }
        }
    }
}
