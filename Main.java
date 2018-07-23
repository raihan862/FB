import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        User rai = new User("raihan", "171", "Rai");
        User kabir = new User("kabir", "172", "kabir");
        User polash = new User("polash", "173", "polash");

        Articles raiA = new Articles("Frist post", "I use FB", "7/21/2018");

        Articles raiA1 = new Articles("2nd post", "I love FB", "7/21/2018");

        List<Articles> ar = new ArrayList<>();
        ar.add(raiA);
        ar.add(raiA1);
        List<User> raiviewer = new ArrayList<>();
        raiviewer.add(rai);
        raiviewer.add(polash);
        raiA.setViewer(raiviewer);


        Reaction raireaction =new Reaction(rai,2);
        Reaction raireaction1= new Reaction(kabir,3);
        List<Reaction> rr=new ArrayList<>();
        rr.add(raireaction);
        rr.add(raireaction1);
        raiA.setReaction(rr);

        Commend raicom=new Commend(polash, "This is frist commend");
        Commend raicom2=new Commend(kabir, "This 2nd commend");
        List<Commend> comlist=new ArrayList<>();
        comlist.add(raicom);
        comlist.add(raicom2);
        raiA.setCommend(comlist);

        rai.setArticle(ar);


        Articles koA = new Articles("3rd", "I hate FB", "7/21/2018");

        List<Articles> ar1 = new ArrayList<>();
        ar1.add(koA);
        List<User> koviewer = new ArrayList<>();
        koviewer.add(rai);
        koviewer.add(polash);
        koA.setViewer(koviewer);

        Reaction koreaction =new Reaction(polash,2);
        Reaction koreaction1= new Reaction(kabir,3);
        List<Reaction> rr1=new ArrayList<>();
        rr1.add(koreaction);
        rr1.add(koreaction1);
        koA.setReaction(rr1);






        kabir.setArticle(ar1);

        Articles poA = new Articles("4th", "I am not use FB", "7/21/2018");
        List<Articles> ar2 = new ArrayList<>();
        ar2.add(poA);

        List<User> poviewer = new ArrayList<>();
        poviewer.add(rai);
        poA.setViewer(poviewer);
        polash.setArticle(ar2);


        List<User> users = new ArrayList<>();
        users.add(rai);
        users.add(kabir);
        users.add(polash);


        for (User u : users) {
            System.out.println("Author: " + u.getName());
            if (u.getArticle() != null)
                for (Articles article : u.getArticle()) {
                    System.out.println("Article: " + article.getBody());
                    if (article.getViewer() != null)
                        for (User viewer : article.getViewer()) {
                            System.out.println("Viewer: " + viewer.getName());
                        }
                    else{
                        System.out.println("Sorry, no viewer found");}

                    if(article.getReaction()!=null)
                        for(Reaction r: article.getReaction()) {
                            System.out.println("reaction :" + r.getRetype());
                           System.out.println("reacted user:"+r.getReuser().getName());
                        }

                    else{
                        System.out.println("Reaction not found");}


                        if (article.getCommend()!=null){
                        for(Commend c:article.getCommend()){
                            System.out.println("Commented user :"+c.getCommuser().getName());
                            System.out.println("Commend body:"+c.getCombody());
                        }

                        }
                        else
                            System.out.println("Commend not found");

                }




            else
                System.out.println("Sorry, no article found");

        }
    }



    }



