/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingmeterapp.com.app.repo;

import java.util.List;

/**
 *
 * @author dev2
 */
public interface PaymentRepo {
    public boolean write(String data);
    public List<Object[]> read();
           
}
