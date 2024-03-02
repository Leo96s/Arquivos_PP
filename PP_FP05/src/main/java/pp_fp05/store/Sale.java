/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp05.store;
import pp_fp05.cd.CD;

/**
 *
 * @author Leonardo
 */
public class Sale {

    private static int nextid = 0;
    /**
     * Id da venda
     */
    protected int id;
    
    /**
     * Data da compra
     */
    protected String data;

    /**
     * Lista de CD's associados a compra
     */
    protected CD[] cd;

    /**
     * Preco final a pagar
     */
    protected int preco;

    public Sale (String tempdata, CD[] tempcd){

        id = nextid++;

        data = tempdata;
        cd = tempcd;
    }
}
