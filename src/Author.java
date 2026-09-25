public class Author {

    private String Name;
    private String Biography;
    private int noOfBookPublished;

    //constructor
    public Author(String Name,String Biography,int noOfBookPublished)
    {
        this.Name=Name;
        this.Biography=Biography;
        this.noOfBookPublished=noOfBookPublished;
    }

    public String getName() {
        return Name;
    }



    public String getBiography() {
        return Biography;
    }

    public void setBiography(String biography) {
        Biography = biography;
    }

    public int getNoOfBookPublished() {
        return noOfBookPublished;
    }

    public void setNoOfBookPublished(int noOfBookPublished) {
        this.noOfBookPublished = noOfBookPublished;
    }







   String  getAuthorDetails()
    {
        return "name: "+Name+"\nBiography: "+Biography+"\nno of Book published: "+noOfBookPublished;
    }

    public String toString()
    {
        return " "+Name;
    }

}
