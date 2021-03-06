package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    private String director;
    private int length;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public DigitalVideoDisc(String title){
        super(title);
     }

    public DigitalVideoDisc(String title, int length) {
        super(title);
        this.length = length;
    }

    public DigitalVideoDisc(String title, String category) {
        super(title, category);
    }
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    @Override
    public int compareTo(Media o) {
        DigitalVideoDisc DVD = (DigitalVideoDisc) o;
        if (DVD == null) {
            return 1;
        } else {
            if(this.getCost() == DVD.getCost()){
                if (this.getLength() > DVD.getLength()) {
                    return 1;
                } else if (this.getLength() < DVD.getLength()) {
                    return -1;
                }
            }else {
                if (this.getCost() > DVD.getCost()) {
                    return 1;
                } else if (this.getCost() < DVD.getCost()) {
                    return -1;
                }
            }
            return this.getTitle().compareTo(DVD.getTitle());
        }

    }
}
