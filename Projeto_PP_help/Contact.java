public interface Contact extends Cloneable {

    public String getStreet();

    public String getCity();

    public String getState();

    public String getZipCode();

    public String getCountry();

    public String getPhone();

    public boolean equals(Object o);
}
