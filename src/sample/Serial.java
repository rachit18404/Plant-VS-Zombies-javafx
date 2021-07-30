package sample;

import java.io.*;
import java.util.HashMap;

public class Serial {
    public static void serialize(Level g) throws IOException, NotSerializableException {
        File filename = new File("listofGames.txt");
        HashMap<String, Level> savegames = new HashMap<String,Level>();
        try
        {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            savegames = (HashMap<String, Level>) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized ");
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }


            savegames.put(g.getname(),g);

            try {
                FileOutputStream file = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(file);
                out.writeObject(savegames);


                out.close();
                file.close();

                System.out.println("Serialized");
            } catch (IOException ex) {
                System.out.println("Caught");

            }
        }
    }

