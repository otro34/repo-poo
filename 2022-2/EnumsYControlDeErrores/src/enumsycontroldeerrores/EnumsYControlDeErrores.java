/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumsycontroldeerrores;

/**
 *
 * @author otro3
 */
public class EnumsYControlDeErrores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ropa objRopa = new Ropa("Verde",Talla.XL);
        
        if (objRopa.getTalla().equals(Talla.XL)) {
            System.out.println("Ropa talla grande");
        }
        
                
        try {
            
            int[] arr = new int[3];
            
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            
            for(int i=0;i<3;i++) {
                System.out.println(arr[i]);
            }

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error.");
            System.out.println(e.toString());
        } finally {
            System.out.println("Esto se ejecuta siempre");
        }
            
    }
    
}
