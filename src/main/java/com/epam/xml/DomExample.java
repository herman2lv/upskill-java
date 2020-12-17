package com.epam.xml;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomExample {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            dbFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
            dbFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
            DocumentBuilder documentBuilder = dbFactory.newDocumentBuilder();
            Document document = documentBuilder.parse("src/main/resources/BookCatalog.xml");

            Node root = document.getDocumentElement();
            System.out.println("List of books:\n");
            NodeList books = root.getChildNodes();
            for (int i = 0; i < books.getLength(); i++) {
                Node book = books.item(i);
                if (book.getNodeType() != Node.TEXT_NODE) {
                    NodeList bookProperties = book.getChildNodes();
                    for (int j = 0; j < bookProperties.getLength(); j++) {
                        Node property = bookProperties.item(j);
                        if (property.getNodeType() != Node.TEXT_NODE) {
                            System.out.println(property.getNodeName() + ": "
                                    + property.getTextContent());
                        }
                    }
                    System.out.println("===================");
                }
            }
            addNewBook(document);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void addNewBook(Document document) throws TransformerFactoryConfigurationError, DOMException {
        Node root = document.getDocumentElement();
        Element book = document.createElement("Book");
        Element title = document.createElement("Title");
        title.setTextContent("Java from EPAM");
        Element author = document.createElement("Author");
        author.setTextContent("Ihar Blinou");
        Element date = document.createElement("Date");
        date.setTextContent("2020");
        Element isbn = document.createElement("ISBN");
        isbn.setTextContent("978-985-581-391-1");
        Element publisher = document.createElement("Publisher");
        publisher.setTextContent("Four Quarters");
        Element cost = document.createElement("Cost");
        cost.setTextContent("30");
        cost.setAttribute("currency", "BYN");
        book.appendChild(title);
        book.appendChild(author);
        book.appendChild(date);
        book.appendChild(isbn);
        book.appendChild(publisher);
        book.appendChild(cost);
        root.appendChild(book);
        writeDocument(document);
    }

    private static void writeDocument(Document document) throws TransformerFactoryConfigurationError {
        try {
            DOMSource domSource = new DOMSource(document);
            FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/EditedBookCatalog.xml");
            StreamResult streamResult = new StreamResult(fileOutputStream);
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(domSource, streamResult);
            fileOutputStream.close();
        } catch (TransformerException | IOException e) {
            e.printStackTrace();
        }
    }
}

class StaxWriteExample {
    public static void main(String[] args) {
        try {
            XMLOutputFactory output = XMLOutputFactory.newInstance();
            XMLStreamWriter writer =
                    output.createXMLStreamWriter(new FileWriter("src/main/resources/CreatedBookCatalog.xml"));

            // Открываем XML-документ и Пишем корневой элемент BookCatalogue
            writer.writeStartDocument("1.0");
            writer.writeStartElement("BookCatalogue");
            // Делаем цикл для книг
            for (int i = 0; i < 5; i++) {
                // Записываем Book
                writer.writeStartElement("Book");

                // Заполняем все тэги для книги
                // Title
                writer.writeStartElement("Title");
                writer.writeCharacters("Book #" + i);
                writer.writeEndElement();
                // Author
                writer.writeStartElement("Author");
                writer.writeCharacters("Author #" + i);
                writer.writeEndElement();
                // Date
                writer.writeStartElement("Date");
                writer.writeCharacters(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                writer.writeEndElement();
                // ISBN
                writer.writeStartElement("ISBN");
                writer.writeCharacters("ISBN #" + i);
                writer.writeEndElement();
                // Publisher
                writer.writeStartElement("Publisher");
                writer.writeCharacters("Publisher #" + i);
                writer.writeEndElement();
                // Cost
                writer.writeStartElement("Cost");
                writer.writeAttribute("currency", "USD");
                writer.writeCharacters("" + (i + 10));
                writer.writeEndElement();

                // Закрываем тэг Book
                writer.writeEndElement();
            }
            // Закрываем корневой элемент
            writer.writeEndElement();
            // Закрываем XML-документ
            writer.writeEndDocument();
            writer.flush();
        } catch (XMLStreamException | IOException ex) {
            ex.printStackTrace();
        }
    }
}
