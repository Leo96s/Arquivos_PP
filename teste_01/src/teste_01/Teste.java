/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_01;

import java.util.Objects;

/**
 *
 * @author Leonardo
 */
public class Teste {
    private static int nextidd;
    
    private int id;
    
    private String name;
    
    private String datebirth;
    
    private String nationality;

    public Teste(String name, String datebirth, String nationality) {
        this.id = nextidd++;
        this.name = name;
        this.datebirth = datebirth;
        this.nationality = nationality;
    }

    public Teste(String name) {
        this.id = nextidd++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatebirth() {
        return datebirth;
    }

    public void setDatebirth(String datebirth) {
        this.datebirth = datebirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Teste{" + "id=" + id + ", name=" + name + ", datebirth=" + datebirth + ", nationality=" + nationality + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teste other = (Teste) obj;
        
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        
        return true;
    }
    
    
    
    
}
