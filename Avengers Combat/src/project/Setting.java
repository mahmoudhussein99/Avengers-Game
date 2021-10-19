package project;

public class Setting {
    private int bgpic;
    private int bgmusic;
    private int minDim, maxDim;
    
    public Setting(int pic, int music,int mind,int maxd )
    {
        this.bgpic= pic;
        this.bgmusic= music;
        this.minDim= mind;
        this.maxDim= maxd;
    }

    
    public int getBgpic() {
        return bgpic;
    }

    
    public void setBgpic(int bgpic) {
        this.bgpic = bgpic;
    }

    
    public int getBgmusic() {
        return bgmusic;
    }

        public void setBgmusic(int bgmusic) {
        this.bgmusic = bgmusic;
    }

   
    public int getMinDim() {
        return minDim;
    }

    
    public void setMinDim(int minDim) {
        this.minDim = minDim;
    }

    
    public int getMaxDim() {
        return maxDim;
    }

    
    public void setMaxDim(int maxDim) {
        this.maxDim = maxDim;
    }
    
}


