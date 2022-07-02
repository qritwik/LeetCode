class SnapshotArray {
    
    int snapId;
    HashMap<Integer, Integer>[] map;

    public SnapshotArray(int length) {
        snapId = 0;
        map = new HashMap[length];
        for(int i = 0; i < length; i++) {
            map[i] = new HashMap<>();
        }
    }
    
    public void set(int index, int val) {
        map[index].put(snapId, val);
    }
    
    public int snap() {
        snapId++;
        return snapId - 1;
    }
    
    public int get(int index, int snap_id) {
        while(snap_id >= 0) {
            if(map[index].containsKey(snap_id)) {
                return map[index].get(snap_id);
            }
            snap_id--;
        }
        return 0;
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */