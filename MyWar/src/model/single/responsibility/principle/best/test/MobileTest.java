package model.single.responsibility.principle.best.test;

import model.single.responsibility.principle.best.MobileLow;
import model.single.responsibility.principle.best.MusicPlayLow;
import model.single.responsibility.principle.best.PhotoTakeLow;
import model.single.responsibility.principle.best.api.IMusicPlay;
import model.single.responsibility.principle.best.api.IPhotoTake;

public class MobileTest {

    public static void main(String[] args){

        IMusicPlay musicPlay = new MusicPlayLow();
        IPhotoTake photoTake = new PhotoTakeLow();




    }
}
