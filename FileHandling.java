import java.io.File;

public class FileHandling {

    public void writeArrayListToFile() {
        try {
            String file = "C:\\Users\\User\\Documents\\Coursedia File\\CoursediaData.txt";

            FileOutputStream fout = new FileOutputStream(file);
            ObjectOutputStream oout = new ObjectOutputStream(fout);

            //WRITE ARRAYLIST OBJECT INTO FILE
//            oout.writeObject(<ArrayList>);
            //System.out.println("FILE WRITING DONE....");
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.print(e.toString());
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }

    public void readArrayListFromFile() {
        try {
            String file = "C:\\Users\\User\\Documents\\Coursedia File\\CoursediaData.txt";

            FileInputStream fin = new FileInputStream(file);
            ObjectInputStream oin = new ObjectInputStream(fin);

            //READ DATA FROM FILE AND STORE IT IN ARRAYLIST
            courseList = (ArrayList<Course>) oin.readObject();
            //System.out.println("READING FROM FILE COMPLETED....");
        } catch (FileNotFoundException e) {
            pllist = new ArrayList<FootballModel>();
        } catch (IOException e) {
            System.out.println();
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }

    public static void main(String[] args) {

    }
}
