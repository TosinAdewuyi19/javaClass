public class CombineLists {
    public static void main(String[] args) {
        String[] list1 = {"a", "b", "c"};
        Integer[] list2 = {1, 2, 3};
        Object[] combinedList = combineAlternating(list1, list2);
	 
        	for (Object item : combinedList) {
            System.out.print(item + " ");
        }
    }

    public static Object[] combineAlternating(Object[] list1, Object[] list2) {
        Object[] combinedList = new Object[list1.length + list2.length];
        int index = 0;
        for (int count = 0; count < list1.length; count++) {
            combinedList[index++] = list1[count];
            combinedList[index++] = list2[count];
        }
        return combinedList;
    }
}
