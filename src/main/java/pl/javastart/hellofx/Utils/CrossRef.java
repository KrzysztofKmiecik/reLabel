package pl.javastart.hellofx.Utils;

public class CrossRef {


    private String currentAPN = null;
    private String newAPN = null;


    public String getCurrentAPN() {
        return currentAPN;
    }

    public void setCurrentAPN(String currentAPN) {
        this.currentAPN = currentAPN;
    }

    public String getNewAPN() {
        return newAPN;
    }

    public void setNewAPN(String newAPN) {
        this.newAPN = newAPN;
    }

    @Override
    public String toString() {
        return "CrossRef{" +
                "curentAPN='" + currentAPN + '\'' +
                ", newAPN='" + newAPN + '\'' +
                '}';
    }
}
