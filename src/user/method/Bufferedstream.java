package user.method;

import user.object.User;

import java.io.*;

public class Bufferedstream {
    public void input(User student){
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter("members.txt"));

            // w.write(student.getId());

            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("members.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void deleteByID(int id){
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter("members.txt"));



        }catch (IOException e){
            e.printStackTrace();
        }
    }
}