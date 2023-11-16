/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import matematika3.Matematika3;
import static org.junit.Assert.*;
import org.junit.Test;


/**
 *
 * @author H P
 */
public class MatematikaTest {
    
    @Test
    public void testUser(){
        Matematika3 mtk = new Matematika3();
        String result = mtk.user("DevinaShifra");
        String expResult = "Devina";
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTambah(){
        Matematika3 mtk = new Matematika3();
        int result = mtk.tambah(10, 5);
        int expResult = 15;
        
        assertEquals(expResult, result);
    }

    @Test
    public void testKurang(){
        Matematika3 mtk = new Matematika3();
        int result = mtk.kurang(10, 5);
        int expResult = 5;
        
        assertEquals(expResult, result);
    }
    
}
