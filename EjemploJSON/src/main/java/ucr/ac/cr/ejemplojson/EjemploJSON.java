/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ucr.ac.cr.ejemplojson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Usuario
 */
public class EjemploJSON {
    private String filePath = "person.json";
    
    public static void main(String[] args){
        EjemploJSON ejemplo = new EjemploJSON();/*
        ejemplo.appendJSonToFile(new Person("9087","Miguel", 89.9, 30));
        ejemplo.appendJSonToFile(new Person("7657837","Pepe", 102.7, 90));
        ejemplo.appendJSonToFile(new Person("6565687","Messi", 45.9, 200));*/
        
        ejemplo.getInfo();
    }
    
    public void appendJSonToFile(Person person) {
        JSONObject newObject = new JSONObject();
        newObject.put("id", person.getId());
        newObject.put("name", person.getName());
        newObject.put("weight", person.getWeight());
        newObject.put("age", person.getAge());
        
        //El Json array contendra todos los objetos JSON
        JSONArray jsonArray = new JSONArray();
        //Se intenta leer el archivo existente
        JSONParser jsonParser = new JSONParser();
        try(FileReader reader = new FileReader(filePath)){
            Object obj = jsonParser.parse(reader);
            jsonArray = (JSONArray) obj;
        }catch(IOException | ParseException e){
            System.out.println("No existing file or new file will be created");
        }
        //Agrega el nuevo objeto JSON al array
        jsonArray.add(newObject);
        //Escribir el JSONARRAY actualizado de nuevo
        try(FileWriter file = new FileWriter(filePath)){
            file.write(JSONArray.toJSONString(jsonArray));
            file.flush();
        }catch(IOException io){
            io.printStackTrace();
        }
    }
    
    
    public ArrayList<Person> loadPerson()
    {
      ArrayList<Person> people=new ArrayList<>();
      JSONParser parser=new JSONParser();
      
      try(FileReader reader=new FileReader(filePath))
      {
        Object obj=parser.parse(reader);
        JSONArray jsonArray=(JSONArray) obj;
        
        for(Object object:jsonArray)
        {
         JSONObject jsonObject=(JSONObject)object;
         
         String id=(String) jsonObject.get("id");
         String name=(String) jsonObject.get("name");
         double weight=(double) jsonObject.get("weight");
         int age=((Long) jsonObject.get("age")).intValue();
         
         
         Person person=new Person(id,name,weight,age);
         
         people.add(person);
         
        }
        
        
      }catch(IOException | ParseException e)
      {       
        e.printStackTrace();
              
      }
      
      return people;
    }
    
    
    public void getInfo()
    {
    
         ArrayList<Person> people=new ArrayList<>();
         
         people=loadPerson();
         
         for(int i=0; i<people.size();i++)
         {
          System.out.println(people.get(i).toString());
          
          
         }
        
    }
    
}
