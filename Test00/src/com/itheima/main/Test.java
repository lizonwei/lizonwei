package com.itheima.main;

import com.itheima.bean.Pet;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ：lizonwei
 * @Date ：Created in 2020/11/9
 * @description ：
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws DocumentException {

        ArrayList<Pet> pets = new ArrayList<>();

        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read("Test00\\xml\\pet.xml");
        //获取根节点
        Element rootElement = read.getRootElement();
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            String id = element.attributeValue("id");
            String name = element.elementText("name");
            Element skills = element.element("skills");
            List<Element> elementList = skills.elements();
            ArrayList<String> skiList = new ArrayList<>();
            for (Element ele : elementList) {
                String skill = ele.getText();
                skiList.add(skill);
            }
            Pet pet = new Pet(Integer.parseInt(id), name, skiList);
            pets.add(pet);
        }

        pets.forEach(pet -> System.out.println(pet.toString()));


    }
}
