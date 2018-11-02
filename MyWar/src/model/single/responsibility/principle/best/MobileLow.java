package model.single.responsibility.principle.best;

import model.single.responsibility.principle.best.api.IMusicPlay;
import model.single.responsibility.principle.best.api.IPhotoTake;

public class MobileLow {

    private IMusicPlay musicPlay;
    private IPhotoTake photoTake;

    public IMusicPlay getMusicPlay() {
        return musicPlay;
    }

    public void setMusicPlay(IMusicPlay musicPlay) {
        this.musicPlay = musicPlay;
    }

    public IPhotoTake getPhotoTake() {
        return photoTake;
    }

    public void setPhotoTake(IPhotoTake photoTake) {
        this.photoTake = photoTake;
    }
}
