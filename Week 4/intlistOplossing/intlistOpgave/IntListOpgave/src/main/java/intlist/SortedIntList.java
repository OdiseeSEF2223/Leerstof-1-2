package intlist;

public class SortedIntList extends IntList {

    @Override
    public void add(final int element){
        int index = 0;

        for(; index < list.size(); index ++){
            if(element < list.get(index)){
                break;
            }
        }

        System.out.println();
        System.out.println(list);
        System.out.println(index);
        list.add(index, element);
        System.out.println(list);
    }
}
