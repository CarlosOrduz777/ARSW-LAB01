package edu.eci.arsw.blacklistvalidator;

public class Busqueda extends Thread{
    private String[] blackList;


    public Busqueda(String[] blackList){
        this.blackList = blackList;
    }
    public void run(){
        HostBlackListsValidator ipValidator = new HostBlackListsValidator();
        for (int i = 0; i <blackList.length ; i++) {
            ipValidator.checkHost(blackList[i]);
        }
    }
}
