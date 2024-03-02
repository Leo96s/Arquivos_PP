    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp08.stand;

/**
 *
 * @author Leonardo
 */
public class VehicleManagement {

    private Veiculo[] veiculos;
    private int count;

    public VehicleManagement() {
        this.veiculos = new Veiculo[10];
    }

    public void addVehicle(Veiculo value) {
        if (this.count == this.veiculos.length) {
            this.veiculos = this.extendsVehicle();
        }
        if (isEqual(value) == true) {
            System.out.println("Impossivel adicionar.");
        } else {
            this.veiculos[this.count++] = value;
        }

    }

    private Veiculo[] extendsVehicle() {
        int newLength = this.veiculos.length * 2;
        Veiculo[] newVeiculos = new Veiculo[newLength];
        for (int i = 0; i < this.veiculos.length; i++) {
            newVeiculos[i] = this.veiculos[i];
        }
        return newVeiculos;
    }

    public boolean isEqual(Veiculo veiculo) {
        for (Veiculo temp : this.veiculos) {
            if (temp != null) {
                if (veiculo.equals(temp) == false) {
                    return true;
                }
            }
        }
        return false;
    }

    public String typeCounter() {
        int carcount = 0, bikecount = 0, truckcount = 0;

        for (Veiculo temp : this.veiculos) {
            if (temp != null) {
                if (temp instanceof Automovel) {
                    carcount++;
                } else if (temp instanceof Motociclo) {
                    bikecount++;
                } else if (temp instanceof Pesado) {
                    truckcount++;
                }
            }
        }

        String str = "";
        str += "\nCarros: " + carcount;
        str += "\nMotas: " + bikecount;
        str += "\nCamioes: " + truckcount;

        return str;
    }

    @Override
    public String toString() {

        String str = "";
        
        str+= "-------------------------------------\n";
        for (Veiculo _veiculo : this.veiculos) {
            if (_veiculo != null) {
         
                if (_veiculo instanceof Automovel) {
                    Automovel automovel = (Automovel) _veiculo;   
                    str+= "**************************************\n";
                    str += automovel.toString();
                    str+= "\n*************************************\n";

                } else if (_veiculo instanceof Motociclo) {
                    Motociclo motociclo = (Motociclo) _veiculo;
                    str+= "**************************************\n";
                    str += motociclo.toString();
                    str+= "\n*************************************\n";

                } else if (_veiculo instanceof Pesado) {
                    Pesado pesado = (Pesado) _veiculo;
                    str+= "**************************************\n";
                    str += pesado.toString();
                    str+= "\n*************************************\n";

                } else {
                    System.out.println("Algum problema ocorreu.");
                }
            }
        }
        str+= "\n-------------------------------------";
        return str;
    }
}
