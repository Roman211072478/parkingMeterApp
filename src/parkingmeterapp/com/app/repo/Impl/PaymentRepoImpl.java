/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingmeterapp.com.app.repo.Impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import parkingmeterapp.com.app.repo.PaymentRepo;

/**
 *
 * @author Rafiq
 */
public class PaymentRepoImpl implements PaymentRepo{

    //A constant variable for file name which shouldn't change
    public static final String FILE_NAME = "payMeterData.txt";
       
    public PaymentRepoImpl() {
    }
    
    @Override
    public boolean write(String data) {
        //Implementation of writing to a file
         try{
            
            //check if the file exits
            File myFile = new File(FILE_NAME);
            
            if(!myFile.exists())
            {
                //if file doesn't exist
                myFile.createNewFile();
            }
            
            //Load buffer , and the boolean is to enable appending
            FileWriter fstream = new FileWriter(myFile.getAbsoluteFile(),true);
            BufferedWriter out = new BufferedWriter(fstream);
            
            out.write(data+"\n");//append to the file
            
            //Close the output stream          
            out.close();
            
            return true;//to indicate that the save was successful
                    
        }catch (Exception e){//Catch exception if save was unsuccessful
            return false;
        }
    }

    @Override
    public List<Object[]> read() {
        
        //initials buffer
       BufferedReader buffer = null;
       FileReader fr = null;
       
       try{
           
        fr = new FileReader(FILE_NAME);
        buffer = new BufferedReader(fr);
        
        //variables
        String output = "";
        String line;

        List<Object[]> list = new ArrayList<>();
        
        //read file til end of file
        while((line = buffer.readLine()) != null)
        {
            Object[] data = new Object[6];//due to the being 6 colums in our table
            if(line != null || line != "")
            {
                //use deliminator to retrieve data
                Scanner s = new Scanner(line).useDelimiter("\\s*-\\s*");
                data[0] = s.next();
                data[1] = s.next();
                data[2] = s.next();
                data[3] = s.next();
                data[4] = s.next();
                data[5] = s.next(); 
                         
                list.add(data);//add data to list
            }
                      
        }
       
        return list;
    }
       catch(IOException e){
           return null;
       }
        catch(Exception e){         
           return null;
       }
    }
    
}
