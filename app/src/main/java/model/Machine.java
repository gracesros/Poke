package model;

public class Machine {
    private int id;
    private NameUrlPair item;
    private NameUrlPair move;
    private NameUrlPair versionGroup;
    public Machine() {
        id = 0;
        item = new NameUrlPair();
        move = new NameUrlPair();
        versionGroup = new NameUrlPair();
    }
    public Machine(int id, NameUrlPair item, NameUrlPair move, NameUrlPair versionGroup) {
        this.id = id;
        this.item = item;
        this.move = move;
        this.versionGroup = versionGroup;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public NameUrlPair getItem() {
        return item;
    }
    public void setItem(NameUrlPair item) {
        this.item = item;
    }
    public NameUrlPair getMove() {
        return move;
    }
    public void setMove(NameUrlPair move) {
        this.move = move;
    }
    public NameUrlPair getVersionGroup() {
        return versionGroup;
    }
    public void setVersionGroup(NameUrlPair versionGroup) {
        this.versionGroup = versionGroup;
    }
}