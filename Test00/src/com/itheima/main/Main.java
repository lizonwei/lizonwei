package com.itheima.main;

import com.itheima.bean.Pet;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author ：lizonwei
 * @Date ：Created in 2020/11/8
 * @description ：
 * @version: 1.0
 */
public class Main {
    @SuppressWarnings("all")
    public static void main(String[] args) throws DocumentException {
       //创建宠物集合
        ArrayList<Pet> pets = new ArrayList<>();
        //1.获取解析XML文档的解析器对象
        SAXReader reader = new SAXReader();
        //2.利用解析器把xml文档解析到内存中，并返回一个文档
        Document document = reader.read("Test00\\xml\\pet.xml");
        //3.获取根标签pets
        Element rootElement = document.getRootElement();
        //4.通过根标签，获取pet标签
        List<Element> elements = rootElement.elements();
        //5.开始解析并添加
        for (Element element : elements) {
            String id = element.attributeValue("id");
            String name = element.elementText("name");
            Element skills = element.element("skills");
            List<Element> list1 = skills.elements();
            ArrayList<String> list = new ArrayList<>();
            for (Element element1 : list1) {
                list.add(element1.getText());
            }
            Pet pet = new Pet(Integer.parseInt(id), name, list);
            System.out.println("test");
            System.out.println("test");
            System.out.println("test");
            System.out.println("test");
            System.out.println("test");
            pets.add(pet);
        }

        for (Pet pet : pets) {
            //设置技能随机数 [0,4)
            int num = new Random().nextInt(4);
            System.out.println(pet.getName()+" 使用了技能： "+pet.getSkills().get(num)+" 效果拨群");
        }
    }
}
