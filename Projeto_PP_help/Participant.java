public interface Participant extends Cloneable {

    public String getName();

    public String getEmail();

    public Contact getContact();

    public Instituition getInstituition();

    public void setInstituition(Instituition instn);

    public void setContact(Contact cntct);

    public boolean equals(Object o);
}