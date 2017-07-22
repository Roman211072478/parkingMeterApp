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

    private static final String FILE_NAME = "payMeterData.txt";
    
    public PaymentRepoImpl() {
    }

    
    @Override
    public boolean write(String data) {
         try{
            
            //check if file exits
            File myFile = new File(FILE_NAME);
            
            if(!myFile.exists())
            {
                myFile.createNewFile();
            }
            
              // Create file 
            FileWriter fstream = new FileWriter(myFile.getAbsoluteFile(),true);
            BufferedWriter out = new BufferedWriter(fstream);
            
            out.write(data+"\n");
            //Close the output stream
          
            out.close();
            return true;
                    
        }catch (Exception e){//Catch exception if any
            return false;
        }
    }

    @Override
    public List<Object[]> read() {
        
       BufferedReader buffer = null;
       FileReader fr = null;
       
       try{
        fr = new FileReader(FILE_NAME);
        buffer = new BufferedReader(fr);
        
        String output = "";
        String line;

        List<Object[]> list = new ArrayList<>();
        
        while((line = buffer.readLine()) != null)
        {
            
            output += line+"\n";
            Object[] data = new Object[6];
            if(line != null || line != "")
            {
                Scanner s = new Scanner(output).useDelimiter("\\s*-\\s*");
                data[0] = s.next();
                data[1] = s.next();
                data[2] = s.next();
                data[3] = s.next();
                data[4] = s.next();
                data[5] = s.next(); 
                         
                list.add(data);
            }
                      
        }
       
        return list;
    }
       catch(IOException e){
           return null;
       }
        catch(Exception e){
            System.out.println(e.getMessage());
           return null;
       }
    }
    
}
