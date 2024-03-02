public interface Instituition extends Cloneable {

    public String getName();

    public String getEmail();

    public InstituitionType getType();

    public Contact getContact();

    public String getWebsite();

    public String getDescription();

    public void setWebsite(String string);

    public void setDescription(String string);

    public void setContact(Contact cntct);

    public void setType(InstituitionType it);

    public boolean equals(Object o);
}
