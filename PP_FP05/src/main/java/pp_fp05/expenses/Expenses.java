/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp05.expenses;

/**
 *
 * @author Leonardo
 */
public class Expenses {
    protected int id;
    protected String tipo;
    protected float montante;
    protected String data;
    private static int nextid = 0;

    public Expenses (String tempTipo, float tempMontante, String tempData){
        id = nextid++;
        tipo = tempTipo;
        montante = tempMontante;
        data = tempData;
    }
}
