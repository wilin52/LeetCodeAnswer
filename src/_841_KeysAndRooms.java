import java.util.List;

/**
 * Created by wilin on 2018/6/1.
 */
public class _841_KeysAndRooms {
    /**
     * 分析： 其实这题就是一个图的遍历问题，当所有路径都走完了，如果有节点没有被访问到，那么为false。
     */
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int size = rooms.size();
        int[] open = new int[size]; // room open
        open[0] = 1;
        int[] use = new int[size];
        use[0] = 1; // key used.
        List<Integer> keys = rooms.get(0);
        for(Integer integer : keys){
            open[integer] = 1;
        }

        while(true){
            boolean completed = true;
            for(int i = 1; i < size; i++){
                if(open[i]  != use[i]){
                    use[i] = 1;
                    completed = false;
                    List<Integer> key = rooms.get(i);
                    for(Integer integer : key){
                        if(integer != i){
                            open[integer] = 1;
                        }
                    }
                }
            }

            if(completed){
                break;
            }
        }

        for(int i : open){
            if(i == 0){
                return false;
            }
        }

        return true;
    }
}
